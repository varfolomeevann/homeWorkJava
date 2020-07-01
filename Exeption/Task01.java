package Exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task01 {
    
    public static void array() {
	int n;
	n = (int)(Math.random() * (11 - 1) + 1);
	System.out.println("Размер массива " + n);
	int array[] = new int[n];
	for (int i = 0; i < array.length; i ++) {
	    try {
		array[i] = (int)(Math.random() * (11- (-11)) - 11);
	    }catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Выход за границы массива");
	    }
	}
	Scanner scan = new Scanner(System.in);
	System.out.println("Введите целое число");
	int number;
	try {
	    number = scan.nextInt();
	    for (int i : array) {
		    try { 
			System.out.println(i / number) ;
		    }catch(ArithmeticException e) {
			System.out.println(i);
			System.out.println("Деление на ноль запрещено, введите другое число");
		    }
	    }
	    
	}catch(InputMismatchException e) {
	    System.out.println("Введите целое число");
	}finally {
	    scan.close();
			    
	}

    }
    
    public static void main(String[] args) {
	
	array();

    }

}
