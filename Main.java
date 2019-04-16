package p127;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter(" |\n");
		
		String _str[][] = new String[2][5];
		int _num[][] = new int[2][5];
		
		_str[0] = scan.nextLine().split(" ");
		_str[1] = scan.nextLine().split(" ");
		scan.close();

	}

}
