package homework3_if_else;
import java.util.Scanner;
/*
 * ������� 10
 * ���������� ����� �������� �������������� ����, ��
 * ���������� ������ �������� N. �������, ��� �� ������
 * ����� ��������� M �������. ������� � ������� ����� ��������. 
 */
public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ����� ��������");
		Double numberFlat = scan.nextDouble();
		System.out.println("������� ���������� ������� �� �����");
		int countFlat = scan.nextInt();
		int entrance;
		entrance = (int)(numberFlat / (9 * countFlat));
		if (entrance == 0)
			entrance ++;
		else if ((numberFlat / (9 * countFlat)) % entrance != 0)
			entrance ++;
		System.out.println("����� �������� " + entrance);
		
		scan.close();
	}

}
