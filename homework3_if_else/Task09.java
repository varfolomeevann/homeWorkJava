package homework3_if_else;
import java.util.Scanner;

/*
 * ������� 9
 * ���� ���������� ������ � ���������� ����� �������.
 * ���� ������� ������� ������������ �����, �� � ����� ������ �� ���������� �����, � ������ � ������. ���������� �
 * ������� �� ����� � ����� ��� ��� ������, ������ ������ ���
 * ������ ��������.
 */

public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ������� ������� ��������, ������� ����� �������!!!!!!!!!!!");
		System.out.println("������� ���������� \"x\" ������ �����");
		double x1 = scan.nextDouble();
		System.out.println("������� ���������� \"y\" ������ �����");
		double y1 = scan.nextDouble();
		System.out.println("������� ���������� \"x\" ������ �����");
		double x2 = scan.nextDouble();
		System.out.println("������� ���������� \"y\" ������ �����");
		double y2 = scan.nextDouble();
		
		if (y1 == y2)
			System.out.println("������ ������");
		else if (x1 == x2)
			System.out.println("������ ��������");
		else if(x1 > x2 && y1 > y2 )
			System.out.println("�����");
		else
			System.out.println("�����");
				
		scan.close();
	}

}
