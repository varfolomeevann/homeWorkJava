package homeWorkJava.homework04_1_Cikly;
/*
 * ������� 3
 * ������������� ����� ��� ����� ���������� � ����������� �����, ������� ����� �����
 *  ����� ����, ����������� � �������, ������ ���������� ��� ����.
 * �������� �� ������ ��� ����� ���������� � ��������� ��
 * 10 �� 1 000 000.
 */
public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i = 10; i<= 1000000; i ++) {
			int numberAmstrong = 0;
			int numberCifr = 0;
			int selfCifr = i;
			int selfCifr1 = i;
			while (selfCifr > 0) {
				selfCifr = selfCifr/10;
		        numberCifr ++;
		    }
			while (selfCifr1 > 0) {
				numberAmstrong += Math.pow((double)(selfCifr1 % 10),(double)numberCifr);
				selfCifr1 = selfCifr1 / 10;
			}
			if (i == numberAmstrong)
				System.out.print(i + " ");
		}
	}

}
