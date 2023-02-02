package fa.training.excerises2;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Input first number: ");
            int firstNumber = sc.nextInt();
            System.out.print("Input second number: ");
            int secondNumber = sc.nextInt();
            System.out.print("Input third number: ");
            int thirdNumber = sc.nextInt();
            System.out.print("Input fourth number: ");
            int fourthNumber = sc.nextInt();
            if(firstNumber == secondNumber && secondNumber == thirdNumber && thirdNumber == fourthNumber) {
                System.out.println("Numbers are equal!");
            }else {
                System.out.println("Numbers are not equal!");
            }
        }catch (Exception e){
            System.out.println("Please input integer number!");
        }
    }
}
