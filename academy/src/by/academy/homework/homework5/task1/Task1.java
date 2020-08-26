package by.academy.homework.homework5.task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Прочесть информацию введеную из клавиатури и записать в созданный вами txt файл, 
//если введена "stop" строка тогда закончить запись в файл.

public class Task1 {

	public static void main(String[] args) throws IOException {

		try (Scanner sc = new Scanner(System.in);
				BufferedWriter out = new BufferedWriter(
						new FileWriter("academy\\src\\by\\academy\\homework\\homework5\\task1\\task1.txt"))) {
			System.out.println("Вводите текст. Чтобы закончить - на отдельной строке напишите stop");
			while (sc.hasNextLine()) {
				String s = sc.nextLine();
				if (s.equals("stop")) {
					break;
				}
				out.write(s + "\n");

			}
		}

	}

}
