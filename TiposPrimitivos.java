/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiposprimitivos;

/** primeiro código em java feito no laboratório 111 
 *
 * @author FATE CZONA LESTE
 */
public class TiposPrimitivos {
public static void main(String[] args) {
// declaração de variáveis primitivas
    byte idade = 25; // armazena números pequenos (-128 a 127)
    short ano = 2025; // Armazena valores um pouco maiores -32.768 a 32.767 (5 casas decimais)
    int populacaoCidade = 500000; // tipo mais um comum para números inteiros
    long populacaoMundial = 8000000000L; // necessário "L" para valores longos
    
    float altura = 1.75f; // necessário 'f' no final para indicar float
    double peso = 72.5; // mais preciso que float
    
    char inicial = 'J'; // armazena um único caractere
    boolean ativo = true; // armazena verdadeiro ou falso
    
    // Exibição dos valores
    System.out.println("Idade: " + idade);
    System.out.println ("Ano: " + ano);
    System.out.println ("População da Cidade: " + populacaoCidade);
    System.out.println ("População Mundial: " + populacaoMundial);
    System.out.println ("Altura: " + altura + "m");
    System.out.println ("Peso: " + peso + "kg");
    System.out.println ("Inicial do nome: " + inicial);
    System.out.println ("Está ativo?" + ativo);
    }}
