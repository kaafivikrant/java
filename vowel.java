
import java.util.*;
public class vowel {
    public static void main(String[] args)
    {
        System.out.println("Enter a character");
        Scanner s= new Scanner(System.in);
        char ch= s.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println(ch+" is a vowel");
        }
        else
            System.out.println(ch+" is a consonant");
    }
    
}
/*
Enter a character
r
r is not a vowel
Enter a character
e
e is a vowel
*/

