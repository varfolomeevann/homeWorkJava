package homework3_if_else;
import java.util.Scanner;
/*
 * Задание 6
 * Определить количество дней в году, который вводит
 * пользователь, и вывести их в консоль. В високосном году –
 * 366 дней, тогда как в обычном – 365. Високосными годами
 * являются все годы, делящиеся нацело на 4, за исключением
 * столетий, которые не делятся нацело на 400
 */
public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите год");
		int year = scan.nextInt();
		
		if (year % 100 == 0 && year % 400 != 0)
			System.out.println("Количество дней в " + year + " году - 365");
		else if (year % 100 != 0 && year % 4 == 0)
			System.out.println("Количество дней в " + year + " году - 366");
		else
			System.out.println("Количество дней в " + year + " году - 365");
		scan.close();
	}

}
