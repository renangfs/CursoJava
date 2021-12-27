/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;
import java.util.Scanner;

/**
 *
 * @author renan
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();//utilizei 'nextLine' para ler string
        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();//utilizei 'nextInt' para ler numero inteiro
        
        System.out.println("Seu nome é " +nome+ " e sua idade é " +idade );
    }
    
}
