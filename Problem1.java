package com.company;

import java.util.*;

class Problem1 {
    public static void main(String[] args)
    {
        ArrayList<Integer> Collections = new ArrayList<Integer>();

        Collections.add(8);
        Collections.add(6);
        Collections.add(2);
        Collections.add(12);
        Collections.add(16;
        Collections.add(100);

        Iterator iterator = Collections.iterator();

        int sum = 0;
        Iterator<Integer>  iter = Collections.iterator();
        while ( iter.hasNext() ) {
            sum += iter.next();
        }

        System.out.println(sum);
    }
}