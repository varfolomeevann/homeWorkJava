package Collection;

import java.util.Date;

public class Time {

    public static void main(String[] args) {
	
	int array[] = new int[20];
	Date date1 = new Date();
	array[0] = 1;
	array[1] = 1;
	array[2] = 1;
	array[3] = 1;
	array[4] = 1;
	array[5] = 1;
	
	array[6] = 1;
	Date date2 = new Date();
	System.out.println(date1);
	System.out.println(date2);
	System.out.println((date1.getTime() > date2.getTime())?
	               "date1 позже date2" : "date1 раньше date2");

    }

}
