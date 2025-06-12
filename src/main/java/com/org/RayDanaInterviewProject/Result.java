package com.org.RayDanaInterviewProject;

import java.util.*;

public class Result {
    int totalDebtor;
    int totalCreditor;
    List<String> errors;
    boolean valid;

    public Result(int totalDebtor, int totalCreditor, List<String> errors, boolean valid) {
        this.totalDebtor = totalDebtor;
        this.totalCreditor = totalCreditor;
        this.errors = errors;
        this.valid = valid;
    }

    public void printResult() {
        System.out.println("جمع بدهکار: " + totalDebtor);
        System.out.println("جمع بستانکار: " + totalCreditor);
        if (!errors.isEmpty()) {
            System.out.println("خطاها:");
            for (String err : errors) {
                System.out.println("- " + err);
            }
        }
        System.out.println(valid ? "سند معتبر است." : "سند نامعتبر است.");
    }
}
