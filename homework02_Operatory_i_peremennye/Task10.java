package homeWorkJava.homework02_Operatory_i_peremennye;
/*
 * Задание 10
 * Написать программу расчета идеального веса к росту. В
 * константах хранятся рост (height) и вес (weight). Вывести на
 * консоль сообщение, сколько килограмм нужно набрать или
 * сбросить (идеальный вес = рост - 110).
 */
public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int height = 172;
		final int weight = 56;
		int idealWeight = height - 110;
		int sum = (weight - idealWeight);
		if ( sum < 0)
			System.out.println("Вам необходимо набрать " + -sum + " кг");
		else if (sum > 0)
			System.out.println("Вам необходимо сбросить " + sum + " кг");
		else
			System.out.println("Ваш вес идеальный!!!!!!!!!!");
	}

}
