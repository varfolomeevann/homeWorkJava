package homeWorkJava.homework02_Operatory_i_peremennye;
/*
 * Задание 3
 * В переменной n хранится вещественное число, с ненулевой дробной частью. Создайте программу, округляющую
 * число n до ближайшего целого и выводящую результат
 * округления на экран.
 */
public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n = 123.50000;
		double x = (double)Math.round(n);
		System.out.println((int)x);
	}

}
