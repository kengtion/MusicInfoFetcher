package org.example;

import org.example.processor.ArgsProcessor;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArgsProcessor argsProcessor = new ArgsProcessor(args);
        argsProcessor.process();
        System.exit(0);
    }

}