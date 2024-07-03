package org.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreams {
    public static void main(String[] args) {
        FileReader reader = null;
        FileWriter writer = null;

        try {
            // Replace these paths with the actual file paths
            String sourceFilePath = "C:\\Users\\lenovo\\Desktop\\javaReader.txt";
            String destinationFilePath = "C:\\Users\\lenovo\\Desktop\\javaWriter.txt";

            reader = new FileReader(sourceFilePath);
            writer = new FileWriter(destinationFilePath);

            int data;
            while ((data = reader.read()) != -1) {
                writer.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
