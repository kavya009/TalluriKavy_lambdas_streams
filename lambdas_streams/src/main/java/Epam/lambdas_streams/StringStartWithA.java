package Epam.lambdas_streams;

	import java.util.*;
	import java.util.stream.Collectors;

	public class StringStartWithA {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter n: ");
		int num = s.nextInt();
		List<String> li = new ArrayList<String>();
		for(int i = 0; i < num; i++) {
		String element = s.next();
		li.add(element);
		}
		System.out.println("Strings starting with letter 'a' and length 3 are : ");
		List<String> res = StringStartWithA(li);
		System.out.println(res);
		}

		private static List<String> StringStartWithA(List<String> list) {
		List<String> res = list.stream().filter(str -> str.startsWith("a") && str.length() == 3).collect(Collectors.toList());
		return res;
		}

		}


