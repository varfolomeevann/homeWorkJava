package homework3_if_else;
import java.util.Scanner;
/*
 * ������� 4
 * ���� ����� �� ��������� �������� ������������ x � y,
 * ���������� � ������� � �������, � ����� �������� ��������� �����, � ������������� (����������) ������� ���������.
 * �������� ���������� �������� �������.
 */

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ������� ������� ��������, ������� ����� �������!!!!!!!!!!!");
		System.out.println("������� ���������� \"x\"");
		double x = scan.nextDouble();
		System.out.println("������� ���������� \"y\"");
		double y = scan.nextDouble();
		
		if ((x > 0) && (y > 0))
			System.out.println("����� � ����������� (" + x + "," + y +") ��������� � I ��������");
		else if ((x < 0) && (y > 0))
			System.out.println("����� � ����������� (" + x + "," + y +") ��������� �� II ��������");
		else if ((x < 0) && (y < 0))
			System.out.println("����� � ����������� (" + x + "," + y +") ��������� � III ��������");
		else if ((x > 0) && (y < 0))
			System.out.println("����� � ����������� (" + x + "," + y +") ��������� � IV ��������");
		else if (x == 0 && y != 0)
			System.out.println("����� � ����������� (" + x + "," + y +") ����� �� ��� \"y\"");
		else if (y == 0 && x != 0)
			System.out.println("����� � ����������� (" + x + "," + y +") ����� �� ��� \"x\"");
		else if (x == 0 && y == 0)
			System.out.println("����� � ����������� (" + x + "," + y +") - ��� ������ ���������");
		else
			System.out.println("��������� �������� �� ��������");
	scan.close();					
	}

}

