package Exeption;

import java.io.IOException;

public class Task05 {

    public static void main(String[] args) throws Exception{
	Runner run = new Runner();
	
	try {
	    run.halt();
	}catch(RuntimeException e) {
	    System.out.println("halt");
	}catch(IOException e1) {
	    throw e1;
	}
	
	
    }

}
