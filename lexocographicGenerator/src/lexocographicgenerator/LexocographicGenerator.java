/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexocographicgenerator;

/**
 *
 * @author jtpresentacion
 */
public class LexocographicGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String charset = "ABC";
        for(int i=0; i<charset.length();i++){
            System.out.print(charset.charAt(i));
        }
    }
    
}
