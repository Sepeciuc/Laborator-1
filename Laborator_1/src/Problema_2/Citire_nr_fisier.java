package Problema_2;
import java.io.*;
import java.util.*;

public class Citire_nr_fisier {
    public static void main(String[] args) {
        String inputFile = "in.txt";
        String outputFile = "out.txt";

        try {
            // Citire nr din fisier
            List<Integer> numbers = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
                String line;
                while ((line = br.readLine()) != null) {
                    numbers.add(Integer.parseInt(line));
                }
            }

            // Calculare valori
            int sum = numbers.stream().mapToInt(Integer::intValue).sum();
            double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
            int min = numbers.stream().mapToInt(Integer::intValue).min().orElse(Integer.MAX_VALUE);
            int max = numbers.stream().mapToInt(Integer::intValue).max().orElse(Integer.MIN_VALUE);

            // Afisare in consola
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);

            // Afisarea rezultatelor in fisierul out.txt
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
                bw.write("Sum: " + sum + "\n");
                bw.write("Average: " + average + "\n");
                bw.write("Minimum: " + min + "\n");
                bw.write("Maximum: " + max + "\n");
            }

            System.out.println("Results written to " + outputFile);
        } catch (IOException | NumberFormatException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
    
}
