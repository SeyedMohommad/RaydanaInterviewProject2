package com.org.RayDanaInterviewProject;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("101", 1, 50000, "بانک بدهکار"));
        itemList.add(new Item("202", 2, 50000, "درآمد فروش بستانکار"));

        AccountingDoc doc = new AccountingDoc(itemList);

        System.out.println("وضعیت آیتم‌های سند:");
        doc.printItemsStatus();

        System.out.println("\nبررسی و نتیجه سند:");
        Result result = doc.createDoc();
        result.printResult();



//        List<Item> itemList = CSVReader.readItemsFromCSV("items.csv");
//
//        AccountingDoc doc = new AccountingDoc(itemList);
//
//        System.out.println("وضعیت آیتم‌های سند:");
//        doc.printItemsStatus();
//
//        System.out.println("\nبررسی و نتیجه سند:");
//        Result result = doc.createDoc();
//        result.printResult();

    }
}