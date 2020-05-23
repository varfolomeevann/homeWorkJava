package homeWorkJava.homework02_Operatory_i_peremennye;
/*
 * Задание 9
 * Проверить, имеет ли число вещественную часть. Например, числа 3.14 и 2.5 – имеют вещественную часть, а числа 5.0
 * и 10.0 – нет.
 */
import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите вещественное число");
		float number = scan.nextFloat();
		float part = number - (int)number;
		if (part != 0)
			System.out.println("Имеет вещественную часть");
		else
			System.out.println("Не имеет вещественную часть");
		scan.close();
	}

}
