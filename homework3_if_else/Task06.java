package homework3_if_else;
import java.util.Scanner;
/*
 * ������� 6
 * ���������� ���������� ���� � ����, ������� ������
 * ������������, � ������� �� � �������. � ���������� ���� �
 * 366 ����, ����� ��� � ������� � 365. ����������� ������
 * �������� ��� ����, ��������� ������ �� 4, �� �����������
 * ��������, ������� �� ������� ������ �� 400
 */
public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ���");
		int year = scan.nextInt();
		
		if (year % 100 == 0 && year % 400 != 0)
			System.out.println("���������� ���� � " + year + " ���� - 365");
		else if (year % 100 != 0 && year % 4 == 0)
			System.out.println("���������� ���� � " + year + " ���� - 366");
		else
			System.out.println("���������� ���� � " + year + " ���� - 365");
		scan.close();
	}

}
