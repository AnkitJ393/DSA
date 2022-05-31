package com.oopz.Mathematics;

import java.util.Scanner;

public class Mathematics_questions_Practice {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int result=Mathematics_questions_Practice.digitsInFactorial(n);
        System.out.println(result);
    }

    //Program to print Digits in Factorail T.C O(n) using logbase 10 approach
    public static int digitsInFactorial(int N){
        // code here
        if(N<=1){
            return 1;
        }
        double digits=0;
        for(int i=2;i<=N;i++){
            digits += Math.log10(i);
        }
        return ((int)Math.floor(digits)+1);
    }
}
