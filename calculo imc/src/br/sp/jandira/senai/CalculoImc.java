package br.sp.jandira.senai;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalculoImc {

    public static void main(String[] args) {

        //entrada de dados 
        Scanner leitor = new Scanner(System.in);

        double peso, altura = 0, imc;
        String auxilio, classificacao = "";

        //solicitar dados
        //System.out.println("Qual seu peso?");
        auxilio = JOptionPane.showInputDialog(
                null,
                "qual seu peso?",
                "Calculadora imc",
                JOptionPane.QUESTION_MESSAGE);

        peso = Double.parseDouble(auxilio);

        //System.out.println("Qual sua altura?");
        auxilio = JOptionPane.showInputDialog(
                null,
                "qual sua altura?",
                "calculadora imc",
                JOptionPane.QUESTION_MESSAGE);

        altura = Double.parseDouble(auxilio);
        // processando os dados

        imc = peso / Math.pow(altura, 2.0);

        // saída para usuario
        if (imc < 18.5) {
            classificacao = "Voce esta abaixo do peso!";

        }

        if (imc >= 18.5 && imc < 25.0) {
            classificacao = "Parabens, seu peso é ideal!";

        }
        if (imc >= 25.0 && imc < 30.0) {
            classificacao = "Atenção, voce esta um poquinho acima do peso!";

        }
        if (imc >= 30.0 && imc < 35.0) {
            classificacao = "CUIDADO, voce esta com OBESIDADE grau I!";

        }
        if (imc >= 35.0 && imc < 40.0) {
            classificacao = "CUIDADO, voce esta com OBESIDADE grau II!";

        }
        if (imc >= 40.0) {
            System.out.println("CUIDADO, voce esta com OBESIDADE grau III!");

        }

        //exibir result
        classificacao = classificacao + ("\nSeu imc é " + String.format("%.3f", imc));
        JOptionPane.showMessageDialog(
                null,
                classificacao,
                "resultado:",
                JOptionPane.INFORMATION_MESSAGE);

    }
}
