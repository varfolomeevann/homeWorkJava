package homeWorkJava.homework02_Operatory_i_peremennye;
/*
 * Задание 7
 * Разработать программу, которая позволит при известном
 * годовом проценте вычислить сумму вклада в банке через
 * два года, если задана исходная величина вклада. 
 */
import java.util.Scanner;
public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите величену вклада");
		float summVklad = scan.nextFloat();
		float percent = 9;
		float summOut = summVklad + (summVklad * percent / 100) * 2;
		System.out.println("Сумма чере 2 года равна " + summOut);
		scan.close();
	}

}
