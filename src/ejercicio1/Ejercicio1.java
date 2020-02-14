/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author l11m07
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Integer RepetidosArray[]=new Integer[]{5,6,5,4,1,9,7,3,6,8,5,2,6};
      
       int NroRepetido=RepetidosArray.length;
        
        for (int i = 0; i < NroRepetido; i++) {
            
            boolean repetido=false;
           System.out.println(RepetidosArray[i]);
           
            for (int j = 0; j < NroRepetido; j++) {
               
                if (RepetidosArray[i]==RepetidosArray[j]&& j!=i) {
                     repetido=true;
                    //System.out.println("Numero repetido "+RepetidosArray[i]+ "en la posicion "+j);
                     break;
                }
                
            }
            if (!repetido) {
                 System.out.println("Numero repetido "+RepetidosArray[i]+ "en la posicion "+i);
                 break;
            }
        }
       
    }
    
}
