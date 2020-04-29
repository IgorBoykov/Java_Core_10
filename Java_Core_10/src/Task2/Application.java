package Task2;

public class Application {

	public static void main(String[] args) {

		String s = new String("¬вед≥ть слово з п'€ти букв");
		System.out.println(s.replaceAll("а", "-").replaceAll("о", "-").replaceAll("у", "-").replaceAll("и", "-")
				.replaceAll("≥", "-").replaceAll("е", "-"));

	}

}
