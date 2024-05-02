//PRINTF
package printf;

public class Main {

	public static void main(String[] args) {
		//printf() method = > to control, format and display text to the console Window
		//					two arguments = format string + ( object / variable / value )
		//					% [] [] [] [] []

		//Format specifier = > % symbol 
		System.out.printf("%d This is a format string",123);
		System.out.println();
		//Conversion-characters
		/*d - decimal number 
		 * EXAMPLES:
		 * */
		
		boolean myBoolean =true;
		char myChar = '@';
		String myString = "Bro";
		int myInt = 50;
		double myDouble = 1000;
		// CONVERSION - CHARACTERS
		System.out.printf("%b", myBoolean);
		System.out.println();
		System.out.printf("%c" , myChar);
		System.out.println();
		System.out.printf("%d" , myInt);
		System.out.println();
		System.out.printf("%f", myDouble);
		System.out.println();
		//WIDTH
		//Will display a minimum number of characters to be written as output
		//%Ns
		System.out.printf("Hello %10s", myString);
		System.out.println();
		
		//PRECISION
		//sets number of digits of precision when outputting floating - point values
		//%.Nf
		System.out.printf("You have this much money %.2f", myDouble);
		
		//FLAGS
		/*adds an effect to output based on the flag  added to format specifier
		 * -    left-justify
		 * +	output a plus ( + ) or minus ( - ) sign for a numeric specifier
		 * 0 	numeric values are zero-padded
		 * , 	comma grouping separator if numbers > 1000
		 * */
		System.out.println();
		System.out.printf("You have this much money %20f", myDouble);
		
	}

}
