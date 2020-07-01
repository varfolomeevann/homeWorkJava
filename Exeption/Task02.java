package Exeption;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Task02 {
    
    public static void mistakes(int number) throws IOException, Task02Exception {
	if (number < 0) {
	    throw new IOException();
	}else if (number > 100){
	    throw new RuntimeException();
	}else {
	    throw new Task02Exception("Свое собственное исключение, т.к. введенное число больше 0, но меньше 100");
	}
	
    }

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	try {
	    int number = scan.nextInt();
		try {
		    mistakes(number);
		}catch(IOException e){
		    System.out.println("checked исключение, т.к. ввели отрицательное число");
		}catch(RuntimeException e1){
		    System.out.println("unchecked исключение, т.к. ввели неотрицательное число");
		}catch(Task02Exception e2) {
		    System.out.println(e2.getMessage());
		}
		
	}catch(InputMismatchException er) {
	    System.out.println("Введите число");
	}finally {
	    scan.close();
	}
	
	
    }

}
