package Task1;

import java.util.Scanner;

public class Applicatoin {

	public static void main(String[] args) throws MyException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть слово з п'яти букв");
		String word = sc.next().toUpperCase();
		if (word.length() == 5) {
			StringBuffer sb = new StringBuffer(word);
			sb.reverse();
			String wordReverse = new String(sb);
			if (word.equalsIgnoreCase(wordReverse)) {
				System.out.println("Слово " + word + " є паліндромом");
			} else {
				System.out.println("Слово " + word + " не є паліндромом");
			}
		} else {
			String message = "Слово не складається з п'яти букв";
			throw new MyException(message);
		}

	}
}
