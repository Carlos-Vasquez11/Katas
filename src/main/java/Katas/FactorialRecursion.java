package Katas;

import java.util.Scanner;

public class FactorialRecursion {

    public static int calculateFactorialRecursion(int num){

        if(num != 1){
            return num * calculateFactorialRecursion(num -1);
        } else{
            return num;
        }

    }

    public static void main(String[] args){
        int num;
        int factorial;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Enter a valid number to calculate the factorial: ");
            num = scanner.nextInt();
        }while(num < 0);
        factorial = calculateFactorialRecursion(num);

        System.out.printf("The factorial of %d is: %d",num,factorial);

    }

}
