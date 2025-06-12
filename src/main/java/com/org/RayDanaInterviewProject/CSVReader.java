package com.org.RayDanaInterviewProject;

import java.io.*;
import java.util.*;

public class CSVReader {
    public static List<Item> readItemsFromCSV(String filename) {
        List<Item> items = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            boolean firstLine = true;
            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                String[] parts = line.split(",", -1);
                if (parts.length < 4) continue;
                String code = parts[0].trim();
                int type = Integer.parseInt(parts[1].trim());
                int amount = Integer.parseInt(parts[2].trim());
                String desc = parts[3].trim();
                items.add(new Item(code, type, amount, desc));
            }
        } catch (Exception e) {
            System.out.println("Failure message in reading CSV: " + e.getMessage());
        }
        return items;
    }
}

