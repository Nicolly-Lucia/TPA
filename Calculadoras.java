/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoras;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Calculadoras {

    public static void main(String[] args) {
         // Eu, Nicolly, estou desenvolvendo um código em Java para fazer algumas cálculadoras!
        // Static e Void são algo estático que não tem nenhum retorno de valor, mas vai estar ali independente da criação.
        // é também uma combinação de palavras-chave que define o comportamento e a visibilidade de um método.
        // String args é um parâmetro que recebe dados da linha de comando 
        // system.out e system.in chamam os valores estáticos.
    
        
        //definição de dois números, double usado para casas decimais.
        double numero1 = 487.5;
        double numero2 = 330.3;
        double quadrado = 5;
        double base = 7;
        double altura = 7;
        double diagonal1 = 16;
        double diagonal2 = 12;
        
        //agora vamos realizar operações matememáticas
        
       double soma = numero1 + numero2;
       double subtracao = numero1 - numero2;
       double multiplicacao = numero1 * numero2;
       double divisao = numero2 != 0 ? numero1 / numero2 : Double.NaN; //evita divisão pelo número zero
       double resto = numero1 % numero2;
       double areadoquadrado = quadrado * quadrado;
       double areadoretangulo = base * altura;
       double areadolosango = diagonal1 * diagonal2 /2;
       double areadotriangulo = base * altura / 2;
       double areadacircunferencia = Math.PI * Math.pow(numero1,2);
       double media = numero1 + numero2 /2;
    
    //Agora pare exibir os resultados
    
    System.out.println("Resultados das operações:");
    System.out.println("Soma: " + soma);
    System.out.println("Subtração: " + subtracao);
    System.out.println("Multiplicação: " + multiplicacao);
    System.out.println("Divisão: " + (numero2 != 0 ? divisao :
            "Indefinida (divisão por zero)"));
    System.out.println("Resto da Divisão: " + resto);
    System.out.println("Área do Quadrado: " + areadoquadrado);
    System.out.println("Área do Retângulo: " + areadoretangulo);
    System.out.println("Área do Losango: " + areadolosango);
    System.out.println("Área do Triângulo: " + areadotriangulo);
    System.out.println("Área da Circunferência: " + areadacircunferencia);
    System.out.println("Média dos números 1 e 2: " + media);
    }
}
