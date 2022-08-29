// problem: https://www.hackerrank.com/challenges/java-loops/problem

import java.util.*;
import java.io.*;
import java.lang.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int q =in.nextInt();
        
      for(int i=0; i<q ; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for(int j=0; j<n; j++) {
                double total = a;
                for(int k = 0; k <= j; k++) {
                    total += b * Math.pow(2,k) ;
                    
                }
                int intTotal = (int) total;
                System.out.print(intTotal + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
