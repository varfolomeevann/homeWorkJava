package homework3_if_else;
import java.util.Scanner;
/*
 * Задание 10
 * Определить номер подъезда девятиэтажного дома, по
 * указанному номеру квартиры N. Считать, что на каждом
 * этаже находится M квартир. Вывести в консоль номер подъезда. 
 */
public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите номер квартиры");
		Double numberFlat = scan.nextDouble();
		System.out.println("Введите количество квартир на этаже");
		int countFlat = scan.nextInt();
		int entrance;
		entrance = (int)(numberFlat / (9 * countFlat));
		if (entrance == 0)
			entrance ++;
		else if ((numberFlat / (9 * countFlat)) % entrance != 0)
			entrance ++;
		System.out.println("Номер подъезда " + entrance);
		
		scan.close();
	}

}
