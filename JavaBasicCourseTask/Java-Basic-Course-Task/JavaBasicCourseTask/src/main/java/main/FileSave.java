package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileSave {

    public static void fileSave(String equation) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("Saves", true));
        writer.append(equation);
        writer.append("\n");

        writer.close();
    }
}