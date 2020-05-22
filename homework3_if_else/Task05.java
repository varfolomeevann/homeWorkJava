package homeWorkJava.homework3_if_else;
import java.util.Scanner;
/*
 * Задание 5
 * Организовать ввод с клавиатуры даты рождения человека. Программа должна вывести знак зодиака и название
 * года по китайскому календарю.
 * Пример входных данных:
 * 5 12 1974
 * Вывод:
 * Знак: Стрелец
 * Год: Тигра
 */

public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите день, месяц, год рождения");
		int day;
		int month;
		int year;
		do {
			System.out.println("Количество дней в месяце от 1 до 31");
			day = scan.nextInt();
		}while((day > 31) || (day <= 0));
		
		do {
			System.out.println("Месяц равен от 1 до 12");
			month = scan.nextInt();
		}while(month <1 || month > 12);
		int i;
		int n;
		do {
			i = 0;
			System.out.println("Год - четырехзначное число");
			year = scan.nextInt();
			n = year;
			while (n > 0) {
			        n = n/10;
			        i += 1;
			    }
		}while(i != 4);
		
		System.out.println(day + " " + month + " " + year);
		String znakZodiak;
		String animalYear;
			
		if ((month == 3 && day >= 21) || (month == 4 && day <= 20))
			znakZodiak = "Овен";
		else if ((month == 4 && day >= 21) || (month == 5 && day <= 21))
			znakZodiak = "Телец";
		else if ((month == 5 && day >= 22) || (month == 6 && day <= 21))
			znakZodiak = "Близнецы";
		else if ((month == 6 && day >= 22) || (month == 7 && day <= 22))
			znakZodiak = "Рак";
		else if ((month == 7 && day >= 23) || (month == 8 && day <= 22))
			znakZodiak = "Лев";
		else if ((month == 8 && day >= 23) || (month == 9 && day <= 23))
			znakZodiak = "Дева";
		else if ((month == 9 && day >= 24) || (month == 10 && day <= 23))
			znakZodiak = "Весы";
		else if ((month == 10 && day >= 24) || (month == 11 && day <= 21))
			znakZodiak = "Скорпион";
		else if ((month == 11 && day >= 22) || (month == 12 && day <= 21))
			znakZodiak = "Стрелец";
		else if ((month == 12 && day >= 22) || (month == 1 && day <= 21))
			znakZodiak = "Козерог";
		else if ((month == 1 && day >= 22) || (month == 2 && day <= 19))
			znakZodiak = "Водолей";
		else if ((month == 2 && day >= 20) || (month == 3 && day <= 20))
			znakZodiak = "Рыбы";
		else
			znakZodiak = "Введенный месяц не соответствует ни одному значению знака задиака. Месяц должен быть от 1 до 124";
		switch(year % 12) {
		case 0: 
			animalYear = "Год обезьяны";
			break;
		case 1:
			animalYear = "Год петуха";
			break;
		case 2: 
			animalYear = "Год собаки";
			break;
		case 3: 
			animalYear = "Год свиньи";
			break;
		case 4: 
			animalYear = "Год крысы";
			break;
		case 5: 
			animalYear = "Год коровы";
			break;
		case 6:
			animalYear = "Год тигра";
			break;
		case 7: 
			animalYear = "Год зайца";
			break;
		case 8: 
			animalYear = "Год дракона";
			break;
		case 9: 
			animalYear = "Год змеи";
			break;
		case 10: 
			animalYear = "Год лошади";
			break;
		case 11: 
			animalYear = "Год овцы";
			break;
		default:
			animalYear = "Что-то пошло не так";
		}
		System.out.println("Знак: " + znakZodiak);
		System.out.println("Знак: " + animalYear);
		scan.close();
	}

}

