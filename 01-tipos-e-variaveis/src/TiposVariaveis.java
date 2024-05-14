public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;
        System.out.println(salarioMinimo);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        System.out.println(numeroCurto2);

        // variables vs constants
        
        int numero = 5;
        numero = 10;
        System.out.println(numero);

        // a variavel se torna uma constante
        
        final double VALOR_DE_PI = 3.14;
        System.out.println(2 * VALOR_DE_PI);
    }
}
