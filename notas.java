import java.util.Scanner;

//Leia duas notas semestrais inteiras e exiba a média anual.


public class Inteiro
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        int n1, n2, notaFinal;
        n1 = 0;
        n2 = 0;
        notaFinal = n1 + n2 / 2;
        
        System.out.print("Primeiro semestre: ");
        n1 = entrada.nextInt();
        
        System.out.print("Segundo semestre: ");
        n2 = entrada.nextInt();
        
        System.out.println("Média Anual: " + (n1+n2)/2);
    }
}
