package by.academy.homework.homework5.task4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Создайте каталог(папку). Создайте в папке 100 txt файлов (Например, 1.txt, 2.txt ... 100.txt). 
//Считываем текст из 2-ого задания, получаем его длинну (576 символов). Для каждого файла генерируем
//рандомное число от 0 до 576, достаем из текста (из 2 задания) такое-же количество символов 
//(string.substring()) и сохраняем в наш файл. Создайте файл result.txt и запишите туда список
//всех файлов и их размеры.

public class Task4 {

	public static void main(String[] args) throws IOException {

		File catalog = new File("academy\\src\\by\\academy\\homework\\homework5\\task4\\catalog");
		catalog.mkdirs();
		try (Scanner sc = new Scanner(new File("academy\\src\\by\\academy\\homework\\homework5\\task2\\task2.txt"));
				BufferedWriter outResult = new BufferedWriter(
						new FileWriter("academy\\src\\by\\academy\\homework\\homework5\\task4\\result.txt"))) {
			StringBuilder sb = new StringBuilder();
			while (sc.hasNextLine()) {
				String s = sc.nextLine();
				sb.append(s);
			}
			String textFromTask2=sb.toString();
			int lengthTextFromTask2 = textFromTask2.length();
			int sizeEachFile = 0;
			for (int i = 1; i <= 100; i++) {
				try (BufferedWriter out100Files = new BufferedWriter(new FileWriter(
						"academy\\src\\by\\academy\\homework\\homework5\\task4\\catalog\\" + i + ".txt"))) {
					sizeEachFile = (int) (Math.random() * (lengthTextFromTask2 + 1));
					out100Files.write(textFromTask2.substring(0, sizeEachFile));
				}
			}
			List<File> list = Arrays.asList(catalog.listFiles());
			for (File f : list) {
				outResult.write("Файл " + f.getName() + " с размером " + f.length() + " байт\n");
			}
		}
	}
}
