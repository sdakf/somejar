package pl.sda.somejar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String path = args[0];
        System.out.println(args[1]);

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            String firstLine = scanner.nextLine();
            String secondLine = scanner.nextLine();
            if (firstLine.length() == secondLine.length()) {
                char[] firstArray = firstLine.toCharArray();
                Arrays.sort(firstArray);
                char[] secondArray = secondLine.toCharArray();
                Arrays.sort(secondArray);
                System.out.println(Arrays.equals(firstArray, secondArray));
            } else {
                System.out.println("false");
            }
        }
    }
}