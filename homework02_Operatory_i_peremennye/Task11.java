package homeWorkJava.homework02_Operatory_i_peremennye;
/*
 * Задание 11
 * У Деда Мороза есть часы, которые в секундах показывают, сколько осталось до каждого Нового года. Так как Дед
 * Мороз – человек уже в возрасте, то некоторые математические операции он быстро выполнять не в состоянии.
 * Помогите Деду Морозу определить, сколько полных дней,
 * часов, минут и секунд осталось до следующего Нового года,
 * если известно сколько осталось секунд. Т. е. разложите время в секундах на полное количество дней, часов, минут и секунд.
 *  Выведите результат на консоль.
 * Пример, как должен выглядеть вывод результата:
 * 10 дней, 14 часов, 5 минут и 33 секунды
 */
import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите количество секунд до Нового года");
		int time = scan.nextInt();
		int day;
		int hour;
		int minets;
		int second;
		second = ((time % 86400) % 3600) % 60;
		minets = (time % 86400) % 3600 / 60;
		hour = (time % 86400) / 3600;
		day = time / 86400;
		System.out.println("До нового года осталось " + day + " дней, " + hour + " часов, " + minets + " минут, " + second + " секунд");
		
		scan.close();
	}

}
