/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sofka.com;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * [Detalle del objeto de la clase.
 * Se crea la clase con la finalidad simular un Ferry en el que se ingresan diferente tipo de vehiculos.
 * ]
 * @version: 1.01.001  21/02/2022.
 *
 * @author Juan Pablo Gonzalez Marin.
 * 
 * @since: 1.01.001
 */
public class Ferry implements IFerry{
    ArrayList<Vehicle> vehicles = new ArrayList(); 
    Scanner sc= new Scanner(System.in);
    int option=10;
  
     /**
    * @trows Exepción
    * 
    * [Detalles del objetivo del metodo
    * El metodo tiene la finalidad de crear la estructura para el manejo del Ferry.
    * ]
    * @version: 1.01.001  21/02/2022.
    *
    * @autor: Juan Pablo Gonzalez Marin
    *
    * @since: 1.01.001
    * 
    * @see: No tiene documentación para consultar.
    */  
    @Override      
    public void Vehicle() {
        try{
            int option=0;            
            String[] dates= new String[7];
            System.out.println("........................................................................................................................");
            System.out.println("*******************************   Ingrese los datos del vehiculo que entra al Ferry    *********************************");
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            while(option!=10){
                for(int i=0;i<8;i++){
                    switch (i){
                        case 0:
                            dates[0]=String.valueOf(vehicles.size()+1);
                            break;
                        case 1:
                            dates[1]=EntryDate();
                            break;
                        case 2:
                            System.out.println("Ingrese el tipo de vehiculo ");
                            dates[2]=sc.next();
                            break;
                        case 3:
                            System.out.println("Ingrese el medio en el que se desplaza, 1)Acuatico, 2)Terrestre, 3)Aereo ");
                            option=sc.nextInt();
                            if(option>3 || option<1){i=3;}
                            if(option==1){
                                dates[3]="Acuatico";
                                dates[4]="0";
                                i=4;
                            }
                            if(option==2){
                                dates[3]="Terrestre";
                                System.out.println("Ingrese el número de llantas del vehiculo");
                                dates[4]=String.valueOf(sc.nextInt());
                                i=4;
                            }
                            if(option==3){
                                dates[3]="Aereo";
                                System.out.println("Ingrese el número de llantas del vehiculo");
                                dates[4]=String.valueOf(sc.nextInt());
                                i=4;
                            }       
                            option=0;
                            break;
                        case 5:
                            System.out.println("Ingrese el número de pasageros que puede transportar el vehiculo ");
                            dates[5]=String.valueOf(sc.nextInt());
                            break;
                        case 6:    
                            System.out.println("El vehiculo actualmente tiene tripulación a bordo 1) Si, 2) No");
                            option=sc.nextInt();
                            if(option==1){dates[6]="true";}
                            if(option==2){dates[6]="false";}
                            option=0;
                            break;
                        default:
                            break;                    
                    }                
                }            
                vehicles.add(new Vehicle(dates[0],dates[1],dates[2],dates[3],dates[4],dates[5],dates[6]));
                PrintArray();
                System.out.println("Desea ingresar mas vehiculos 1) Si, 2) No");
                option=sc.nextInt();
                if(option==2){option=10;}          
            }
        }catch(Exception e){
            System.out.print("Se estan ingresando datos no validos en las opciones de selección  ("+e.getMessage()+")");
        }    
    }
      /**
     * @return String aux1 que contiene la fecha completa en formato yyyy/MM/dd 
     * @trows Exepción
     * 
     * [Detalles del objetivo del metodo
     * El metodo tiene la finalidad de guiar al usuario para el ingreso de una fecha valida.
     * ]
     * @version: 1.01.001  21/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
     */
    @Override
    public String EntryDate(){
        int aux=0;
        int controlcicle=0;
        String aux1="";        
        do{
            controlcicle=0;
            System.out.println("Ingrese la fecha de matricula del vehiculo en formato ");
            System.out.println("Año : ");
            aux=sc.nextInt();
            if(aux>1800){aux1=String.valueOf(aux);controlcicle=controlcicle+1;}else{System.out.println("Año no valido, ingrese el dato de nuevo superior al año 1800");}
            System.out.println("Mes : ");
            aux=sc.nextInt();
            if(aux>0&&aux<=12){aux1=aux1+"/"+String.valueOf(aux);controlcicle=controlcicle+1;}else{System.out.println("Mes no valido, ingrese el dato de nuevo");}
            System.out.println("Dia : ");
            aux=sc.nextInt();
            if(aux>0&&aux<=31){aux1=aux1+"/"+String.valueOf(aux);controlcicle=controlcicle+1;}else{System.out.println("Dia no valido, ingrese el dato de nuevo");}
        }while(controlcicle!=3);
        return aux1;
    }
      /**
     * @trows Exepción
     * 
     * [Detalles del objetivo del metodo
     * El metodo tiene la finalidad de imprimir el array de vehiculos cada que se ingresa un nuevo vehiculo.
     * ]
     * @version: 1.01.001  21/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
     */
    @Override
    public void PrintArray(){
        System.out.println("-----------------------------------------Listado de vehiculos en el ferry-----------------------------------------------");
        for(int i=0;i<vehicles.size();i++){
            System.out.println(vehicles.get(i).toString());
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
    }

}
