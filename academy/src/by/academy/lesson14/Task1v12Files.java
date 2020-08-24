package by.academy.lesson14;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Task1v12Files {

	// Переписать класс FileCopy:
	// a) Добавить блок try-with-resources - создать класс с имплементацией closeble
	// б) Добавить catch блок для обработки IOException.

	public static void main(String... args) {

		int counter = 0;
		try (FileInputStream fileIn = new FileInputStream("1.txt");
				FileOutputStream fileOut = new FileOutputStream("copied_file.txt")) {

			int a;

			while ((a = fileIn.read()) != -1) {
				counter++;
				fileOut.write(a);
			}

		} catch (IOException exception) {
			exception.printStackTrace();
		}
		System.out.println(counter);
	}
}