/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.calcuradora;

/**
 *
 * @author FATEC ZONA LESTE
 */


public class Calculadora {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Eu, Nicolly, estou desenvolvendo um código em Java para fazer uma calculadora!
        // Static e Void são algo estático que não tem nenhum retorno de valor, mas vai estar ali independente da criação.
        // é também uma combinação de palavras-chave que define o comportamento e a visibilidade de um método.
        // String args é um parâmetro que recebe dados da linha de comando 
        // system.out e system.in chamam os valores estáticos.
    
        
        //definição de dois números, double usado para casas decimais.
        double numero1 = 50.5;
        double numero2 = 24.3;
        
        //agora vamos realizar operações matememáticas
        
       double soma = numero1 + numero2;
       double subtracao = numero1 - numero2;
       double multiplicacao = numero1 * numero2;
       double divisao = numero2 != 0 ? numero1 / numero2 : Double.NaN; //evita divisão por zero
       double resto = numero1 % numero2;
    
    //Agora pare exibir os resultados
    
    System.out.println("Resultados das operações:");
    System.out.println("Soma: " + soma);
    System.out.println("Subtração: " + subtracao);
    System.out.println("Multiplicação: " + multiplicacao);
    System.out.println("Divisão: " + (numero2 != 0 ? divisao :
            "Indefinida (divisão por zero)"));
    System.out.println("Resto da Divisão: " + resto);
    
    }
    
}
