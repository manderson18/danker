package com.company;

import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
    Scanner kbin = new Scanner(new File("src/scores.txt"));

        int maxIndex = -1;

        String text[] = new String[1000];

        while(kbin.hasNext()){
            maxIndex++;
            text[maxIndex] = kbin.nextLine();
        }

        for(int j = 0; j<=maxIndex; j++){

            //System.out.println(text[j]);
            //System.out.println(text[6]);
            System.out.println(text[j].lastIndexOf("601"));
        }
kbin.close();


    }
}
/*

for(int i =0; i <=maxIndex; i++){

        Scanner sc = new Scanner(text[i]);
        while(sc.hasNextInt()){
        int k = sc.nextInt();
        System.out.println(text[k]);

        }


        }

*/