package homeWorkJava.homework02_Operatory_i_peremennye;
/*
 * Задание 12
 * Ученикам первого класса дают 1 пирожок. Если вес первоклассника менее 30 кг,
 * дополнительно дают 1 стакан молока и ещё 1 пирожок. В первых классах школы учится n
 * учеников. Стакан молока имеет емкость 200 мл, а упаковка молока – 0,9 л.
 * Написать программу, которая определит количество пакетов молока и пирожков, необходимых каждый день для
 * условий:
 * ■ если в школе 100% всех учеников, у которых вес меньше 30 кг;
 * ■ если в школе 60% учеников имеют вес меньше 30 кг.
 * ■ если в школе 1% учеников имеют вес меньше 30 кг.
 * (!!!) Учесть, что нельзя купить два с половиной пакета
 * молока; можно купить два или три.
 */
import java.util.Scanner;
public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Введите количество учеников");
		Scanner scan = new Scanner(System.in);
		int countStudent = scan.nextInt();
		System.out.println("Введите процент учеников, вес которых меньше 30 кг.");
		int percent = scan.nextInt();
		int milk;
		int bulka = 0;
		double milkPackage;
		if (percent == 100) {
			bulka = 2 * countStudent;
			milk = 200 * countStudent;
			milkPackage = (double)Math.round(milk / 900);
			if (milkPackage  < 1)
				milkPackage = 1;
		}
		else {
			float lgota = (float)(countStudent * percent) / 100;
			System.out.println(lgota);	
			float notLgota = (float)countStudent - lgota;
			System.out.println(notLgota);	
			float tempBulka =  notLgota + (2 * lgota);
			if (tempBulka - (int)tempBulka != 0)
				bulka = (int)(tempBulka) + 1;
			else
				bulka = (int)(tempBulka);
			float tempMilkPackage;
			tempMilkPackage = (200 * lgota / 900);
			if (tempMilkPackage - (int)tempMilkPackage != 0)
				milkPackage = (int)(tempMilkPackage) + 1;
			else
				milkPackage = (int)(tempMilkPackage);
			
			System.out.println(milkPackage);
			System.out.println(bulka);	
		}
		System.out.println("Необходимое количество булок - " + bulka + " , молока - " + milkPackage + "шт");
		
		scan.close();
	}

}
