// Calculadora de soma de dois números inteiros, soma tres numeros inteiros e soma dois números decimais.

public class Calculadora
{
    private String ultimaOperacao;
     
    public int somar(int a, int b)
    {
       int resultado = a + b;
       ultimaOperacao = a + " + " + b + " = " + resultado;
       return resultado;
    }
    
    public int somar(int a, int b, int c)
    {
        int resultado = a + b + c;
        ultimaOperacao = a + " + " + b + " + " + c + " = " + resultado;
        return resultado;   
    }
    
    public double somar(double a, double b)
    {
        double resultado = a + b;
        ultimaOperacao = a + " + " + b + " = " + resultado;
        return resultado;
    }
    
    public String getUltimaOperacao()
    {
        return ultimaOperacao;
    }
}
