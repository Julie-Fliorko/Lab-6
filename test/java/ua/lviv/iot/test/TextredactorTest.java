package ua.lviv.iot.test;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

import ua.lviv.iot.TextRedactor;

public class TextredactorTest {

	@Test
	public void testAdressFormating() {
//i live in a beautiful place Lviv, str Naukova, 7b this is where i live
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type your text to check: ");
		String inputText = scanner.nextLine();
		TextRedactor formater = new TextRedactor();
		assertEquals("i live in a beautiful place [ADDRESS] this is where i live",
				TextRedactor.addressFormating(inputText, formater));
		System.out.println(TextRedactor.addressFormating(inputText, formater));
		scanner.close();

	}

}
