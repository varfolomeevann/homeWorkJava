package homeWorkJava.homework02_Operatory_i_peremennye;
/*
 * ������� 10
 * �������� ��������� ������� ���������� ���� � �����. �
 * ���������� �������� ���� (height) � ��� (weight). ������� ��
 * ������� ���������, ������� ��������� ����� ������� ���
 * �������� (��������� ��� = ���� - 110).
 */
public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int height = 172;
		final int weight = 56;
		int idealWeight = height - 110;
		int sum = (weight - idealWeight);
		if ( sum < 0)
			System.out.println("��� ���������� ������� " + -sum + " ��");
		else if (sum > 0)
			System.out.println("��� ���������� �������� " + sum + " ��");
		else
			System.out.println("��� ��� ���������!!!!!!!!!!");
	}

}
