package com.company;

import java.util.Map;
import java.util.TreeMap;

public class Problem3 {
    public static void main(String[] args) {

        Date d1 = new Date(2, 01, 2002);
        Date d2 = new Date(10, 02, 2001);
        Date d3 = new Date(6, 11, 2003);
        Date d4 = new Date(4, 30, 2006);

        TreeMap<Date, String> syllabus = new TreeMap<>();
        syllabus.put(d1, "Java");
        syllabus.put(d2, "C");
        syllabus.put(d3, "C++");
     

        for(Map.Entry<Date, String> entry: syllabus.entrySet()){
            if(entry.getKey().month == 9 && entry.getKey().year == 2002)
                System.out.println(entry.getValue());
        }

    }
}