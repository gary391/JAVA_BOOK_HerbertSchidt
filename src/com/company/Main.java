
package com.company;

import javax.sound.midi.Soundbank;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        System.out.println("Hello world");
        String name = "Harry";
        System.out.println(name);
        int a = 45, x= 69, y= 99;
        float b = 3.5f;
        boolean isAdult = false;
        System.out.println(b);
        System.out.println(y);
        System.out.println(x);
        System.out.println(a);
        System.out.println(isAdult);

        byte u = -56;
        System.out.println(u);
        */
        /* Operators in Java

        Operand, Operator, Operand = Result
        4           +       7       = 11

        Type of operator in Java:

        Arithmetic Operator
        Assignment Operator
        Logical Operator
        Comparison Operator

        */
        /*
        int num1 = 45, num2 = 45;
        System.out.println("The value of num1 and num2 is ");
        System.out.println(num1 * num2);
        System.out.println(num1 - num2);
        System.out.println(num1 + num2);
        System.out.println(num1 % num2);
        System.out.println(num1 ++);
        System.out.println(num1 --);
        System.out.println(++num1);
        System.out.println(num1 / num2);
        */
        /*
        Comparison Operator
        Logical Operator
         */

        // Taking user input in Java
        // Scanner is method for getting user input
        // Here scan is an object of scanner class that take one argument i.e. system.in user input i.e input stream

        /*
        Scanner scan = new Scanner(System.in);
        System.out.printf("What is your name, please entry ?");
        // This is a variable (string type) assignment, where we are assigning value from the scan object method which
        // return an string value to input variable.

        //String input = scan.nextLine();
        String input = scan.next();
        System.out.println("Is it you " + input + " ?");

        */


//        String named  = "Gaurav";
//        String channel = "CodeWithHarry";
//        System.out.println (named.length());
//        System.out.println(named.toLowerCase());
//        System.out.println(named.toUpperCase());
//        System.out.println(named + " from\n " + channel);
//        System.out.println(named.contains("Gau"));
//        System.out.println(named.charAt(2));
//        System.out.println(named.endsWith("rav"));
//        System.out.println(named.indexOf("deep"));

//        int numb1 = 4, numb2 = 7;
//        System.out.println(Math.max(numb1, numb2));
//        System.out.println(Math.max(numb1, numb2));
//        System.out.println(Math.abs(-36));
//        // prints a random number between 0 and 1, which can't be 1 but can be 0
//        System.out.println(Math.random());
//        // For generating random number between 4 and 8, you can use the following line
//        System.out.println(4+(8-4)*Math.random());

        // If-Else conditionals
//            Scanner scan = new Scanner(System.in);
//            System.out.println("Enter your age: ");
//            int age = scan.nextInt(); // This is how user defined input are assigned to a variable.
//            if (age > 19){ // This gets converted to a true and false value at run time.
//                System.out.println("You are an Adult");
//            }
//            else if (age < 13){
//                System.out.println("You are a Kid!");
//            }
//            else{
//                System.out.println("You are a teenager");
//            }


        // Switch statement in Java

//            switch (age){
//                case 12:
//                    System.out.println("You are 12 years old");
//                    break; // If we don't use break it will execute all the cases below
//                case 56:
//                    System.out.println("You are 56 years old");
//                    break;
//                case 16:
//                    System.out.println("You are 16 old year old");
//                    break;
//                default:
//                    System.out.println("you did not match any of the cases");
           // }
        // Quick Quiz:Print Sunday to Saturday based on number 1 to 7 typed by the user

//            Scanner dayscan = new Scanner(System.in);
//                    System.out.println("Enter your day of the week: ");
//            int dayofweek = dayscan.nextInt();
//
//            switch(dayofweek) {
//                case 1:
//                    System.out.println("Monday");
//                    break;
//                case 2:
//                    System.out.println("Tuesday");
//                    break;
//                case 3:
//                    System.out.println("Wednesday");
//                    break;
//                case 4:
//                    System.out.println("Thursday");
//                    break;
//                case 5:
//                    System.out.println("Friday");
//                    break;
//                case 6:
//                    System.out.println("Saturday");
//                    break;
//                case 7:
//                    System.out.println("Sunday");
//                    break;
//            }

        // Loops
        /*
        While Loop
        While (Condition) {
            // This code will keep executing until the condition is true
         }
         */
//            int i = 0;
//            while ( i < 100){
//                System.out.println(i);
//                i += 1;
//            }
        /*
        Do While Loop
        do {
            // This code will keep executing until the condition is true
         */
//            int j = 0;
//            do{
//                System.out.println(j);
//                j +=1;
//            }while(j>100);

        /*
        For Loop

         */
//        for (int i= 0;i<=10;i++){
//
//            if (i==2){
//                continue;
//            }
////            else{
////                System.out.println(i);
////            }
//            System.out.println(i);
//
//        }

        // Java Arrays

        int [] marks = {1,2,3,4,5};
        marks[3] = 34; // This will update marks [3]
//        System.out.println(marks[3]);
        // Classical way to iternate an array
//        for (int i =0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        }
        // For each loop
        for(int value:marks){
            System.out.println(value);
        }
    }
}
