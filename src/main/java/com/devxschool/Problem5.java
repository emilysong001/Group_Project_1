package com.devxschool;

public class Problem5 {
    /**
     * Given a string, print true if the string starts with "hi" and false otherwise.
     * Below are some Strings you can test
     * hint use substring function and if statements
     */
    public static void main(String[] args) {
        String string1 = "Hi";
        String string2 = "This string does not start with Hi";
        String string3 = " Hi";
        String string4 = "Hi123";
        //TODO write program below

        //System.out.println(string1.substring(0,1));
        //System.out.println(string2.substring(0,2));
        //System.out.println(string3.substring(0,2));
        //System.out.println(string4.substring(0,2));

        String[] myArr ={"Hi", "This string does not start with Hi", "Hello", "HIBYE", " Hi", "Hi my name is vlad"};
        System.out.println(myArr[1]);
        System.out.println(myArr.length);

        for(int i = 0; i<myArr.length; i++){
            String myStr = myArr[i].substring(0,2);
            System.out.println(myStr);
            if(myStr.equals("Hi")){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }



        if (string1.substring(0, 2).equals("Hi")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (string2.substring(0, 2).equals("Hi")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (string3.substring(0, 2).equals("Hi")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (string4.substring(0, 2).equals("Hi")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (string1.substring(0, 2).equals("hi")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (string2.substring(0, 2).equals("hi")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (string3.substring(0, 2).equals("hi")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (string4.substring(0, 2).equals("hi")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println(string1.startsWith("Hi"));
        System.out.println(string2.startsWith("Hi"));
        System.out.println(string3.startsWith("Hi"));
        System.out.println(string4.startsWith("Hi"));
    }
}
