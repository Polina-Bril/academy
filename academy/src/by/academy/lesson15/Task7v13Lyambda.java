package by.academy.lesson15;

import java.util.function.Function;

/*Написать лямбда выражение, которое принимает на вход число и возвращает значение 
	“Положительное число”, “Отрицательное число” или  “Ноль”.
	Используем функциональный интерфейс Function.
 **/

public class Task7v13Lyambda {

	public static void main(String[] args) {
		
		Function<Integer, String> func = chislo->{if(chislo>0)return "Положительное число"; else if(chislo==0) return "Ноль"; else return "Отрицательное число";};
		System.out.println(func.apply(8));
		System.out.println(func.apply(-8));
		System.out.println(func.apply(0));
		
	}

}
