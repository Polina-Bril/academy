package by.academy.lesson19.task5Philosofers;
/*
 * Обедающие философы. Пять безмолвных философов сидят вокруг круглого стола, 
перед каждым философом стоит тарелка спагетти. 
Вилки лежат на столе между каждой парой ближайших философов. 
Каждый философ может либо есть, либо размышлять. 
Философ может есть только тогда, когда держит две вилки — взятую справа и слева. 
Взятие каждой вилки и возвращение её на стол являются раздельными действиями, 
которые должны выполняться одно за другим.
 */

public class Task5 {

	public static void main(String[] args) {

//		for (int i = 1; i <= 5; i++) {
		Thread philosofer1 =new Thread(new Philosofer());
		Thread philosofer2 =new Thread(new Philosofer());
		Thread philosofer3 =new Thread(new Philosofer());
		Thread philosofer4 =new Thread(new Philosofer());
		Thread philosofer5 =new Thread(new Philosofer());
//		}
		philosofer1.start();
		philosofer2.start();
		philosofer3.start();
		philosofer4.start();
		philosofer5.start();
	}

}
