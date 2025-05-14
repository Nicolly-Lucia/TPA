/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.scanneremjava;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
public class ScannerEmJava {

    public static void main(String[] args) {
   Scanner scanner=new Scanner(System.in);
   //Leitura de texto
   
   System.out.print("Digite seu nome: ");
   String nome=scanner.nextLine();  
   
   //Leitura de um número inteiro
   System.out.print("Digite sua idade: ");
   int idade=scanner.nextInt();
   
   System.out.println("Olá, "+ nome + " Você tem " + idade + " anos.");
   scanner.close();
    }
}
