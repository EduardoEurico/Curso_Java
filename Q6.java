package Exercicios;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Qual o valor do 1� cateto");
		double c1 =sc.nextDouble();
		System.out.println("Qual o valor do 2� cateto");
		double c2 =sc.nextDouble();
		
		ClassQ6 c = new ClassQ6();
		
		c.setCateto1(c1);
		c.setCateto2(c2);
		
		double a= (c1*c2)/2;
		
		c.exibir(a);
		
		sc.close();
	}
	

}
