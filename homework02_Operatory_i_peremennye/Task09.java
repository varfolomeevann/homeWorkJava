package homeWorkJava.homework02_Operatory_i_peremennye;
/*
 * ������� 9
 * ���������, ����� �� ����� ������������ �����. ��������, ����� 3.14 � 2.5 � ����� ������������ �����, � ����� 5.0
 * � 10.0 � ���.
 */
import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ������������ �����");
		float number = scan.nextFloat();
		float part = number - (int)number;
		if (part != 0)
			System.out.println("����� ������������ �����");
		else
			System.out.println("�� ����� ������������ �����");
		scan.close();
	}

}
