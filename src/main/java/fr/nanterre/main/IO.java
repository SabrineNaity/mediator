package fr.nanterre.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {

    public static String menu() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Pour Afficher pour chaque enseignant, son nombre total d’heures assurées tapez 1");
        System.out.println("Pour Retourner le nombre d’étudiants dont le pays de Provenance est la ‘France’ tapez 1");
        System.out.println("Pour Afficher le nombre de cours par Type (CM, TD ou TP) tapez 3");
        String Choice = reader.readLine();
        return Choice;

    }


}
