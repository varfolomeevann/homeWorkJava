package homeWorkJava.homework02_Operatory_i_peremennye;
/*
 * Задание 6
 * Есть прямоугольник, у которого известна ширина w и
 * высота h. Найти и вывести на консоль периметр и площадь
 * заданного прямоугольника. Высота и ширина прямоугольника должна задаваться константными переменными в коде
 * программы. 
 */
public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float w = 10;
		final float h = 20;
		
		float perimetr = 2 * w + 2 * h;
		float square = w * h;
		System.out.println("Периметр прямоугольника со сторонами " + w +" и " + h + " равен " + perimetr);
		System.out.println("Площадь прямоугольника со сторонами " + w +" и " + h + " равена " + square);
	}

}
