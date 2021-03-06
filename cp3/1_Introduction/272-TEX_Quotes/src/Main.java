/**
 * 	Verdict	: Accepted
 * 	OJ	 	: UVA online judge
 * 
 * 	@author: absakDev 
 * 	@version: 25/5/2016
 */
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = "";
		boolean firstQuote = false;
		while(input.hasNextLine()) {
			str = input.nextLine();
			int len = str.length();
			for (int I = 0; I < len; I++) {
				if (str.charAt(I) == '\"') {
					if (firstQuote) {
						System.out.print("''");
						firstQuote = false;
					} else {
						System.out.print("``");
						firstQuote = true;
					}
				} else {
					System.out.print(Character.toString(str.charAt(I)));
				}
				
			}
			System.out.println();
		}
		input.close();
	}

}
