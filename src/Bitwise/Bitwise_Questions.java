package Bitwise;

import java.util.Scanner;

public class Bitwise_Questions {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
//        int n=scn.nextInt();
        int[] arr={3,4,5,4,4,4,6,7,7,3};
        String str="abc";
//        int k=scn.nextInt();
        Bitwise_Questions.TwoOddOccuringNumberInAnArray(arr);
        int x=(3 / 2) * 4;
        System.out.println(x);
//        System.out.println(result);
    }

    // Two Odd Occuring Efficitn Approach
    public static  void TwoOddOccuringNumberInAnArray(int[] arr){
        int n=arr.length;
        int r1=0,r2=0,XOR=0;
        for (int j : arr) {
            XOR = XOR ^ j;
        }
        int lastSetBitfromRight=XOR & ~(-XOR);

        for (int j : arr) {
            if ((j & lastSetBitfromRight) != 0) {
                r1 = r1 ^ j;
            } else {
                r2 = r2 ^ j;
            }
        }
        System.out.println(r1+" "+r2);
    }


    // Power Set using Bitwise  //  I/p=>"abc"    O/p=>"" a ab b c bc abc     this using Bitwise
    public  static void PowerSetofString(String str){
        int n=str.length();
        int power=Bitwise_Questions.PoweerofNumber(2,n);
        for(int i =0;i<power;i++){
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }

    //Function to find position of first set bit in the given number
    public static int getFirstSetBit(int n){
       if(n==0)return 0;
        else{
            int k=0;
            while(true){
                if((n & (1<<k))!=0){
                    return k+1;
                }
                k++;
            }

        }
    }

    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
        if(m==n)return -1;
        int k=1;
        while(m%2==n%2){
            k++;
            m=m>>1;
            n=n>>1;
        }
        return k;
    }

    public static int PoweerofNumber(int a,int n){
        int result=1;
        while(n>0){
            if((n&1)==1)
                result=result*a;

            a=a*a;
            n=n/2;
        }
        return result;

    }



    //one Odd occuring number in an array
    public static int  OneOddOccuring(int[] arr){
        int result=0;
        for (int j : arr) {
            result = result ^ j;

        }
        return result;
    }


    // Given an array of N number , that has values in range[1..n+1]. Every number appear exactly once. Hence one number is missing,Find the missing number.
    public static int Variation_Of_OneOddOccuring(int []arr){
        int result=0, result1=0;
        for (int j : arr) {
            result = result ^ j;
        }
        for(int i=1;i<=arr.length+1;i++){
            result1=result1^i;
        }
        return result^result1;
    }

    // Check if a  number is a Power of 2
    public static boolean PowerofTwo(int n){
//        if(n==0 || n==1)return false;
        return ((n!=0) && (n&(n-1))==0);
    }



    // Count SET BITS in a 32 bit number   TC=>  O(1)
    public static int  LookUptableMethod(int n){
        int[] table=new int[256];
        table[0]=0;
        for(int i=1;i<256;i++){
            table[i]=(i&1) + table[i/2];   //  doing an and operation of Ith number and adding it to the number of set bits in its half4

        }   // this above part is preproceesed it is required for achieving constant Time Complexity

        int result=table[n&0xff];
        n=n>>8;  // shifting last eight bits;   ff is Hexadecimal representation of 8 set bits
        result=result+table[n&0xff]; // doing and operation of last eight bits with
        n=n>>8;
        result=result+table[n&0xff];
        n=n>>8;
        result=result+table[n&0xff];


        return result;


    }

    public static boolean checkKthBitisSet(int n, int k){
        // using left shift operator
//        return (n & (1 << (k - 1))) != 0;

        // using right shift operator
        return ((n >> (k - 1)) & 1) == 1;
    }


}


