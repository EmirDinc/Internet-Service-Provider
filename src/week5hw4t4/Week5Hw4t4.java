package week5hw4t4;

import java.util.Scanner;

public class Week5Hw4t4 {
    public static void main(String[] args) {
        final double packageA = 9.95;
        final double packageB = 13.95;
        final double packageC = 19.95;
        final int hourLimitA = 10;
        final int hourLimitB = 20;
        final double extraFeeA = 2.0;
        final double extraFeeB = 1.0;
        int hoursExtra = 0;
        double extraPrice = 0.0;
        double total = 0.0;
        String userPackage;
        
        Scanner keyIn = new Scanner(System.in);
        
        System.out.println("Which package have you purchased: ");
        userPackage = keyIn.nextLine();
        System.out.println("How many hours you used?");
        int hours = keyIn.nextInt();
        
        if (userPackage.equalsIgnoreCase("a")){
            if (hours > hourLimitA){
                hoursExtra = hours - hourLimitA;
                extraPrice = hoursExtra * extraFeeA;
            }
            total = packageA + extraPrice;
            
        } else if (userPackage.equalsIgnoreCase("b")){
            if (hours > hourLimitB){
                hoursExtra = hours - hourLimitB;
                extraPrice = hoursExtra * extraFeeB;
            }
            total = packageB + extraPrice;
        } else if(userPackage.equalsIgnoreCase("c")){
            total = packageC;
        }
        System.out.println("Your total charge is: $" + total);  
    }
    
}
