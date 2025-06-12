import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler entrada do usuário
        Scanner input = new Scanner(System.in);

        // Solicita ao usuário que insira a temperatura em Celsius
        System.out.print("Digite a temperatura em graus Celsius (°C): ");
        double celsius = input.nextDouble();

        // Realiza as conversões
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        // Exibe os resultados de forma clara e informativa
        System.out.println("\n===== Conversão de Temperaturas =====");
        System.out.printf("Temperatura original: %.2f °C%n", celsius);
        System.out.printf("Convertida para Fahrenheit: %.2f °F%n", fahrenheit);
        System.out.printf("Convertida para Kelvin: %.2f K%n", kelvin);
        
        // Fecha o scanner
        input.close();
    }
}
