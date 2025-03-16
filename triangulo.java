
package ado4.poligonos;

import java.util.Scanner;
public class TRIANGULO {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos lados do triângulo
        System.out.print("Digite o valor do lado A: ");
        int A = scanner.nextInt();
        System.out.print("Digite o valor do lado B: ");
        int B = scanner.nextInt();
        System.out.print("Digite o valor do lado C: ");
        int C = scanner.nextInt();

        // Verifica se os valores formam um triângulo
        if (A >= (B + C) || B >= (A + C) || C >= (A + B)) {
            System.out.println("Não é um triângulo.");
        } else {
            // Identifica o tipo de triângulo
            if (A == B && B == C) {
                System.out.println("Triângulo Equilátero (Todos os lados são iguais).");
            } else if (A == B || A == C || B == C) {
                System.out.println("Triângulo Isósceles (Dois lados são iguais).");
            } else {
                System.out.println("Triângulo Escaleno (Todos os lados são diferentes).");
            }
        }

        scanner.close();
    }
}


    
