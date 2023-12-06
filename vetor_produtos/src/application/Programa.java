package application;

import entities.Produtos;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ler =new Scanner(System.in);

        System.out.print("Tamanho do vetor para produtos: ");
        int n = ler.nextInt();
        Produtos[] PrVetor = new Produtos[n];

        for (int i = 0; i < PrVetor.length; i++){
            ler.nextLine();
            System.out.print("Produtos há ser cadastrados: ");
            String name = ler.nextLine();
            System.out.print("Preço do produto: $");
            double price = ler.nextDouble();
            PrVetor[i] = new Produtos(name,price);
        }

        double sum = 0;
        for (int i = 0; i < PrVetor.length; i++){
            sum += PrVetor[i].getPrice();
        }
        double media =  sum/ PrVetor.length;
        System.out.printf("A media de preço é de: %.2f%n", media);

        ler.close();
    }
}
