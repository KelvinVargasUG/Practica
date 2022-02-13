package kelvin_vargas;

public class Kelvin_Vargas {

    public static Kelvin_Vargas Sr = new Kelvin_Vargas();
    
    public int potencia(int b, int e) {
        int resultadoPotencia = 1;
        for (int i = 0; i < e; i++) {
            resultadoPotencia *= b;
        }
        return resultadoPotencia;
    }

    public int factorial(int n) {
        int resultadoFactorial = 1;
        while (n != 0) {
            resultadoFactorial *= n;
            n = n - 1;
        }
        return resultadoFactorial;
    }

    public double exponencial(float x, float n) {
        float exponecial = 0;
        float suma = 0;
        for (int i = 0; i < n; i++) {
            exponecial = potencia((int) x, i) / factorial(i);
            suma = suma + exponecial;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("e^x");
        System.out.println("x = 0.5");
        System.out.println("El resultado de e^0.5 en la serie Maclaurin es: " + Sr.exponencial((float) 0.5, 7));
    }
}
