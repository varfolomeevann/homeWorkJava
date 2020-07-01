package homeWorkJava.homework3_if_else;
import java.util.Scanner;
/*
 * Задание 12
 * Программа запрашивает шестизначное число. После ввода определяет, будет ли являться «счастливым»
 * билет с таким номером (сумма первых трех цифр совпадает с суммой
 * трех последних).
 */
public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numberTicket;
		int i;
		int n;
		do {
			i = 0;
			System.out.println("Введите шестизначное число");
			numberTicket = scan.nextInt();
			n = numberTicket;
			while (n > 0) {
		        n = n/10;
		        i += 1;
		    }
		}while(i != 6);
		
		int number1 = numberTicket / 100000;
		int number2 = (numberTicket % 100000)/10000;
        int number3 = (numberTicket % 10000)/1000;
        int number4 = (numberTicket % 1000)/100;
        int number5 = (numberTicket % 100)/10;
        int number6 = numberTicket % 10;
   
        if ( number1 + number2 + number3 == number4 + number5 + number6)
			System.out.println("Билет счастливый. Ура!!!!!!!!!!");
		else
			System.out.println("Увы(((( Билет не счастливый.");
		scan.close();
	}

}
