package com.org.RayDanaInterviewProject;

import java.util.*;

public class AccountingDoc {
    List<Item> items;

    public AccountingDoc(List<Item> items) {
        this.items = items;
    }

    public Result createDoc() {
        Set<String> itemSet = new HashSet<>();
        int totalDebtor = 0;
        int totalCreditor = 0;
        List<String> errors = new ArrayList<>();

        for (Item item : items) {
            String key = item.code + "_" + item.type;
            if (itemSet.contains(key)) {
                errors.add("آیتم تکراری با کد: " + item.code + " و نوع: " + item.type);
            }
            itemSet.add(key);
            if (item.type == 1) totalDebtor += item.amount;
            else if (item.type == 2) totalCreditor += item.amount;
            else errors.add("نوع نامعتبر برای آیتم با کد: " + item.code);
        }
        boolean valid = (totalDebtor == totalCreditor) && errors.isEmpty();
        return new Result(totalDebtor, totalCreditor, errors, valid);
    }


    public void printItemsStatus() {
        for (Item item : items) {
            String typeStr = (item.type == 1) ? "بدهکار" : (item.type == 2) ? "بستانکار" : "نامشخص";
            System.out.println("حساب: " + item.code + " | نوع: " + typeStr + " | مبلغ: " + item.amount + " | شرح: " + item.desc);
        }
    }
}

