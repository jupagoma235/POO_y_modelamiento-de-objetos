/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sofka.com;

import java.util.Scanner;
import java.util.Vector;
/**
 * [Detalle del objeto de la clase.
 * Se crea la clase con la finalidad de trabajar el objeto vector
 * conforme lo solicitado en el ejercicio 6
 * ]
 * @version: 1.01.001  16/02/2022.
 *
 * @author Juan Pablo Gonzalez Marin.
 * 
 * @since: 1.01.001
 */
public class VectorClass {
    /**
     * Variable que genera la opcion para salir del ciclo do-while.
     */
    private int option=0;
    /**
     * Variable que recoge el valor del vector cargado por el usuario.
     */
    private int vector=0;
    /**
     * Variable que recoge el valor de la dimensión del vector.
     */
    private int sizeVector=0;
    /**
     * Declaración de la variable tipo vector.
     */
    private Vector vector1;
    /**
     * Instancia del metodo necesario para capturar la información del usuario.
     */
    Scanner scan = new Scanner(System.in);
    
    /**
     * @trows Exepción
     * 
     * [Detalles del objetivo del metodo
     * El metodo tiene la finalidad de trabajar el objeto vector y de recoger los valores ingresados,
     * asi como de realizar la comparación al momento de que se repite un numero para posterioremente
     * llamar al metodo PrintVector().
     * ]
     * @version: 1.01.001  16/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
     */
    public void Vectorexercise(){
        this.vector1 = new Vector();
        try{
            do{
                System.out.println("Ingrese un número para agragar al vector");
                vector=scan.nextInt();
                vector1.add(vector);
                sizeVector=vector1.size();
                if(sizeVector>1){
                    if(vector1.get(sizeVector-1)==vector1.get(sizeVector-2)){option=1;}
                }
            }while(option!=1);
            PrintVector();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Trabajo con el vector exitoso");
        }
    }
     /**
     * @trows Exepción
     * 
     * [Detalles del objetivo del metodo
     * Metodo para imprimir el vector creado
     * ]
     * @version: 1.01.001  16/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
     */
    private void PrintVector(){
        try{
            System.out.println("****************************************************");
            System.out.println("Los valores ingresados son  : ");
            for(int i=0;i<vector1.size();i++){
                System.out.print(vector1.get(i)+",");
            }
            System.out.println("");
            System.out.println("****************************************************");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }        
    }
}
