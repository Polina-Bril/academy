package by.academy.homework.homework6;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

/*Stream/Lambda.
Не использовать циклы (for/while/do-while). Сгенерировать 100 рандомных Long чисел в диапазоне 
от 0 до 100. Каждое число умножить на PI и отнять 20. Отфильтровать, оставив числа меньшие 100. 
Отсортировать по возрастанию. Пропустив первые 3 числа произвести следующие операции:
Преобразовать лист чисел в Map (операция collect), где ключем является само число а значением строка: 
("Number: " + value).
**/

public class Task1 {

	public static void main(String[] args) {

		List<Long> longs100 = new Random()
				.longs(100, 0, 100)
				.boxed()
				.collect(Collectors.toList());
		
		Map<Double, String> map = longs100
				.stream()
				.map(lon -> lon * Math.PI - 20)
				.filter(lon -> lon < 100)
				.sorted()
				.skip(3)
				.distinct()
				.collect(Collectors.toMap(Function.identity(), doub -> "Number: " + doub));

		System.out.println(map);
	}
}
