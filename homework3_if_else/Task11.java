package homeWorkJava.homework3_if_else;
import java.util.Scanner;

/*
 * Задание 11
 * Найти корни квадратного уравнения и вывести их на
 * экран, если они есть. Если корней нет, то вывести сообщение об этом. Конкретное квадратное уравнение определяется коэффициентами a, b, c, которые вводит пользователь с
 * клавиатуры.
 */
public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите коэффициент a");
		double a = scan.nextDouble();
		System.out.println("Введите коэффициент b");
		double b = scan.nextDouble();
		System.out.println("Введите коэффициент c");
		double c = scan.nextDouble();
		double x;
		double y;
		
		double d = b * b - (4 * a * c);
		if (d < 0)
			System.out.println("Корней нет, т.к. дискриминант меньше 0");
		else if (d == 0) {
			x = -b / (2 * a);
			System.out.println("Корень - " + x);
		}
		else {
			x = (-b + Math.sqrt(d))/ (2 * a);
			y = (-b - Math.sqrt(d))/ (2 * a);
			System.out.println("Корни - " + x + " , " + y);
		}
					
		scan.close();
	}

}
