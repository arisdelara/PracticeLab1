package com.company;

import java.util.*;

public class Problem2 {

    public static void main(String[] args) {

        Date d1 = new Date(3, 27, 2001);
        Date d2 = new Date(12, 11, 2003);
        Date d3 = new Date(7, 01, 2006);
        Date d4 = new Date(4, 15, 2020);


            if(d1.compareTo(d2) == 1)
                System.out.println(d1.month + "/" + d1.day + "/" + d1.year + " is later than " + d2.month + "/" + d2.day + "/" + d2.year );
            else if(d1.compareTo(d2) == -1)
                System.out.println(d1.month + "/" + d1.day + "/" + d1.year +" is earlier than " + d2.month + "/" + d2.day + "/" + d2.year  );
            else {
                System.out.println(d1.month + "/" + d1.day + "/" + d1.year + " and " + d2.month + "/" + d2.day + "/" + d2.year + " are the same dates");
            }

    }
}

