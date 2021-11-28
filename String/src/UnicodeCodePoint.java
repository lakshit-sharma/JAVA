//Write a Java program to get the character (Unicode code point) at the given index within the String.

public class UnicodeCodePoint {

	public static void main(String[] args) {
//		given String
		String given = "w3resource.com";
		System.out.println("Given String - "+ given);
		
//		Function used - codePointAt()
		System.out.println("Character(Unicode Point) - "+given.codePointAt(1));
		System.out.println("Character(Unicode Point) - "+given.codePointAt(9));
		
//		Function Used - codePointBefore()
		System.out.println("Character (Unicode Point) - "+ given.codePointBefore(1));
		System.out.println("Character (Unicode Point) - "+ given.codePointBefore(9));
		
//		Write a Java program to count a number of Unicode code points in the specified text range of a String.
		System.out.println("Code Point Count - "+ given.codePointCount(1,10));

		
	}

}
