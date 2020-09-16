package by.academy.lesson19;
/*
 * Необходимо создать три потока которые изменяют один и тот же объект. 
Каждый поток должен вывести на экран одну букву 100 раз, 
и затем увеличить значение символа на 1. 
a) Создать класс расширяющий Thread. 
б) Переопределить метод run(), здесь будет находится синхронизированный блок кода. 
в) Для того чтобы три объекта-потока имели доступ к одному объекту, с
оздаем конструктор принимающий на вход StringBuilder объект. 
г) Синхронизированный блок кода будет получать монитор на объект StringBuilder из пункта в). 
д) Внутри синхронизированного блока кода выведите StringBuilder на экран 100 раз, 
а потом увеличьте значение символа на 1. 
е) В методе main() создайте один объект класса StringBuilder, 
используя символ ‘a’. Затем создайте три экземпляра объекта нашего класса и запустите потоки. 
 */

public class Task3 extends Thread {
	
	private StringBuilder builder;
	

	public Task3(StringBuilder builder) {
		super();
		this.builder = builder;
	}

	@Override
	public  void run() {
		synchronized (builder){
			for(int i=0;i<100;i++) {
			System.out.println(builder);
			builder.append('a');
			}
		}
	}

	public static void main(String[] args) {
		StringBuilder build = new StringBuilder('a');
		Thread my1 = new Thread(new Task3(build));
		Thread my2 = new Thread(new Task3(build));
		Thread my3 = new Thread(new Task3(build));
		my1.start();
		my2.start();
		my3.start();
	}

}
