package homework3_if_else;
import java.util.Scanner;
/*
*�������� ���������, ������� ���������� ������������
*������ c ���������� ����� ��� ������, � � ����� ���������� �������� ����� ��� (��������, 6 � ��� �������). ������ �
*�������������� switch.
 */
public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ���� ������");
		int day = scan.nextInt();
		 
		switch(day) {
		case 1:
			System.out.println("������������");
			break;
		case 2:
			System.out.println("�������");
			break;
		case 3:
			System.out.println("�����");
			break;
		case 4:
			System.out.println("�������");
			break;
		case 5:
			System.out.println("�������");
			break;
		case 6:
			System.out.println("�������");
			break;	
		case 7:
			System.out.println("�����������");
			break;
		default:
			System.out.println("������ ��� ������ �� ����������.\n������� ����� �� 1 �� 7!");
		}
		scan.close();
	}	
}
