package homework3_if_else;
import java.util.Scanner;
/*
 * ������� 3
 * ���������, ������� ���������� ������������
 * ������� �������� �� ������ (1 � �����, 2 � ������ � �.�.), � �
 * ����� ����������, ����� ����� ������ ��������� ��������.
 * � ������ ������ ���� �� ����� 10 ��������.
 */

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String say;
		int animal;
		do {
		System.out.println("�������� �������� �� ������");
		System.out.println(" 1. ���");
		System.out.println(" 2. ������");
		System.out.println(" 3. �������");
		System.out.println(" 4. ������");
		System.out.println(" 5. �����");
		System.out.println(" 6. ����");
		System.out.println(" 7. ����");
		System.out.println(" 8. ���");
		System.out.println(" 9. ����");
		System.out.println("10. ������");
		animal = scan.nextInt();
		}while((animal <1) || (animal > 10));
		
		switch(animal) {
		case 1:
			say = "���";
			break;
		case 2:
			say = "���";
			break;
		case 3:
			say = "���";
			break;
		case 4:
			say = "��-��";
			break;
		case 5:
			say = "��-��-��-��";
			break;
		case 6:
			say = "��-��";
			break;
		case 7:
			say = "�-�-�-�-�-�-�";
			break;
		case 8:
			say = "�-��-���������";
			break;
		case 9:
			say = "��-��";
			break;
		case 10:
			say = "���-���";
			break;
		default:
			say = "������� ����� �� ������";
		}
		System.out.println(say);
		scan.close();
	}

}
