package Collection;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;

public class Practik {

    public static void main(String[] args) {
	
        ArrayList<String> list = new ArrayList<String>();
        GregorianCalendar calendar = new GregorianCalendar();
        long t = calendar.get(Calendar.MILLISECOND);
        Date date0 = new Date();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");
        Date date00 = new Date();
        System.out.println(list.size());
        GregorianCalendar calendar1 = new GregorianCalendar();
        long t2 = calendar1.get(Calendar.MILLISECOND);
        
        System.out.println("Изменение эл-та по индексу " + (t2-t));
        System.out.println(date0.getTime());
	System.out.println(date00.getTime());
	System.out.println((date0.getTime() > date00.getTime())?
	               "date1 позже date2" : "date1 раньше date2");
        ArrayList<String> list1 = new ArrayList<String>(list);
        System.out.println(list1);
        list1.add("1223");
        System.out.println(list1);

        int i = list1.indexOf("1223");
        System.out.println("Индекс " + i);
        
        list1.set(3, "111111111111111111111");
       
        Date date01 = new Date();
        
        System.out.println(list1);

        for (String a: list1) {
            System.out.println(a);
        }
        HashSet<Fish> fishes = new HashSet<Fish>();
        Date date1 = new Date();
        fishes.add(new Fish("carp",2.2,123.52)); 
        fishes.add(new Fish("som",12.2,12322.67));
        Date date2 = new Date();
	System.out.println(date1);
	System.out.println(date2);
	System.out.println((date1.getTime() > date2.getTime())?
	               "date1 позже date2" : "date1 раньше date2");
        System.out.println(fishes);
        fishes.add(new Fish("carp",2.2,123.52)); 
        System.out.println(fishes);
//        GregorianCalendar calendar1 = new GregorianCalendar();
//        long t2 = calendar1.get(Calendar.MILLISECOND);
        System.out.println(t2);
    }
    

}
