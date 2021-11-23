package com.jano;

import java.util.*;

public class Threads implements Runnable {
    String name;
    int time;
    Random r = new Random();  // imported from java.util.*

    public Threads(String x) {
        name = x;
        time = r.nextInt(999);
    }

    @Override
    public void run() {
        try {
            System.out.printf("%s is sleeping for %d\n", name, time);
            Thread.sleep(time);
            System.out.printf("%s is done\n", name);
        } catch(Exception e) {

        }
    }
}
