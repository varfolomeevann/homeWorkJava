package homeWorkJava.homework02_Operatory_i_peremennye;
/*
 * ������� 7
 * ����������� ���������, ������� �������� ��� ���������
 * ������� �������� ��������� ����� ������ � ����� �����
 * ��� ����, ���� ������ �������� �������� ������. 
 */
import java.util.Scanner;
public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������� �������� ������");
		float summVklad = scan.nextFloat();
		float percent = 9;
		float summOut = summVklad + (summVklad * percent / 100) * 2;
		System.out.println("����� ���� 2 ���� ����� " + summOut);
		scan.close();
	}

}
