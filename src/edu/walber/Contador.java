package edu.walber;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
    
        try {
            // chamar método com lógica de contagem
            int iteracoes = contar(parametroUm,parametroDois);
            imprimir(iteracoes);
        } catch (ParametrosInvalidosException e) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            
        }
    }

    static int contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException();
        int contagem = parametroDois - parametroUm;
        return contagem;
    }
    
    static void imprimir(int iteracoes){
        for (int index = 0; index < iteracoes; index++) {
            System.out.println("Imprimindo o número "+(index+1));
        }
    }
}
