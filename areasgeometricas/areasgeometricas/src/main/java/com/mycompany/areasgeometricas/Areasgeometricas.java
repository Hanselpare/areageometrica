/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.areasgeometricas;

/**
 *
 * @author hanpa
 */
public class Areasgeometricas {


    public static void main(String[] args) {
        Scanner entra=new Scanner(System.in);
        System.out.print("Diametro de la figura=");
        float diametro=entra.nextFloat();
        System.out.print("Altura de la figura=");
        float altura=entra.nextFloat();
        double volumen;
        float pi=3.1416f;
        float radio=diametro/2;
        volumen=pi*Math.pow(radio, 2)*altura;
        System.out.println("Vol de la figura es:"+volumen);
        
        
    }
    
}