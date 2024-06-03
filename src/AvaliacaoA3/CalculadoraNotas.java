package AvaliacaoA3;

import java.util.ArrayList;
import java.util.Scanner;

// Classe principal
public class CalculadoraNotas {
    // Método principal que executa o programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Listas para armazenar notas e pesos
        ArrayList<Double> notasProvas = new ArrayList<>();
        ArrayList<Double> notasTrabalhos = new ArrayList<>();
        ArrayList<Double> notasParticipacoes = new ArrayList<>();

        double pesoProvas = 0.5; // Peso das provas (50%)
        double pesoTrabalhos = 0.3; // Peso dos trabalhos (30%)
        double pesoParticipacoes = 0.2; // Peso das participações (20%)

        System.out.println("Calculadora de Média Ponderada");

        // Coletar notas das provas
        System.out.println("Insira as notas das provas (digite -1 para terminar):");
        while (true) {
            double nota = scanner.nextDouble();
            if (nota == -1) break; // Condição de saída do loop
            notasProvas.add(nota); // Adiciona nota à lista
        }

        // Coletar notas dos trabalhos
        System.out.println("Insira as notas dos trabalhos (digite -1 para terminar):");
        while (true) {
            double nota = scanner.nextDouble();
            if (nota == -1) break; // Condição de saída do loop
            notasTrabalhos.add(nota); // Adiciona nota à lista
        }

        // Coletar notas das participações
        System.out.println("Insira as notas das participações (digite -1 para terminar):");
        while (true) {
            double nota = scanner.nextDouble();
            if (nota == -1) break; // Condição de saída do loop
            notasParticipacoes.add(nota); // Adiciona nota à lista
        }

        // Calcular média das provas
        double mediaProvas = calcularMedia(notasProvas);
        // Calcular média dos trabalhos
        double mediaTrabalhos = calcularMedia(notasTrabalhos);
        // Calcular média das participações
        double mediaParticipacoes = calcularMedia(notasParticipacoes);

        // Calcular média final ponderada
        double mediaFinal = (mediaProvas * pesoProvas) + (mediaTrabalhos * pesoTrabalhos) + (mediaParticipacoes * pesoParticipacoes);

        // Exibir resultados
        System.out.printf("Média das Provas: %.2f\n", mediaProvas);
        System.out.printf("Média dos Trabalhos: %.2f\n", mediaTrabalhos);
        System.out.printf("Média das Participações: %.2f\n", mediaParticipacoes);
        System.out.printf("Média Final Ponderada: %.2f\n", mediaFinal);

        scanner.close(); // Fechar o scanner
    }

    // Método auxiliar para calcular a média de uma lista de notas
    public static double calcularMedia(ArrayList<Double> notas) {
        if (notas.isEmpty()) return 0; // Verificar se a lista está vazia
        double soma = 0; // Inicializar a soma
        for (double nota : notas) {
            soma += nota; // Somar as notas
        }
        return soma / notas.size(); // Calcular e retornar a média
    }
}
