import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        //Sem quebra de linha no final
        // System.out.print("Bom dia!");
        //Com quebra de linha no final
        System.out.println("Olá mundo!");
        System.out.println("Bom dia!");

        //Decraração de variável inteira
        int y = 32;

        System.out.println(y);

        //Deraração de variável double e controlando o número de casas.

        double x = 10.35784;

        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);

        // Concatenar
        System.out.println("Resultado = " + x + " metros");
        System.out.printf("Resultado = %.2f metros%n", x);

        // Concatenar vários elementos
        // marcadores: %f -> ponto flutuante | %d -> inteiro | %s -> texto | %n -> quebra de linha
        String nome = "Kauã";
        int idade = 21;
        double renda = 3200.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reias%n", nome, idade, renda);
    }
}
