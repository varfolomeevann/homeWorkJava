package homeWorkJava.homework04_1_Cikly;
/*
 * Задание 4
 * Совершенное число – натуральное число, равное сумме всех
 * своих собственных делителей (то есть всех положительных
 * делителей, отличных от самого числа).
 * Показать на экране все совершенные числа в диапазоне от
 * 0 до 1 000 000.
 * Примеры:
* 1-е совершенное число: 6 имеет следующие собственные
* делители – 1, 2, 3; их сумма равна 6.
* 2-е совершенное число: 28 имеет следующие собственные
* делители: – 1, 2, 4, 7, 14; их сумма равна 28.
 */
public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int delitel;
		for (int i = 0; i<= 1000000; i++) {
			int sum = 0;
			delitel = 1;
			do {
				if ((delitel != i) && ( i % delitel == 0))
					sum += delitel;
				delitel ++;
			}while(delitel < i);
			if  (i == sum)
				System.out.print(i + " ");
		}
	}

}
