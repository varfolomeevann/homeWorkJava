package homeWorkJava.homework3_if_else;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/*
 * ������� 7
 * ������������ ������ � ���������� �����. ���������
 * ������ ����������, � ����� ��������� ������� ����� � � ��������� ��� ��������. ������� � �������: ���������, ����
 * ����� ������� ��������� ��� ���������, ���� ����� ��������� � ������������� ��������. ���� ������� �����, � ��
 * �����, ������� ������. ���� ������ �� ��������� �� � ������, �� � ������, ������� ����������� �����������.
 */
public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String symbol = scan.nextLine();
		Pattern patternLat = Pattern.compile("[a-zA-Z]{1}");
        Matcher matcerLat = patternLat.matcher(symbol);
        Pattern patternKyr = Pattern.compile("[�-��-�]{1}");
        Matcher matcerKyr = patternKyr.matcher(symbol);
        Pattern patternNum = Pattern.compile("[0-9]{1}");
        Matcher matcerNum = patternNum.matcher(symbol); 
		
        if (matcerLat.find())
        	System.out.println("��������");
        else if (matcerKyr.find())
        	System.out.println("��������");
        else if (matcerNum.find())
        	System.out.println("�����");
        else
        	System.out.println("���������� ����������");
        
        scan.close();
	}

}
