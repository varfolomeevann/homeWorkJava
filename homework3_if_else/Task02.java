package homeWorkJava.homework3_if_else;
import java.util.Scanner;
/*
 * � ���������� �������� ����� (���������� ����� �� 0 ��
 * 24) � ��������� ������� �����������, ���������������
 * ���������� ������� (��������, ����� 15 ����� � ���������
 * ����������� ������� �����).
 */
public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������� �����");
		int hour = scan.nextInt();
		
		if ((hour >= 6) && (hour < 12))
			System.out.println("������ ����");
		else if ((hour >= 12) && (hour < 18))
			System.out.println("������ ����");
		else if ((hour >= 18) && (hour < 24))
			System.out.println("������ �����");
		else if ((hour < 6) || (hour == 24))
			System.out.println("������ ����");
		else
			System.out.println("� ������ 24 ����, ������� ����� �� 0 �� 24");
		scan.close();
	}

}
