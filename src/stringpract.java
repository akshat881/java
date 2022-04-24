import java.util.*;
class stringpract
{
    public static void main(String args[])
    {
        String original, reverse = ""; // Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original==reverse)
            System.out.println(reverse);
        else
            System.out.println("Entered string/number isn't a palindrome.");
    }
}