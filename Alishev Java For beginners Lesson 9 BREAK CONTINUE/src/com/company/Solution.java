package com.company;

import javax.xml.bind.SchemaOutputResolver;
import java.io.Serializable;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
//        int i = 0;
//        while(true) {
//            if (i==15) {
//                break;
//            }
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("We've got out!");

        for(int i=0;i<=15;i++) {
            if(i%2==0) {
                continue;
            }
            System.out.println("That's odd number " + i);
        }
    }
}
