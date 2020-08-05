package by.academy.lesson12;

import java.util.HashMap;
import java.util.Map;

//Можно писать все в main. Не нужно создавать новых классов.
//Создать "Каталог" (Map<String, Integer>) для товаров, в который мы заносим название товара и его количество.
//Будьте внимательны, если товар уже есть в каталоге, мы не добавляем его повторно, а увеличиваем счетчик.
//Добавить 10 товаров. contains get put

public class Task4 {

	public static void main(String[] args) {
		
		Map<String,Integer> catalog = new HashMap<String, Integer>();
						
			addProductToMap(catalog, "Куклы");
			addProductToMap(catalog, "Машинки");
			addProductToMap(catalog, "Книги");
			addProductToMap(catalog, "Мячи");
			addProductToMap(catalog, "Пистолеты");
			addProductToMap(catalog, "Конструкторы");
			addProductToMap(catalog, "Книги");
			addProductToMap(catalog, "Машинки");
			addProductToMap(catalog, "Лото");
			addProductToMap(catalog, "Куклы");
		
		for (String product : catalog.keySet()) {
			System.out.println(product+ " "+catalog.get(product));
		}

	}
		public static void addProductToMap(Map<String, Integer> catalog, String product) {
			if (catalog==null) {
				return;
			}
		
			if(catalog.containsKey(product)) {
				catalog.put(product, catalog.get(product)+1);
						}
			else {
				catalog.put(product, 1);
			}
		}

}
