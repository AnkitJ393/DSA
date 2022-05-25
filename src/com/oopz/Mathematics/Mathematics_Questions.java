package com.oopz.Mathematics;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Scanner;

public class Mathematics_Questions {

    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        long start = System.nanoTime();
//        int g=Mathematics_Questions.LCM(a,b);
        double resutl=Mathematics_Questions.NPowXBE(a,b);
        long end = System.nanoTime();
        System.out.println(resutl);
        System.out.println(end-start);

    }



    // N power X =>  binary Exponentiation (Optimized Approach)
    public static double  NPowXBE(double x, int n){
        double res=1.0D;
        long power=n;
        if(n<0)power=(-1)*n;
        while(power>0){
            if(power%2!=0){
                res=res*x ;

            }
            System.out.println(x +" "+power);
            x=x*x;
            power=power/2;
            System.out.println(x +" "+power);
        }

        return res;


    }



    // Most Optimized way for Sieve of Eratorsthenes . Time Complexity O(n log(logn))
//    public static  void printPrimeNumberSOE(int n){
//        boolean[] isPrime=new boolean[n+1];
//        Arrays.fill(isPrime,true);
//
//        for(int i=2;i<=n;i++){
//            if(isPrime[i]){
//                System.out.print(i+" ");
//                for(int j=i*i;j<=n;j=i+j){
//                    isPrime[j]=false;
//                }
//            }
//        }
//    }


//    // Program to print all Divisors of a number  . Time complexity is O(sqrtn)
//    public static void allDivisors(int n){
//        int i=1;
//        for(;i*i<n;i++){
//            if(n%i==0) System.out.print(i+" ");
//        }
//        for(;i>=1;i--){
//            if(n%i==0) System.out.print((n/i)+" ");
//        }
//    }





//    // Program to print prime factors of a  number
//    public static void Primefactor(int n){
//        if(n<=1) System.out.println(1);
//        if(n%2==0){             // Handling condition for 2 and 3 , hence reducing a lot of Iteration for later program
//            while(n%2==0){
//                System.out.print(2+" ");
//                n=n/2;
//            }
//        }
//
//        if(n%3==0){
//            while(n%3==0){
//                System.out.print(3+" ");
//                n=n/3;
//            }
//        }
//
//        for(int i=5;i*i<=n;i=i+6){
//            while(n%i==0){
//                System.out.print(i+" ");
//                n=n/i;
//            }
//            while(n%(i+2)==0){
//                System.out.print((i+2)+" ");
//                n=n/(i+2);
//            }
//
//        }
//        if(n>3){
//            System.out.print(n+" ");
//        }
//    }

    // Proagram to check if the number is Prime or not
//    public static boolean isPrime(int n){
//        if(n==1)return false;
//        if(n==2 || n==3)return true;
//        if(n%2==0 || n%3==0)return false;
//        for(int i=5;i*i<=n;i=i+6){
//            if(n%i==0 || n%(i+2)==0)return false;
//        }
//        return true;   // time compleity worst case O(sqrt(n))
//    }


//    public static int LCM(int a ,int b) {
//        return (a*b)/HCF(a,b);   // OPTIMIZE LCM way  TC=> O(log min(a,b))
//
//    }
        //    NAIVE SOLUTION    int maxNumber=Math.max(a,b);
//        for(int i=maxNumber;i<=a*b;i=i+maxNumber){
//            if(i%a==0 && i%b==0){
//                return i;
//            }
//        }
//        return a*b;


    // HCF of two Number  EUCLIDEAN ALGORITHEM optimized for HCF
//    public static int HCF(int a,int b){
//        if(b==0){
//            return a;
//        }else{
//            return HCF(b,a%b);
//        }
//    }
//
//

//   //Trailing Zeroes of Factorial
//    public static int trailingzeroes(int n){
//        int counter=0;
//        for(int i=5;i<=n;i=i*5){
//            counter=counter+n/i;
//        }
//        return counter;   // TIme complexity O(log n)
//    }

    // Factorial of a number
//    public static int factorial(int n){
//        int factnumber=1;
//       for(int i=2;i<=n;i++){
//           factnumber=factnumber*i;
//
//       }            // Time complexity O(n)
//        return factnumber;
//
//        if(n==1 || n==0){
//            return 1;
//        }               // Time COmpelxity O(n)  but Auxiliary space O(n)  compared to O(1) for iterative solution
//        return n*factorial(n-1);
//    }

//    Whether the number is panlindrom or not
//    public static boolean PalindromeNumber(int n){
//        int rev=0;
//        int temp=n;
//        while(temp!=0){
//            rev=rev*10+temp%10;
//            temp=temp/10;
//        }                       //Time COmplexity O(n)
//        return rev == n;
//    }



    // Count number of Digits in a number
//    public static  int  CountDigit(int n){
//        int count=0;
//        while(n!=0){
//            n=n/10;
//            count++;
//        }
//        return count;          //  Time complexity O(n)
//    }


}
