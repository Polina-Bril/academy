package by.academy.lesson14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.io.File;

public class Task5v12Files {
	
//	Написать метод который циклически просматривает содержимое заданного каталога
//	и выводит на печать информацию о всех файлах и каталогах, находящихся в нем и в его подкаталогах. 
//	Используем рекурсию.

	public static void main(String[] args) throws IOException {
		
		String catalogName="academy//src";
		treeOfCatalog(catalogName);
		
	}
	public static void treeOfCatalog(String catalogName) {
		File file =new File(catalogName);
		if (file.isDirectory()) {
			System.out.println("Папка "+catalogName);
			String[] list = file.list();
			if (list != null) {
				for (String fileName : list) {
					File file1 = new File(catalogName + "//" + fileName);
					if (file1.isDirectory()) {
						System.out.printf("\t%s каталог%n", fileName);
						String catalogNewName=catalogName + "//" + fileName;
						treeOfCatalog(catalogNewName);
					} else {
						System.out.printf("\t%s файл%n", fileName);
					}
				}
				System.out.println();
			}
		} else {
			System.out.println(catalogName + " не является каталогом");
		}

	}

}
