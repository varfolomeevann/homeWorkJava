package homeWorkJava.homework3_if_else;
import java.util.Scanner;
/*
 * ������� 8
 *���� ��� ����� x � y. ��������� ������ ������� � ������� YES, � ���� ��� ����� ������, ���� ��� ����� ��������;
 * ����� ��������� ������ �� �������.
 */
public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ��� �����");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		
		if ((number1 != 0 && number2 != 0) && (number1 % 2 == 0 && number2 % 2 == 0)) 
			System.out.println("YES");
		else if ((number1 != 0 && number2 != 0) && (number1 % 2 != 0 && number2 % 2 != 0)) 
			System.out.println("YES");
		
		scan.close();
	}

}
