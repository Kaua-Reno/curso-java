public class App {
    public static void main(String[] args) throws Exception {
        // Processamento de dados, Casting
        // Ao utilizar float colocar f no lugar do .0

        // Exemplo 1
        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;

        System.out.println(area);

        // Exemplo 2

        int a, b2;
        double resultado;

        a = 5;
        b2 = 2;

        resultado = (double) a / b2;

        System.out.println(resultado);

        // Exemplo 3
        double a2;
        int b3;

        a2 = 5.0;
        b3 = (int) a2;

        System.out.println(b3);
    }
}
