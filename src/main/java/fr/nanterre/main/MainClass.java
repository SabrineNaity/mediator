package fr.nanterre.main;

import fr.nanterre.extractor.XMLExtractor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
    public static void main(String[] args) throws IOException {
        String choice = IO.menu();
        if (choice.equals("1")) {
            XMLExtractor parser = new XMLExtractor();
            parser.loadAll();
        }
    }
}
