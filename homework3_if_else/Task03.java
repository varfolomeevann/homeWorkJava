package homework3_if_else;
import java.util.Scanner;
/*
 * Задание 3
 * программу, которая предлагает пользователю
 * выбрать животное из списка (1 – кошка, 2 – собака и т.д.), и в
 * ответ показывает, какие звуки издает выбранное животное.
 * В списке должно быть не менее 10 животных.
 */

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String say;
		int animal;
		do {
		System.out.println("Выберите животное из списка");
		System.out.println(" 1. Кот");
		System.out.println(" 2. Собака");
		System.out.println(" 3. Лягушка");
		System.out.println(" 4. Курица");
		System.out.println(" 5. Петух");
		System.out.println(" 6. Мышь");
		System.out.println(" 7. Волк");
		System.out.println(" 8. Лев");
		System.out.println(" 9. Гусь");
		System.out.println("10. Ворона");
		animal = scan.nextInt();
		}while((animal <1) || (animal > 10));
		
		switch(animal) {
		case 1:
			say = "Мяу";
			break;
		case 2:
			say = "Гав";
			break;
		case 3:
			say = "Ква";
			break;
		case 4:
			say = "Ко-Ко";
			break;
		case 5:
			say = "Ку-ка-ру-ку";
			break;
		case 6:
			say = "Пи-пи";
			break;
		case 7:
			say = "У-у-у-у-у-у-у";
			break;
		case 8:
			say = "Р-рр-ррррррррр";
			break;
		case 9:
			say = "Га-га";
			break;
		case 10:
			say = "Кар-кар";
			break;
		default:
			say = "Введите число из списка";
		}
		System.out.println(say);
		scan.close();
	}

}
