
package boletin2_10;

import java.util.Scanner;


public class Boletin2_10 {

    
    public static void main(String[] args) {
      //entrada por teclado 
        
        int dinero, billete100, billete20, billete5, moneda1;
        
        Scanner obx = new Scanner(System.in);
        System.out.print("introducir diñeiro: ");
        dinero = obx.nextInt();
         
        billete100 = dinero/100;
        dinero= dinero-billete100*100;
        
        billete20 = dinero/20;
        dinero= dinero-billete20*20;
        
        billete5 = dinero/5;
        dinero= dinero-billete5*5;
        
        moneda1 = dinero/1;
        dinero= dinero-moneda1*1;
        
        
        
        System.out.println("billetes de 100 =" +billete100);
        System.out.println("billetes de 20 =" +billete20);
        System.out.println("billetes de 5 =" +billete5);
        System.out.println("moedas de 1 =" + moneda1);
        
       
        
    }
    
}
