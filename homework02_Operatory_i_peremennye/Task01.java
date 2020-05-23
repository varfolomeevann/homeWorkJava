package homeWorkJava.homework02_Operatory_i_peremennye;
/*
 * Задание 1
 * В переменных х и y хранятся два натуральных числа.
 * Создайте программу, выводящую на консоль:
 * результат целочисленного деления x на y;
 * остаток от деления x на y;
 * квадратный корень x.
 */
public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int y = 2;
		System.out.println(x / y);
		System.out.println(x % y);
		System.out.println(Math.sqrt((double)x));
	}

}
