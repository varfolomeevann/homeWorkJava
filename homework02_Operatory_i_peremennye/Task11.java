package homeWorkJava.homework02_Operatory_i_peremennye;
/*
 * ������� 11
 * � ���� ������ ���� ����, ������� � �������� ����������, ������� �������� �� ������� ������ ����. ��� ��� ���
 * ����� � ������� ��� � ��������, �� ��������� �������������� �������� �� ������ ��������� �� � ���������.
 * �������� ���� ������ ����������, ������� ������ ����,
 * �����, ����� � ������ �������� �� ���������� ������ ����,
 * ���� �������� ������� �������� ������. �. �. ��������� ����� � �������� �� ������ ���������� ����, �����, ����� � ������.
 *  �������� ��������� �� �������.
 * ������, ��� ������ ��������� ����� ����������:
 * 10 ����, 14 �����, 5 ����� � 33 �������
 */
import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ���������� ������ �� ������ ����");
		int time = scan.nextInt();
		int day;
		int hour;
		int minets;
		int second;
		second = ((time % 86400) % 3600) % 60;
		minets = (time % 86400) % 3600 / 60;
		hour = (time % 86400) / 3600;
		day = time / 86400;
		System.out.println("�� ������ ���� �������� " + day + " ����, " + hour + " �����, " + minets + " �����, " + second + " ������");
		
		scan.close();
	}

}
