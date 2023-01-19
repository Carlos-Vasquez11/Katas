package Katas;

// 01/18/2023

import java.util.Scanner;

public class FactorialNoRecursion {

    public static int calcularFactorial(int num){

        int result = 1;

        while(num > 0){
            result *= num;
            num--;
        }

        return result;
    }

    public static void main(String[] args){
        int num;
        int factorial;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Enter a valid number to calculate the factorial: ");
            num = scanner.nextInt();
        }while(num < 0);
        factorial = calcularFactorial(num);

        System.out.printf("The factorial of %d is: %d",num,factorial);

    }
}