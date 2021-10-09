package com.starpattern;
import java.util.Scanner;
public class Patterns {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        // taking n as number;
        int n = sc.nextInt();
        for (int i=0; i<=n; i++){
            for (int k=i ; k<=n ; k++) {
                System.out.println(" ");
            }
            for (int j=0; j<=i; j++) {
                if(j==0 || j==i || i==n-1)
                System.out.print(" *");
                else
                    System.out.println(" ");
            }
            System.out.println();
            
        }
            
                
    }
}

