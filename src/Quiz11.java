/*
 * Hannah Kelly 
 * 9/13/18
 * Quiz 11 
 * String Functions
 */


		

import java.util.*;
public class Quiz11 {
	
	public static void main(String[] args) {
		
		
	    System.out.println("1. Take 2 String inputs from the user, using Scanner. The first string will be a line and the second string will be one word. Use appropriate scanner methods");
		System.out.println("Please enter something");
		Scanner sc = new Scanner(System.in);
       String input =sc.nextLine();
		System.out.println("Now please enter something else");
      String  input2 =sc.nextLine(); // should be "WORD" so its sc.next(); not sc.nextline(); 
      
       System.out.println("2. Print the length of the 2 Strings");
       System.out.println(input.length());
       System.out.print(input2.length());
       
       System.out.println("3. Check if the second string is a substring of the first string and print the result on the screen.");
       System.out.println(input.contentEquals(input2));
       
       System.out.println("4. Check if String1 starts with “a”.");
       System.out.println(input.startsWith("a"));
       
       System.out.println("5. Check if String1 ends with the text “DCI”. ");
       System.out.println(input.endsWith("DCI"));
       
       System.out.println("6. Check if String2 contains the word “UST”");
       System.out.println(input2.contains("UST"));
       
       System.out.println("7. Check if String1 starts and ends with the same character. Case sensitive.");
      char x = input.charAt(0); 
      int y = input.length();
      System.out.println(x == input.charAt(y-1));
      
    /* should be:*/
     // input.charAt(0) == input.charAt(input.length()-1);
      
    //  System.out.println(x==y);
    //  char y= input.length();
//      System.out.print(input.getChars(x, x, null, x));
      //System.out.println(input.endsWith(""));
       //System.out.println(input.charAt(1)= input.endsWith(""));
      
      System.out.println("8. Check if String1 and String2 are the same");
      System.out.println(input.equals(input2));
       
       System.out.println("9. Check if String1 and String2 are the same.");
       System.out.println(input.equalsIgnoreCase(input2));
       
       System.out.println(" 10.Prove that Strings are immutable. You can create and play around with as many Strings as you want!");
       
       System.out.println(input.toLowerCase());
       System.out.println(input.toUpperCase());
       System.out.println(input.indexOf(input));
     //  System.out.println(input2.);
       
       
       
       
       
       
/*       String input3 = sc.nextLine();
       System.out.print(input.startsWith(input3)+", "); //charAt
       
       System.out.print(input.endsWith(input3));*/
       /*       System.out.println("Do you want to see if the 2 of your strings are equal?");
       String  input4 =sc.nextLine();
       */
       
  /*     
       if(input4 == "yes") {
       		System.out.println(input.equals(input2)+", ");
       		System.out.print(input.equalsIgnoreCase(input2));
       		else {
       			break;
       		}
       	}
*/
       
      
		
	}
}
