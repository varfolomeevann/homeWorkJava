package homeWorkJava.homework02_Operatory_i_peremennye;
/*
 * Задание 5
 * Подсчитать площадь и длину окружности для круга с радиусом R. 
 * Радиус должен быть задан константой в программе. Вывести результат на консоль. 
 */
public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double radius = 5.0;
		double square = Math.PI * Math.pow(radius,2);
		double length = 2 * Math.PI * radius;
		System.out.println("Площадь круга с радиусом " + radius + " = " + square);
		System.out.println("Длина окружности круга с радиусом " + radius + " = " + length);
	}

}
