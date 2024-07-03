package org.example;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class ReadCSVFile {
    public static void main(String[] args) {
        try (CSVReader csvReader = new CSVReader(new FileReader("C:\\Users\\lenovo\\Desktop\\java.csv"))) {
            String[] lines;
            while ((lines = csvReader.readNext()) != null) {
                System.out.println("Names:"+lines[0]);
                System.out.println();
                System.out.println("Email:"+lines[1]);
                System.out.println();
                System.out.println("PhoneNo:"+lines[2]);
                System.out.println();
                System.out.println("Contry:"+lines[3]);
                System.out.println();
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
}
