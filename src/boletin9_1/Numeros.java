
package boletin9_1;

import javax.swing.JOptionPane;


public class Numeros {
    
    
    
    //cont
    public Numeros(){
    }
   //metd.
    public void numeros(){
        int num,cp=0, cn=0, cc=0;//Contador para os positivos, negativos e os ceros
        for (int i=1; i<10; i++){ 
            num=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero : "));
            
        
        if(num>0) 
            cp++;
                
        else if (num<0)
            cn++;
        else
            cc++;
        }  
   
       System.out.println("Positivos =  " + cp + " Negativos =  " + cn + " ceros = " + cc );
        
   }
        
                
                
  }
    

