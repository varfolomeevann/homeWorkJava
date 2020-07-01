package homeWorkJava.homework02_Operatory_i_peremennye;
/*
 * Задание 8
 * Зная скорость распространения звука в воздушной среде,
 *  можно вычислить расстояние до места удара молнии по 
 * времени между вспышкой и раскатом грома. Зная время в
 * секундах между вспышкой и раскатом грома (константа в
 * программе), вычислите расстояния до места удара молнии и
 * выведите его на экран
 */
import java.util.Scanner;
public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double speed = 333.3;
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите время в секундах");
		double time = scan.nextDouble();
		double distance = speed * time;
		System.out.println("Расстояние до места удара молнии - " + distance + " метров");
		scan.close();
		
		
	}

}
