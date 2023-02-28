package Foundation.PatternPrinting.PrepInstaPatt2;

import java.util.Scanner;

public class PrepInstaPatt2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=2*n+1; j++)
            {
                if((j>=i) && (j<=n+1+i))
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/*
4
******   
 ******  
  ****** 
   ******
 */