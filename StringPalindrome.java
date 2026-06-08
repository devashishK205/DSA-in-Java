// This code checks if a given string is a palindrome or not. 
// A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward (ignoring spaces, punctuation, and capitalization).

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the string to check palindrome : ");
        String strpd = sc.nextLine();

        StringBuilder sb = new StringBuilder(strpd);  // Copies the contents of strpd into sb

        String rev = sb.reverse().toString(); //reverse() reverses the string stored in sb  (hello → olleh) 
                                             // toString() Converts the StringBuilder (workspace) object back into a String, To convert it into a normal string (rev = "olleh")

        if(strpd.equals(rev)){  //Compares the original string with the reversed string.
            System.out.println("given string is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
        sc.close();

    }
    
}
