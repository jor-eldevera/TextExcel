import java.util.*;
public class Program {
	
	// Jorell Devera
	// AP Computer Science
	// Project 2 - TextExcel
	// Extra credit so far:
	// * None
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Spreadsheet spr = new Spreadsheet(7, 10);
		String input;
		
		System.out.println("Welcome to TextExcel!");
		System.out.println();
		// asking for input
		do {
			System.out.print("TextExcel\\> ");
			input = console.nextLine();
			
			// input handling
			if (input.equalsIgnoreCase("print")) {
				System.out.println(spr.sheet());
			}
			else if (input.indexOf("=") > -1) {
				String cellName = input.substring(0, input.indexOf(" "));
				String setCellSubstring = input.substring(input.indexOf("=") + 1);
				spr.setCell(cellName, setCellSubstring);
			}
		} while (!input.equals("quit"));

		System.out.println("Quitting...");
		console.close();
	}

}
