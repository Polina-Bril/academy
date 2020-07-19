package by.academy.lesson7.tasks;

public class Task4 {

//	4.Напишите два цикла выполняющих многократное сложение строк, один 	с помощью оператора сложения
//	и String, а другой с помощью StringBuilder	и метода append. Сравните скорость их выполнения.

	public static void main(String[] args) {

		String text = "This is the text to be searched for occurrences of the http:// pattern.";
		String[] slovo = text.split(" +");

		long startMS1 = System.currentTimeMillis();
		String newS = "";
		for (String slova : slovo) {
			newS += slova + " ";
		}
		System.out.println(newS);
		long endMS1 = System.currentTimeMillis();
		System.out.println(endMS1 - startMS1);

		long startMS2 = System.currentTimeMillis();
		StringBuilder strBuilder = new StringBuilder("");
		for (String slova : slovo) {
			strBuilder.append(slova).append(" ");
		}
		System.out.println(strBuilder);
		long endMS2 = System.currentTimeMillis();
		System.out.println(endMS2 - startMS2);
	}
}
