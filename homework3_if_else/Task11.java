package homeWorkJava.homework3_if_else;
import java.util.Scanner;

/*
 * ������� 11
 * ����� ����� ����������� ��������� � ������� �� ��
 * �����, ���� ��� ����. ���� ������ ���, �� ������� ��������� �� ����. ���������� ���������� ��������� ������������ �������������� a, b, c, ������� ������ ������������ �
 * ����������.
 */
public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ����������� a");
		double a = scan.nextDouble();
		System.out.println("������� ����������� b");
		double b = scan.nextDouble();
		System.out.println("������� ����������� c");
		double c = scan.nextDouble();
		double x;
		double y;
		
		double d = b * b - (4 * a * c);
		if (d < 0)
			System.out.println("������ ���, �.�. ������������ ������ 0");
		else if (d == 0) {
			x = -b / (2 * a);
			System.out.println("������ - " + x);
		}
		else {
			x = (-b + Math.sqrt(d))/ (2 * a);
			y = (-b - Math.sqrt(d))/ (2 * a);
			System.out.println("����� - " + x + " , " + y);
		}
					
		scan.close();
	}

}
