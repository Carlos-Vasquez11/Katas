package Katas;

// 01/19/2023

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {

    public static boolean isPrimeNumber(int number){

        if(number < 2){
            return false;
        }

        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }

        return true;
    }

    public static ArrayList<Integer> primeNumbersLessThan(int number){
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for(int i = 2; i < number; i++){
            if(isPrimeNumber(i)){
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }
    
    public static void printArrayList(ArrayList<Integer> primeNumbers){
        for (Integer num : primeNumbers) {
            System.out.printf("%d ", num);
        }
    }

    public static void main(String Args[]){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        int num;

        System.out.println("Enter a valid number to calculate the prime numbers: ");
        num = scanner.nextInt();
        primeNumbers = primeNumbersLessThan(num);

        System.out.printf("The prime numbers less than %d are: ",num);
        printArrayList(primeNumbers);
    }
}
