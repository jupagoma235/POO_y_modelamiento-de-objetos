/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author jpgonzalez
 */
public class Capture implements ICapture{

private final float[] listNumbers= new float[15];
private float[] listOrderNumbers= new float[15];
private Random aleatorio;

    public Capture() {
        
    }        
       
    @Override
    public void Capture() {
        int option=0;
        int optionWhile=0;
        Scanner sc = new Scanner(System.in); 
        
        while(optionWhile==0){
            System.out.println("Usted tiene actualmente los siguientes números");
            for(int i=0;i<15;i++){
                listNumbers[i]=1 + new Random().nextFloat() * (30 - 1);
            }       
            
            listOrderNumbers=listNumbers;
            PrintArray(listNumbers);
            System.out.println("Como desea ordenarlos? digite 1 para QuikSort o 2 para Burbuja");
            option=sc.nextInt();
            switch(option){
                case 1:
                    QuickSort(0, 14);  
                    System.out.println("## Array ordenado con metodo quick sort ###");
                    PrintArray(listOrderNumbers);
                    System.out.println("###########################################");
                    break;
                case 2:
                    Bubble();
                    System.out.println("#### Array ordenado con metodo burbuja ####");
                    PrintArray(listOrderNumbers);                
                    System.out.println("###########################################");
                    break;
                default:
                    System.out.println("Opcion no valida, si desea salir digite 1, si desea repetir el proceso digite 2");
                    break;
            }
            
            System.out.println("Si desea salir digite 1, si desea repetir el proceso digite 2");
            option=sc.nextInt();
            if(option==1 || option>2 || option<1){optionWhile=1;}
            if(option==2){optionWhile=0;}
        }
        
    }
    
    
     

    @Override
    public void QuickSort(int start, int end) {
        if(start>=end) return;
        float pivote=listOrderNumbers[start];
        int elemIzq=start+1;
        int elemDer=end;
        
        while(elemIzq<=elemDer){
            while(elemIzq<=end && listOrderNumbers[elemIzq]<pivote){
                elemIzq++;
            }
            
            while(elemDer>start && listOrderNumbers[elemDer]>=pivote){
                elemDer--;
            }
            
            if(elemIzq<elemDer){
                float temp=listOrderNumbers[elemIzq];
                listOrderNumbers[elemIzq]=listOrderNumbers[elemDer];
                listOrderNumbers[elemDer]=temp;
            }
            
        }   
        
        if(elemDer>start){
            float temp=listOrderNumbers[start];
            listOrderNumbers[start]=listOrderNumbers[elemDer];
            listOrderNumbers[elemDer]=temp;
        }
        
        QuickSort(start, elemDer-1);
        QuickSort(elemDer+1, end);
        
    }

    @Override
    public void Bubble() {
        int cicle1 ;
        int cicle2;
        float aux;
        
        for (cicle1 = 0; cicle1 < listOrderNumbers.length - 1; cicle1++) {
            for (cicle2=0;cicle2 < listOrderNumbers.length-cicle1-1;cicle2++) {
                if(listOrderNumbers[cicle2+1] < listOrderNumbers[cicle2]){
                    aux=listOrderNumbers[cicle2+1];
                    listOrderNumbers[cicle2+1]=listOrderNumbers[cicle2];
                    listOrderNumbers[cicle2] = aux;
                }
                
            }
            
        }    
        
    }

    @Override
    public void PrintArray(float[] lista2) {
        for(int i=0;i<15;i++){
            System.out.println(lista2[i]);
        }
        
    }
    
}
