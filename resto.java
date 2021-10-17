import java.util.Scanner;

//Leia um número inteiro e exiba o resto da divisão deste número por 2.



public class Inteiro
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        float n1; 
        n1 = 0;
       
        System.out.print("Digite o número inteiro : ");
        n1 = entrada.nextInt();
    
        System.out.println("Resto: " + n1 % 2);
        
        
    }
}
