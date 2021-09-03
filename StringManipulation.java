import java.lang.*;
import java.util.*;

public class StringManipulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int skipno = sc.nextInt();
		String splitStr[] = str.split("[.]");
		for (int i = 0; i < splitStr.length; i++) {
			splitStr[i] = process(splitStr[i], skipno);
		}
		for (String string : splitStr) {
			System.out.print(string.concat(". "));
		}
	}

	static String process(String s, int n) {
		String str[] = s.split(" ");
		String reverse = "";
		int m = n + 1;
		if ((str.length == n) || (str.length < n)) {
			return s;
		} else {
			for (int i = str.length - m; i >= 0; i--) {
				reverse += str[i] + " ";
			}
			/* System.out.println("Reversed String: " + reverse); */
			String ans = "";
			for (int i = str.length - n; i <= str.length - 1; i++) {
				ans += str[i] + " ";
			}
			
			return reverse.trim().concat(" "+ans).trim();
		}
	}
}