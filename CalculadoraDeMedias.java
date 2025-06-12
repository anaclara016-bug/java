import java.util.Scanner;

public class CalculadoraDeMedias {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];
        
        System.out.println("Digite as 8 notas anuais do aluno:");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Nota %d: ", i + 1);
            notas[i] = scanner.nextDouble();
        }
        
        double[] mediasBimestrais = calcularMediasBimestrais(notas);
        double[] mediasSemestrais = calcularMediasSemestrais(mediasBimestrais);
        double mediaFinal = calcularMediaFinal(mediasSemestrais);
        
        exibirMedias(mediasBimestrais, mediasSemestrais, mediaFinal);
        
        scanner.close();
    }
    
    // Calcula a média dos bimestres (2 notas por bimestre)
    public static double[] calcularMediasBimestrais(double[] notas) {
        double[] medias = new double[4];
        for (int i = 0; i < 4; i++) {
            medias[i] = (notas[i * 2] + notas[i * 2 + 1]) / 2;
        }
        return medias;
    }
    
    // Calcula a média dos semestres (2 bimestres por semestre)
    public static double[] calcularMediasSemestrais(double[] mediasBimestrais) {
        double[] medias = new double[2];
        for (int i = 0; i < 2; i++) {
            medias[i] = (mediasBimestrais[i * 2] + mediasBimestrais[i * 2 + 1]) / 2;
        }
        return medias;
    }
    
    // Calcula a média final (2 semestres)
    public static double calcularMediaFinal(double[] mediasSemestrais) {
        return (mediasSemestrais[0] + mediasSemestrais[1]) / 2;
    }
    
    // Exibe as médias formatadas
    public static void exibirMedias(double[] mediasBimestrais, double[] mediasSemestrais, double mediaFinal) {
        System.out.println("\nMédias Bimestrais:");
        for (int i = 0; i < mediasBimestrais.length; i++) {
            System.out.printf("Bimestre %d: %.2f\n", i + 1, mediasBimestrais[i]);
        }
        
        System.out.println("\nMédias Semestrais:");
        for (int i = 0; i < mediasSemestrais.length; i++) {
            System.out.printf("Semestre %d: %.2f\n", i + 1, mediasSemestrais[i]);
        }
        
        System.out.printf("\nMédia Final do Ano: %.2f\n", mediaFinal);
    }
}

