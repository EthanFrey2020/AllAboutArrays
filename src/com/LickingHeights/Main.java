package com.LickingHeights;

import java.lang.reflect.Parameter;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int size = 10;
        int lowestNumber = 80;
        int highestNumber = 90;


        int[] array = createNumberArray(size, lowestNumber, highestNumber);
        String[]adjectives = {"Built", "Cocky", "Handsome", "Nasty"};
        String[]places = {"Gym", "Fenway Park", "Office", "School"};
        String[]people = {"Kevin Hart", "Dwayne Johnson", "Ronnie Dawson", "David Ortiz"};
        String[]verbs = {"driving", "working", "playing", "Talking"};
        String[]times = {"5 o'clock", "11:11", "4:44", "12:44"};
        String[]things = {"Lamborghini Aventador SVJ", "Baseball", "Stapler", "Shoe"};


//        printArray(array);
//        System.out.println("The sum of the array is " + sum(array));
//        System.out.println("The min of the array is " + min(array));
//        System.out.println("The max of the array is " + max(array));
//        System.out.println("After Bubble sort ");
//        printArray(bubbleSort(array));


//        Pattern1();
//        Pattern2();
//        Pattern3();
//        Pattern4();
//        Pattern5();


    }

    public static int[] createNumberArray(int size, int lowestNumber, int highestNumber) {
        int[] array = new int[size];

        //fill with random values
        for (int i = 0; i < size; i++) {
            array[i] = createRandomNumber(lowestNumber, highestNumber);
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static int createRandomNumber(int lowestNumber, int highestNumber) {

        int number = (int) ((Math.random() * (highestNumber - lowestNumber + 1)) + lowestNumber);
        return number;
    }

    public static int sum(int[] array){
        int sum = 0;

        for (int i=0; i<array.length; i++){
            sum += array[i];
        }

        return sum;
    }
    public static int min(int[] array){
        int min = array[0];
        for (int i=0; i<array.length; i++){
            if (array[i] < min) min = array[i];
        }
        return min;
    }
    public static int max(int[] array){
        int max = array[0];
        for (int i=1; i < array.length; i++){
            if (array[i]>max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void Pattern1(){
        for (int rows = 0; rows <6; rows++){

            for (int columns = 0; columns <6; columns++){
                System.out.print("*");
            }

            System.out.println();

        }



    }
    public static void Pattern2() {
        for (int rows = 1; rows <= 6; rows++) {

            for (int columns = 0; columns < 6; columns++) {
                System.out.print(rows);
            }

            System.out.println();

        }
    }
    public static void Pattern3(){
            for (int rows = 0; rows <6; rows++){

                for (int columns = 1; columns <= 6; columns++){
                    System.out.print(columns);
                }

                System.out.println();

            }



        }
    public static void Pattern4() {
        for (int rows = 1; rows <=7; rows++){

            for (int columns = 1; columns <= rows ; columns++){
                System.out.print("*");
            }

            System.out.println();

        }
    }
    public static void Pattern5(){
        for (int rows = 1; rows <7; rows++){

            for (int columns = 1; columns <= rows; columns++){
                System.out.print(columns);
            }

            System.out.println();

        }



    }


    public static int[] bubbleSort (int[] array){

        for (int i=0; i<array.length-1; i++){

            for (int j=i+1; j<array.length; j++){

                if (array[i] > array[j]){

                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }
        return array;
    }
    public static String randomword (String[] array){
        Random random = new Random();
        return array[random.nextInt(array.length)];
    }
    public static void sentenceGenerator(String[]people,String[]verbs,String[]places,String[]times,String[]adjectives,String[]things){
        System.out.println("I was " +randomword(verbs)+ "down the" +randomword(places));
        System.out.println("around " +randomword(times) + "with my best friend" +randomword(people));
    }

}







