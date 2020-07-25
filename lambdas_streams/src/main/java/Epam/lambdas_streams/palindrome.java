package Epam.lambdas_streams;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class palindrome {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter n: ");
		int num = s.nextInt();
		List<String> l = new ArrayList<String>();
		for(int i = 0; i < num; i++) {
			String e = s.next();
			l.add(e);
		}
			
		System.out.println("Palindrome strings :");
		List<String> res = palindromes(l);
		System.out.println(res);

		}

		public static List<String> palindromes(List<String> list) {
			List<String> res = list.stream().filter(str -> str.equals(rev(str))).collect(Collectors.toList());
			return res;
		}

		public static String rev(String str) {
			String reverse = "";
			for(int i = str.length()-1; i >= 0; i--) {
				reverse += str.charAt(i);
			}
			return reverse;
		}

	}



