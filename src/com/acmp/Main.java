package com.acmp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        int number;
        String answer = "";

        File input = new File("input.txt");
        Scanner inputFile = new Scanner(input);
        number = inputFile.nextInt();

        int i = 1;
        while(answer.length() < number){
            answer += i;
            System.out.println(answer.length());
        }

        File output = new File("output.txt");
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(output);
            writer.print(answer.charAt(number-1));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            writer.flush();
            writer.close();
        }

    }
}
