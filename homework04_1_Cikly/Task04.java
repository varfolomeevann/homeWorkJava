package homeWorkJava.homework04_1_Cikly;
/*
 * ������� 4
 * ����������� ����� � ����������� �����, ������ ����� ����
 * ����� ����������� ��������� (�� ���� ���� �������������
 * ���������, �������� �� ������ �����).
 * �������� �� ������ ��� ����������� ����� � ��������� ��
 * 0 �� 1 000 000.
 * �������:
* 1-� ����������� �����: 6 ����� ��������� �����������
* �������� � 1, 2, 3; �� ����� ����� 6.
* 2-� ����������� �����: 28 ����� ��������� �����������
* ��������: � 1, 2, 4, 7, 14; �� ����� ����� 28.
 */
public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int delitel;
		for (int i = 0; i<= 1000000; i++) {
			int sum = 0;
			delitel = 1;
			do {
				if ((delitel != i) && ( i % delitel == 0))
					sum += delitel;
				delitel ++;
			}while(delitel < i);
			if  (i == sum)
				System.out.print(i + " ");
		}
	}

}
