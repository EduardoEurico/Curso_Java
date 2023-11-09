package Exercicios;

public class Q1 {
    public static void main(String[] args) {
    	Class c =new Class();
        for(int i = 2; i <= c.num; i++) {
            boolean primo = true;        
            for(int j = 2; j < i; j++) {            
                if(i % j == 0) {
                    primo = false;
                }
            }
            if(primo) {
                System.out.println(i);
            }          
        }

    }
}