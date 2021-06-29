package com.galaxy;

/**
 * @author lane
 * @date 2021年06月27日 下午9:45
 */
public class Test {
    public static void main(String[] args) {

        double random = Math.random();
        System.out.println(random);
        double i =   random*(1000000-100000)+100000;
        String s = String.valueOf(i);
        System.out.println(s.substring(0,6));

    }
}
