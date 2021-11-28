/*Write a Java program to compare two strings lexicographically. Two strings are lexicographically equal if 
they are the same length and contain the same characters in the same positions. */

public class CompareStringsLexicographically {

	public static void main(String[] args) {
		String givenStr1 = "This is Exercise 1";
		String givenStr2 = "This is Exrecise 2";
		System.out.println("program 1\n");
		int result  = givenStr1.compareTo(givenStr2);
		if (result < 0)
        {
            System.out.println("\"" + givenStr1 + "\"" +
                " is less than " +
                "\"" + givenStr2 + "\"");
        }
        else if (result == 0)
        {
            System.out.println("\"" + givenStr1 + "\"" +
                " is equal to " +
                "\"" + givenStr2 + "\"");
        }
        else // if (result > 0)
        {
            System.out.println("\"" + givenStr1 + "\"" +
                " is greater than " +
                "\"" + givenStr2 + "\"");
        }
//		Write a Java program to compare two strings lexicographically, ignoring case differences.
		
		System.out.println("\n program 2\n");

		String givenStr3 = "This is exercise 1";                                                                                  
		String givenStr4 =  "This is Exercise 1"; 
		int result2 = givenStr3.compareToIgnoreCase(givenStr4); 
		
		if (result2 < 0)
        {
            System.out.println("\"" + givenStr1 + "\"" +
                " is less than " +
                "\"" + givenStr2 + "\"");
        }
        else if (result2 == 0)
        {
            System.out.println("\"" + givenStr1 + "\"" +
                " is equal to " +
                "\"" + givenStr2 + "\"");
        }
        else // if (result > 0)
        {
            System.out.println("\"" + givenStr1 + "\"" +
                " is greater than " +
                "\"" + givenStr2 + "\"");
        }
	}

}
