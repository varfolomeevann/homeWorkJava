package homework3_if_else;
import java.util.Scanner;

/*
 * Задание 9
 * Даны координаты начала и координаты конца отрезка.
 * Если считать отрезок обозначением горки, то в одном случае он обозначает спуск, в другом – подъем. Определить и
 * вывести на экран – спуск это или подъем, ровная дорога или
 * вообще отвесная.
 */

public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Если вводите дробное значение, вводите через запятую!!!!!!!!!!!");
		System.out.println("Введите координату \"x\" первой точки");
		double x1 = scan.nextDouble();
		System.out.println("Введите координату \"y\" первой точки");
		double y1 = scan.nextDouble();
		System.out.println("Введите координату \"x\" второй точки");
		double x2 = scan.nextDouble();
		System.out.println("Введите координату \"y\" второй точки");
		double y2 = scan.nextDouble();
		
		if (y1 == y2)
			System.out.println("Дороги ровная");
		else if (x1 == x2)
			System.out.println("Дороги отвесная");
		else if(x1 > x2 && y1 > y2 )
			System.out.println("Горка");
		else
			System.out.println("Спуск");
				
		scan.close();
	}

}
