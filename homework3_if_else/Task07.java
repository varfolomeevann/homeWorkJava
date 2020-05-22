package homeWorkJava.homework3_if_else;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/*
 * Задание 7
 * Пользователь вводит с клавиатуры букву. Программа
 * должна определить, в какой раскладке введена буква – в латинской или кирилице. Вывести в консоль: «латиница», если
 * буква введена латиницей или «кирилица», если буква относится к кирилическому алфавиту. Если введена цифра, а не
 * буква, вывести «цифра». Если символ не относится ни к буквам, ни к цифрам, вывести «невозможно определить».
 */
public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String symbol = scan.nextLine();
		Pattern patternLat = Pattern.compile("[a-zA-Z]{1}");
        Matcher matcerLat = patternLat.matcher(symbol);
        Pattern patternKyr = Pattern.compile("[а-яА-Я]{1}");
        Matcher matcerKyr = patternKyr.matcher(symbol);
        Pattern patternNum = Pattern.compile("[0-9]{1}");
        Matcher matcerNum = patternNum.matcher(symbol); 
		
        if (matcerLat.find())
        	System.out.println("Латиница");
        else if (matcerKyr.find())
        	System.out.println("Кирилица");
        else if (matcerNum.find())
        	System.out.println("Цифра");
        else
        	System.out.println("Невозможно определить");
        
        scan.close();
	}

}
