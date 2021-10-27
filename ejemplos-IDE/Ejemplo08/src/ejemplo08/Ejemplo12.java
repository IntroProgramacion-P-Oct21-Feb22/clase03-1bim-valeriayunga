/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo08;

/**
 *
 * @author reroes
 */
public class Ejemplo12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejemplo, expresión: not (a == c or b > d) and (c > b + d * 2)
        int a = 20;
        int b = 1;
        int c = 9;
        int d = 2;
        
        boolean resultado = !(a == c || b > d)  && (c > b + d * 2);
        System.out.println(resultado);

    }

}
