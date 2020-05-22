package homework3_if_else;
import java.util.Scanner;
/*
*Написать программу, которая предлагает пользователю
*ввести c клавиатуры номер дня недели, и в ответ показывает название этого дня (например, 6 – это суббота). Решить с
*использованием switch.
 */
public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите день недели");
		int day = scan.nextInt();
		 
		switch(day) {
		case 1:
			System.out.println("Понедельныик");
			break;
		case 2:
			System.out.println("Вторник");
			break;
		case 3:
			System.out.println("Среда");
			break;
		case 4:
			System.out.println("Четверг");
			break;
		case 5:
			System.out.println("Пятница");
			break;
		case 6:
			System.out.println("Суббота");
			break;	
		case 7:
			System.out.println("Воскресенье");
			break;
		default:
			System.out.println("Такого дня недели не существует.\nВведите число от 1 до 7!");
		}
		scan.close();
	}	
}
