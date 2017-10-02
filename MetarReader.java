//Jeremy Herring
//IT313
//Project 1

import java.util.Scanner;

public class MetarReader {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter word for a one digit interget: ");
		String abbr = in.nextLine();

	





//init variable to empty string

		String word =" ";

//conditional statement

		if(abbr.equals("+")) {
			word = "Heavy ";
		}
		else if(abbr.equals("-")){
			word = "Light ";
		}
		else if(abbr.equals("B")){
			word = "Began ";
		}
		else if(abbr.equals("DZ")){
			word = "Drizzle ";
		}
		else if(abbr.equals("E")){
			word = "End ";
		}
		else if(abbr.equals("HZ")){
			word = "Haze ";
		}
		else if(abbr.equals("RA")){
			word = "Rain ";
		}
		else if(abbr.equals("SN")){
			word = "Snow";
		}
		else {
			word = "none";
		}

		if (word == "none"){
			System.out.println("Unknown abbreviation");
		}
		else {
			System.out.println("The word is " + word);
			in.close();
		}

	}

}