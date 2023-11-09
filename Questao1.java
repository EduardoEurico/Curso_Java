package Exercicios;
import java.util.Scanner;
public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassQ1 c =new ClassQ1();
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("Qual o 1º valor de idade");
		c.x=sc.nextInt();
		System.out.println("Qual o 2º valor de idade");
		c.y=sc.nextInt();
		System.out.println("Qual o 3º valor de idade");
		c.z=sc.nextInt();
		
		sc.close();
		
		if (c.y<=c.x && c.x<=c.z ) {
			System.out.println(c.x);
		}else if (c.x<=c.y && c.y<=c.z ) {
			System.out.println(c.y);
		}
		else if (c.x<=c.z && c.z<=c.y ) {
			System.out.println(c.z);
		}
	}

}
