package Task3;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		String s = new String("������ ����� � �'��� ���� ���� ����");

		System.out.println("������� ���������� � " + Number(s) + " ���");

		String[] s1 = s.split(" ");
		Arrays.sort(s1);

		String maxWord = "", word = "";
		int maxCount = 0, count = 1;
		for (String s2 : s1) {
			if (s2.equals(word)) {
				count++;
			} else {
				if (count > maxCount) {
					maxCount = count;
					maxWord = word;
				}
				word = s2;
				count = 1;
			}
		}
		if (count > maxCount) {
			maxWord = word;
		}
		System.out.println("������������v ������ � ����� " + maxWord.toUpperCase());
	}

	static int Number(String s) {
		String[] s3 = s.split(" ");
		return s3.length;
	}

}
