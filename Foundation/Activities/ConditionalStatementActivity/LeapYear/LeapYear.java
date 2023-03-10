package Foundation.Activities.ConditionalStatementActivity.LeapYear;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int year = reader.nextInt();
        reader.close();
        
        if(year % 400 == 0){
            System.out.println(year+" is a leap year");
        }
        else if(year % 4 == 0 && year % 100 != 0){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }
    }
}
