package com.str818.meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static List<String[]> raw = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String start = sc.next();
            String end = sc.next();
            raw.add(new String[]{start, end});
        }
        System.out.println(judge(n));
    }
    public static int judge(int n){
        int count = 0;
        String start = null;
        String end = null;
        for (int i = 0; i < raw.size(); i++) {
            if (start == null) {
                start = raw.get(i)[0];
                end = raw.get(i)[1];
                continue;
            }
            if (start.equals(end)) {
                count++;
                start = raw.get(i)[0];
                end = raw.get(i)[1];
                continue;
            }
            if (end.equals(raw.get(i)[0])){
                end = raw.get(i)[1];
            }
        }
        if (start != null && end != null && start.equals(end)) {
            count++;
        }
        return count;
    }
}
