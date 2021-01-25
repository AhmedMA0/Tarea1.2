/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1.pkg2;

/**
 *
 * @author aaa
 */
import java.util.Scanner;

public class Tarea12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero a comparar: ");
	int a = sc.nextInt();
        
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Introduce el otro: ");
	int b = sc1.nextInt();
        
        if(a > b) {
            System.out.println("El número mayor es: " + a);
        } 
        
        else if (a < b) {
            System.out.println("El número mayor es: " + b);
        }
        
        else{
            System.out.println("Los números son iguales");
        }
    } 
}
