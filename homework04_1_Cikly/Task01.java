package homeWorkJava.homework04_1_Cikly;

/*
 * ������� 1
 * ����� ��������� � ��� ������������������ �����, � ������� ��� ������ ����� ������������������
 * ����� 0 � 1, �
 * ������ ����������� ����� ����� ����� ���� ����������.
 * �������� �� ������ ��� ����� ��������� � ��������� ��
 * 0 �� 10 000 000. 
 */
public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		int number1 = 0;
		int number2 = 1;
		System.out.print(number1 + " ");
		System.out.print(number2 + " ");
		
		for (; number <= 5702887 ;) {
			number = number1 + number2;
			number1 = number2;
			number2 = number;
			System.out.print(number + " ");
					
		}
						
	}
}

