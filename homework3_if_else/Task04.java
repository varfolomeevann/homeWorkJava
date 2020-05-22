package homework3_if_else;
import java.util.Scanner;
/*
 * Задание 4
 * Дана точка на плоскости заданная координатами x и y,
 * определить и вывести в консоль, в какой четверти находится точка, в прямоугольной (декартовой) системе координат.
 * Четверти обозначены римскими цифрами.
 */

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Если вводите дробное значение, вводите через запятую!!!!!!!!!!!");
		System.out.println("Введите координату \"x\"");
		double x = scan.nextDouble();
		System.out.println("Введите координату \"y\"");
		double y = scan.nextDouble();
		
		if ((x > 0) && (y > 0))
			System.out.println("Точка с координатой (" + x + "," + y +") находится в I четверти");
		else if ((x < 0) && (y > 0))
			System.out.println("Точка с координатой (" + x + "," + y +") находится во II четверти");
		else if ((x < 0) && (y < 0))
			System.out.println("Точка с координатой (" + x + "," + y +") находится в III четверти");
		else if ((x > 0) && (y < 0))
			System.out.println("Точка с координатой (" + x + "," + y +") находится в IV четверти");
		else if (x == 0 && y != 0)
			System.out.println("Точка с координатой (" + x + "," + y +") лежит на оси \"y\"");
		else if (y == 0 && x != 0)
			System.out.println("Точка с координатой (" + x + "," + y +") лежит на оси \"x\"");
		else if (x == 0 && y == 0)
			System.out.println("Точка с координатой (" + x + "," + y +") - это начало координат");
		else
			System.out.println("Введенные значения не опознаны");
	scan.close();					
	}

}

