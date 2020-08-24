package by.academy.lesson14;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Collectors;

public class Task3v12Files {

//	Написать класс, который копирует содержимое из одного файла в другой.
//	Используем классы BufferedReader, FileReader, BufferedWriter, FileWriter.

	public static void main(String[] args) throws IOException {
		try (BufferedWriter output = new BufferedWriter(new FileWriter("1_copy.txt"));
				BufferedReader input = new BufferedReader(new FileReader("1.txt"))) {
			String s = input.lines().collect(Collectors.joining("\r\n"));
			output.write(s);
		}
	}
}
