/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package api2;
import java.util.Scanner;

/**
 *
 * @author jaifa
 */
public class Api2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner miTeclado = new Scanner(System.in);

        String nombre;
        String apellido;
        int nota;
        int contador = 0;
        
        while (contador < 10){
            
            try {
                
                System.out.print("Ingrese su nombre: ");
                nombre = miTeclado.nextLine();
                
                System.out.print("Ingrese su apellido: ");
                apellido = miTeclado.nextLine();
        
                System.out.print("Ingrese su nota: ");
                nota = miTeclado.nextInt();
        
                if (nota< 1 || nota > 10){
                throw new Exception("error: el rango de nota es entre 1 y 10");
        }
                
                
            } catch (Exception e) {
                
                System.out.println(e);
            }
        
   
        contador++;
        miTeclado.nextLine();        }
    }
    
}
