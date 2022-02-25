/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_planetario;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jpgonzalez
 */
public class CreatePlanetSystem {
    ArrayList<Planet> newPlanet = new ArrayList();
    Scanner sc= new Scanner(System.in);
    int option=0;
      
    public void Controler(){
    
        double[] dates={1.1,1.1,1.1,1.1,};
        double gravity;
        int value=0, potencia=0;
      
        String name;
        BigInteger distance;
        
        while(option!=3){
            
            System.out.println("Ingrese el nombre del planeta");
            name=sc.nextLine();
            System.out.println("Ingrese la masa del planeta");
            value=sc.nextInt();
            System.out.println("Ingrese la potencia a la que esta elevada la masa");
            potencia=sc.nextInt();
            dates[0]=value*Math.pow(10,potencia);
            value=newPlanet.size()+1;
            System.out.println("Ingrese la densidad planeta");
            dates[1]=sc.nextDouble();
            System.out.println("Ingrese el diametro del planeta en kilometros");
            dates[2]=sc.nextDouble();
            System.out.println("Ingrese la distancia en km al sol");
            distance=sc.nextBigInteger();        
            newPlanet.add(new Planet(value, name, dates[0],dates[1],dates[2],distance.doubleValue()));
            ViewPlanet();
            System.out.println("1) Agregar mas planetas, 2) Validar la atracción gravitacional entre dos planetas, 3) Salir");
            option=sc.nextInt();
            sc.nextLine();
            if(option==2){
                GravitationalAttraction();
            }          
           
        }
     
    }
    
    private void GravitationalAttraction(){
        double mass1=1.1;
        double mass2=1.1;
        double distance, distance1;
        double gravitationalForce;
        
        System.out.println("ingrese el número del planeta 1");
        option=sc.nextInt();
        mass1=newPlanet.get(option-1).GetMass();
        distance=newPlanet.get(option-1).GetDistanceToTheSun();
        System.out.println("ingrese el número del planeta 2");
        option=sc.nextInt();
        mass2=newPlanet.get(option-1).GetMass();
        distance1=newPlanet.get(option-1).GetDistanceToTheSun();
        
        if(distance>distance1){
            distance=distance-distance1;
        }else{
            distance=distance1-distance;
        }
        gravitationalForce= (6.673*Math.pow(10,-11))*((mass1*mass2)/Math.pow(distance,2));
        
        System.out.println("La fuerza gravitacional entre los dos planetas es : "+gravitationalForce);
    
    }
    
    
    
    private void ViewPlanet(){
        for(int i=0;i<newPlanet.size();i++){
            System.out.println(newPlanet.get(i).toString());
        }
    }
    
}
