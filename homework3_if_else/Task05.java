package homeWorkJava.homework3_if_else;
import java.util.Scanner;
/*
 * ������� 5
 * ������������ ���� � ���������� ���� �������� ��������. ��������� ������ ������� ���� ������� � ��������
 * ���� �� ���������� ���������.
 * ������ ������� ������:
 * 5 12 1974
 * �����:
 * ����: �������
 * ���: �����
 */

public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ����, �����, ��� ��������");
		int day;
		int month;
		int year;
		do {
			System.out.println("���������� ���� � ������ �� 1 �� 31");
			day = scan.nextInt();
		}while((day > 31) || (day <= 0));
		
		do {
			System.out.println("����� ����� �� 1 �� 12");
			month = scan.nextInt();
		}while(month <1 || month > 12);
		int i;
		int n;
		do {
			i = 0;
			System.out.println("��� - �������������� �����");
			year = scan.nextInt();
			n = year;
			while (n > 0) {
			        n = n/10;
			        i += 1;
			    }
		}while(i != 4);
		
		System.out.println(day + " " + month + " " + year);
		String znakZodiak;
		String animalYear;
			
		if ((month == 3 && day >= 21) || (month == 4 && day <= 20))
			znakZodiak = "����";
		else if ((month == 4 && day >= 21) || (month == 5 && day <= 21))
			znakZodiak = "�����";
		else if ((month == 5 && day >= 22) || (month == 6 && day <= 21))
			znakZodiak = "��������";
		else if ((month == 6 && day >= 22) || (month == 7 && day <= 22))
			znakZodiak = "���";
		else if ((month == 7 && day >= 23) || (month == 8 && day <= 22))
			znakZodiak = "���";
		else if ((month == 8 && day >= 23) || (month == 9 && day <= 23))
			znakZodiak = "����";
		else if ((month == 9 && day >= 24) || (month == 10 && day <= 23))
			znakZodiak = "����";
		else if ((month == 10 && day >= 24) || (month == 11 && day <= 21))
			znakZodiak = "��������";
		else if ((month == 11 && day >= 22) || (month == 12 && day <= 21))
			znakZodiak = "�������";
		else if ((month == 12 && day >= 22) || (month == 1 && day <= 21))
			znakZodiak = "�������";
		else if ((month == 1 && day >= 22) || (month == 2 && day <= 19))
			znakZodiak = "�������";
		else if ((month == 2 && day >= 20) || (month == 3 && day <= 20))
			znakZodiak = "����";
		else
			znakZodiak = "��������� ����� �� ������������� �� ������ �������� ����� �������. ����� ������ ���� �� 1 �� 124";
		switch(year % 12) {
		case 0: 
			animalYear = "��� ��������";
			break;
		case 1:
			animalYear = "��� ������";
			break;
		case 2: 
			animalYear = "��� ������";
			break;
		case 3: 
			animalYear = "��� ������";
			break;
		case 4: 
			animalYear = "��� �����";
			break;
		case 5: 
			animalYear = "��� ������";
			break;
		case 6:
			animalYear = "��� �����";
			break;
		case 7: 
			animalYear = "��� �����";
			break;
		case 8: 
			animalYear = "��� �������";
			break;
		case 9: 
			animalYear = "��� ����";
			break;
		case 10: 
			animalYear = "��� ������";
			break;
		case 11: 
			animalYear = "��� ����";
			break;
		default:
			animalYear = "���-�� ����� �� ���";
		}
		System.out.println("����: " + znakZodiak);
		System.out.println("����: " + animalYear);
		scan.close();
	}

}

