package aqr.positioning;

/**
 *
 */
public class App
{
	public static void main(final String[] args ){
		validateArgs(args);





	}


	private static void validateArgs(final String[] args) {
		if(args.length != 2){
			System.out.println("Please provide two valid arguments.");
		}
	}
}
