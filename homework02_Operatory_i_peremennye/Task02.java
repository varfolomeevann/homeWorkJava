package homeWorkJava.homework02_Operatory_i_peremennye;
/*
 * ������� 2
 * � ���������� n �������� ����������� (�����) ����������� �����.
 * �������� ���������, ����������� � ��������� �� ����� ����� ���� ����� n.
 */

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153;
		int number1;
		int number2;
		int number3;
		number1 = n /100;
		number2 = (n % 100)/ 10;
		number3 = n % 10;
		System.out.println(number1 + number2 + number3);
		
	}

}
