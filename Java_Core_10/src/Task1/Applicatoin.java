package Task1;

import java.util.Scanner;

public class Applicatoin {

	public static void main(String[] args) throws MyException {

		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� � �'��� ����");
		String word = sc.next().toUpperCase();
		if (word.length() == 5) {
			StringBuffer sb = new StringBuffer(word);
			sb.reverse();
			String wordReverse = new String(sb);
			if (word.equalsIgnoreCase(wordReverse)) {
				System.out.println("����� " + word + " � ����������");
			} else {
				System.out.println("����� " + word + " �� � ����������");
			}
		} else {
			String message = "����� �� ���������� � �'��� ����";
			throw new MyException(message);
		}

	}
}
