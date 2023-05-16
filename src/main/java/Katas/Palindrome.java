package Katas;

/*Given an integer x, return true if x is a palindrome ,and false otherwise.
* Constraints:
* -231 <= x <= 231 - 1
*/

public class Palindrome {

  static boolean isPalindrome(int number){

    String numberString = Integer.toString(number);
    String palindrome = "";

    for(int i = 0; i < numberString.length(); i++){
      palindrome += numberString.charAt(numberString.length() - 1 - i);
    }

    return palindrome.matches(numberString);
  }

  public static void main(String args[]){
    System.out.println(isPalindrome(101));
  }
}
