package homeWorkJava.homework04_1_Cikly;
/*
 * ������� 5
 * �������� ���������, ������� ����� ���������, ��������
 * �� �����, ��������� � ���������� ����������� (���������
 * ���������� � ����� ������������). ��������, 123454321
 * ��� 221122 � ���������. ��������� ������ ������� YES,
 * ���� ����� �������� �����������, � NO � � ��������������� ������. 
 */
import java.util.Scanner;
public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������� �����");
		String palindrom = scan.nextLine();
		int priznak = 0;
        int j = palindrom.length() - 1;
        for (int i = 0; i <= j; i++) {
        	if ((palindrom.charAt(i) == palindrom.charAt(j)) && (i != j)) {
                priznak = 1;
            }
            else if ((i == j ) && (priznak == 1))
            	 priznak = 1;
            else
            	priznak = 0;
            j--;
        }
        if (priznak == 1)
        	System.out.println("YES");
        else
            System.out.println("NO");
		scan.close();
	}

}
