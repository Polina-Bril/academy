package by.academy.lesson14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.io.File;

public class Task2v12Files {
//	Переписать класс FileInputOutputStreamDemo: 
//	a) Добавить блок try-with-resources. 
//	б) Замените for (int i = 0; i < c.length; i++) на блок for-each.  
//	в) Пусть file.txt записывается в каталог src/io. 

	public static void main(String[] args) {
		File file = Path.of("academy", "src", "io", "2.txt").toFile();
		try (OutputStream output = new FileOutputStream(file); InputStream input = new FileInputStream("1.txt")) {
			char[] symbols = { 'a', 'b', 'c' };
			for (char i : symbols) {
				output.write(i);
			}
			int size = input.available();
			for (int i = 0; i < size; i++) {
				System.out.print((char) input.read() + " ");
			}

		}
		catch (IOException e) {
			System.out.print("Exception");
		}
	}
}