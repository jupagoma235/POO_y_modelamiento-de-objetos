/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author jpgonzalez
 */
public class Capture implements ICapture{

private float[] listNumbers= new float[15];
private Random aleatorio;

    public Capture() {
        
    }        
       
    @Override
    public void capture() {
        int option=0;
        Scanner sc = new Scanner(System.in);        
        System.out.println("Usted tiene actualmente los siguientes números");
        for(int i=0;i<15;i++){
            listNumbers[i]=1 + new Random().nextFloat() * (30 - 1);
        }        
        printArray(listNumbers);
        System.out.println("Como desea ordenarlos? digite 1 para QuikSort o 2 para Burbuja");
        option=sc.nextInt();
        switch(option){
            case 1:
                quikShort();
                break;
            case 2:
                System.out.println("#### Array ordenado con metodo burbuja ####");
                bubble(listNumbers);                
                System.out.println("###########################################");
                break;
            default:
                break;
        }
            System.out.println("Opcion no valida, si desea salir digite 1, si desea repetir el proceso digite 2");
        
    }
    
    
     

    @Override
    public void quikShort() {
        
    }

    @Override
    public void bubble(float[] lista1) {
        int cicle1 ;
        int cicle2;
        float aux;
        for (cicle1 = 0; cicle1 < lista1.length - 1; cicle1++) {
            for (cicle2=0;cicle2 < lista1.length-cicle1-1;cicle2++) {
                if(lista1[cicle2+1] < lista1[cicle2]){
                    aux=lista1[cicle2+1];
                    lista1[cicle2+1]=lista1[cicle2];
                    lista1[cicle2] = aux;
                }
            }
        }
        printArray(lista1);
    }

    @Override
    public void printArray(float[] lista2) {
        for(int i=0;i<15;i++){
            System.out.println(lista2[i]);
        }
    }
    
}
