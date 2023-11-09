package Exercicios;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ClassQ2 c= new ClassQ2();
		
		
		int[] vetor= new int[4];
		
		for (int i=0;i<4;i++) {
			System.out.printf("Qual o nivel de jogo do %dº amigo: ",i +1);
			c.n1=sc.nextInt();
			
			vetor[i] =c.n1;

		}
		
		c.soma1=vetor[0]+vetor[3];
		c.soma2=vetor[1]+vetor[2];
		c.res=c.soma1-c.soma2;
		System.out.println(c.res);
		sc.close();
	}

	}

