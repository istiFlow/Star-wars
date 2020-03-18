package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StarWars {

    private static List<ForceSensitive> listOfPlayers = new ArrayList<>();


    public StarWars() {
    }


    public static void actors() {

        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("./players.txt"));
            String line = bufReader.readLine();
            while (line != null) {
                listOfPlayers.add(objectMaker(line));
                line = bufReader.readLine();
            }
            bufReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ForceSensitive objectMaker(String line) {
        String[] arr = line.split(" ");
        if (arr[0].equals("anakin")) {
            AnakinSkywalker anakin = new AnakinSkywalker();
            wraithMaker(anakin, Integer.parseInt(arr[1]));
            return anakin;
        } else {
            Emperor empy = new Emperor();
            wraithMaker(empy, Integer.parseInt(arr[1]));
            return empy;
        }
    }

    private static void wraithMaker(ForceSensitive person, int num) {
        if (!(person instanceof Sith)) {
            return;
        }
        for (int i = 0; i < num; i++) {
            ((Sith) person).letOutYourWraith();
        }
    }

    public static void siths() {
        for (ForceSensitive fs : listOfPlayers) {
            System.out.println(fs.toString());
        }
    }
}
