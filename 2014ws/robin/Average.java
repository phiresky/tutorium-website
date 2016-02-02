package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Average {
    static double average(String line) {
        int sum = 0;
        String[] split = line.split(",");
        for (int i = 0; i < split.length; i++) {
            sum += Integer.parseInt(split[i]);
        }
        double avg = ((double) sum) / split.length;
        return avg;
    }

    public static void main(String[] args) {
        try {
            BufferedReader b = new BufferedReader(new FileReader(args[0]));
            while (b.ready()) {
                System.out.println(average(b.readLine()));
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
            e.printStackTrace();
        }
    }
}
