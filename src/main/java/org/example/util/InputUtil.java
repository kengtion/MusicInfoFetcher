package org.example.util;

import java.util.Scanner;

public class InputUtil {

    public static String getInput(){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        return input;
    }
}
