package org.peng;

import java.net.URL;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("this is main...");
        URL url = Main.class.getResource("/ds1.properties");
        System.out.println("1 url : " + url);
        url = ClassLoader.getSystemResource("ds1.properties");
        System.out.println("2 url : " + url);
    }
}
