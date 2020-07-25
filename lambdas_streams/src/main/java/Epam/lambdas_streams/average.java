package Epam.lambdas_streams;

	import java.util.Scanner;
	import java.util.ArrayList;
	public class average {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("enter n: ");
			int num = s.nextInt();
			ArrayList<Integer> l = new ArrayList<Integer>();
			for(int i = 0; i < num; i++) {
				int e = s.nextInt();
				l.add(e);
			}
		System.out.println("Average of the list is :");
			double average= avgCal(l);
			System.out.println(average);
		}

		private static double avgCal(ArrayList<Integer> list) {
			double a = 0.0;
			a = list.stream().mapToDouble(i -> i).average().getAsDouble();
			return a;
		}

	}



