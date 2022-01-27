package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    String[] arrayOfNames = {"John", "Anton", "Martha", "Kevin"};

    public static void main(String[] args) {


        Main main = new Main();

        main.stringIteration(main.arrayOfNames);








    }





    public void log(int[] numbers){
        int[] john = {1, 2, 3};
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

    public void stringIteration(String[] s){

        for (String names : s){
            System.out.println(names);
        }

    }








    }










