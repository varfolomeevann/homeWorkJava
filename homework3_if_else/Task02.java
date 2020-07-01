package homeWorkJava.homework3_if_else;
import java.util.Scanner;
/*
 * С клавиатуры вводится время (количество часов от 0 до
 * 24) – программа выводит приветствие, соответствующее
 * введенному времени (например, ввели 15 часов – выводится
 * приветствие «Добрый день»).
 */
public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите время");
		int hour = scan.nextInt();
		
		if ((hour >= 6) && (hour < 12))
			System.out.println("Доброе утро");
		else if ((hour >= 12) && (hour < 18))
			System.out.println("Добрый день");
		else if ((hour >= 18) && (hour < 24))
			System.out.println("Добрый вечер");
		else if ((hour < 6) || (hour == 24))
			System.out.println("Доброй ночи");
		else
			System.out.println("В сутках 24 часа, введите число от 0 до 24");
		scan.close();
	}

}
