package test;

import java.io.*;

public class TodoList {
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.err.println("Fehlerhafter Aufruf");
            System.exit(0);
        }
        String filename = args[0];
        String personenname = args[1];
        System.out.println("Aufgaben von " + personenname);
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = in.readLine()) != null) {
            parseLine(line, personenname);
        }
        in.close();
    }

    private static void parseLine(String line, String name) {
        String[] lineParts = line.split(";");
        if (lineParts[0].equals(name))
            System.out.println(" - " + lineParts[1]);
    }
}
