/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_planetario;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * [Detalle del objeto de la clase.
 * Se crea la clase con la finalidad de dar creacion al listado de los objetos planeta.
 * ]
 * @version: 1.01.001  24/02/2022.
 *
 * @author Juan Pablo Gonzalez Marin.
 * 
 * @since: 1.01.001
 */
public class CreatePlanetSystem {
    /**
     * Variable tipo array del objeto Planeta.
     */
    ArrayList<Planet> newPlanet = new ArrayList();
    /**
     * Instancia del objeto Scanner para capturar la información entregada por el usuario.
     */
    Scanner sc= new Scanner(System.in);
    /**
     * Variable que captura la opcion del usuario, ya sea para servir como control del ciclo o como auxiliar para pasar datos al objeto.
     */
    int option=0;
      
     /**
    * @trows Exepción
    * 
    * [Detalles del objetivo del metodo
    * El metodo tiene la finalidad crear la estructura para el ingreso de los datos que generan el objeto planeta
    * ]
    * @version: 1.01.001  24/02/2022.
    *
    * @autor: Juan Pablo Gonzalez Marin
    *
    * @since: 1.01.001
    * 
    * @see: No tiene documentación para consultar.
    */  
    public void Controler(){
        /**
         * arreglo de tipo double utilizado para capturar los datos que luego son pasados al objeto.
         */
        double[] dates={1.1,1.1,1.1,1.1,};
        /**
         * Variable que tiene la funcion de capturar el primer valor de la ecuacion de la masa.
         */
        int value=0; 
        /**
         * Variable utilizada para capturar la potencia a la que se eleva el numero 10 de la notacion cientifica.
         */
        int potencia=0;
      
        String name;
        BigInteger distance;
        try{
            while(option!=3){
            
                System.out.println("Ingrese el nombre del planeta");
                name=sc.nextLine();
                System.out.println("Ingrese la masa del planeta, ejemplo : para la tierra es 5,9722");
                value=sc.nextInt();
                System.out.println("Ingrese la potencia a la que se eleva 10 para cumplir con la formula (masa*10^[n]), ejemplo: para la tierra es 24");
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
        }catch(Exception e){
            System.out.println(e.getMessage());
        }    
    }
    /**
    * @trows Exepción
    * 
    * [Detalles del objetivo del metodo
    * Metodo privaro que tiene la finalidad de soportar la formula para determinar cual es la atracción gravitacional
    * entre dos planetas.
    * ]
    * @version: 1.01.001  24/02/2022.
    *
    * @autor: Juan Pablo Gonzalez Marin
    *
    * @since: 1.01.001
    * 
    * @see: No tiene documentación para consultar.
    */
    private void GravitationalAttraction(){
        /**
         * Variable de tipo double que tiene como función capturar la masa del primer objeto seleccionado.
         */
        double mass1;
        /**
         * Variable de tipo double que tiene como función capturar la masa del segundo objeto seleccionado.
         */
        double mass2;
        /**
         * Variable de tipo double que tiene como función capturar la distancia del primer objeto seleccionado,
         * tambien se reutiliza posteriormente para determinar la distancia entre los dos puntos.
         */
        double distance;
        /**
         * Variable de tipo double que tiene como función capturar la distancia del segundo objeto seleccionado.
         */
        double distance1;
        /**
         * Variable de tipo double que tiene como función mantener el resultado de la atraccion gravitacional entre 
         * los dos cuerpos.
         */
        double gravitationalForce;
        try{
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
        }catch(Exception e){
            System.out.println(e.getMessage());
        } 
    }
    /**
    * @trows Exepción
    * 
    * [Detalles del objetivo del metodo
    * El metodo tiene la finalidad de dar visibilidad al listado de objetos tipo planeta.
    * ]
    * @version: 1.01.001  24/02/2022.
    *
    * @autor: Juan Pablo Gonzalez Marin
    *
    * @since: 1.01.001
    * 
    * @see: No tiene documentación para consultar.
    */
    private void ViewPlanet(){
        System.out.println("");
        System.out.println("****************************************************************************************");
        for(int i=0;i<newPlanet.size();i++){
            System.out.println(newPlanet.get(i).toString());
        }
        System.out.println("****************************************************************************************");
    }
    
}
