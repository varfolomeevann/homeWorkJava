package homeWorkJava.homework02_Operatory_i_peremennye;
/*
 * ������� 8
 * ���� �������� ��������������� ����� � ��������� �����,
 *  ����� ��������� ���������� �� ����� ����� ������ �� 
 * ������� ����� �������� � �������� �����. ���� ����� �
 * �������� ����� �������� � �������� ����� (��������� �
 * ���������), ��������� ���������� �� ����� ����� ������ �
 * �������� ��� �� �����
 */
import java.util.Scanner;
public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double speed = 333.3;
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ����� � ��������");
		double time = scan.nextDouble();
		double distance = speed * time;
		System.out.println("���������� �� ����� ����� ������ - " + distance + " ������");
		scan.close();
		
		
	}

}
