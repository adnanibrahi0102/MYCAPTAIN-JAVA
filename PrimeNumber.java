package com.captain;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER THE NUMBER");
        int n = sc.nextInt();
        int i=1,c=0;
        for(i=1;i<=n;i++) {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println(n+" is a PRIME NUMBER");
        }
        else
        {
            System.out.println(n+" is a NOT a PRIME NUMBER");
        }
    }
}



