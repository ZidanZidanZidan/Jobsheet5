/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

import java.util.Scanner;

/**
 *
 * @author ZIDANE
 */
public class InputMismatchException {
    
    public static void main(String[]args){
        //int a = 100;
        int b =4;
        
        System.out.println("Masukkan nilai a");
        Scanner console = new Scanner(System.in);
        int a =console.nextInt();
        
        System.out.println("Masukkan nilai b");
        int c = a;
        double res=b/c;
        System.out.println("Hasilnya adalah : "+res);
        
    }
    
}
