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
 * @version: 1.02.001  25/02/2022.
 *
 * @author Juan Pablo Gonzalez Marin.
 * 
 * @since: 1.01.001
 */
public class Ferry implements IFerry{
    /**
     * Array de objetos que guarda el listado general de vehiculos que ingresan al ferry.
     */
    ArrayList<Vehicle> vehicles = new ArrayList();
    /**
     * Array de objetos que guarda el listado de vehiculos terrestres que ingresan al ferry.
     */
    ArrayList<Terrestrial> terrestrial = new ArrayList();
    /**
     * Array de objetos que guarda el listado de vehiculos aereos que ingresan al ferry.
     */
    ArrayList<Aerial> aerial = new ArrayList();
    /**
     * Array de objetos que guarda el listado de vehiculos acuaticos que ingresan al ferry.
     */
    ArrayList<Water> water = new ArrayList();
    /**
     * Se instancia el objeto Scanner para capturar los datos ingresados por el usuario.
     */
    Scanner sc= new Scanner(System.in);
    /**
     * Variable que captura los datos y sirve para el manejo del ciclo while en el método vehículo.
     */
    int option=0;
    /**
     * Variable que captura el valor que sirve de control para el ciclo while.
     */
    int optionWhile=0;
  
     /**
    * @trows Exepción
    * 
    * [Detalles del objetivo del metodo
    * El metodo tiene la finalidad de crear la estructura para el manejo del Ferry.
    * ]
    * @version: 1.02.001  25/02/2022.
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
            /**
             * Arreglo de String que reciben los datos de ingreso del vehiculo.
             */            
            String[] dates= new String[7];
            /**
             * Variable auxiliar que captura valores en diferentes partes del codigo para volcarlas al objeto.
             */
            String aux="";
            System.out.println("........................................................................................................................");
            System.out.println("*******************************   Ingrese los datos del vehiculo que entra al Ferry    *********************************");
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            while(option!=10){
                optionWhile=0;
                for(int i=0;i<8;i++){
                    switch (i){
                        case 0:
                            dates[0]=String.valueOf(vehicles.size()+1);
                            break;
                        case 1:
                            dates[1]=EntryDate();
                            break;
                        case 2:
                            System.out.println("Ingrese el medio en el que se desplaza, 1)Acuatico, 2)Terrestre, 3)Aereo ");
                            option=sc.nextInt();
                            if(option>3 || option<1){i=3;}
                            if(option==1){
                                dates[3]="Acuatico";
                                dates[4]="0";
                                i=4;       
                                System.out.println("1) Lancha, 2) Barco, 3) Moto de agua");
                                option=sc.nextInt();
                                switch(option){
                                    case 1:
                                        dates[2]="Lancha";
                                        break;
                                    case 2:
                                        dates[2]="Barco";
                                        break; 
                                    case 3:
                                        dates[2]="Moto de agua";
                                        i=5;
                                        dates[5]="0";
                                        break;
                                    default:
                                        break;
                                }           
                                option=0;
                            }
                             if(option==2){
                                dates[3]="Terrestre";
                                i=4;       
                                System.out.println("1) Automovil, 2) Buseta, 3) Camion");
                                option=sc.nextInt();
                                switch(option){
                                    case 1:
                                        dates[2]="Automovil";
                                        break;
                                    case 2:
                                        dates[2]="Buseta";
                                        break; 
                                    case 3:
                                        dates[2]="Camion";
                                        break;
                                    default:
                                        break;
                                }
                                System.out.println("Ingrese el número de llantas del vehiculo");
                                dates[4]=String.valueOf(sc.nextInt());                                
                                option=0;
                            }
                            if(option==3){
                                dates[3]="Aereo";
                                i=4;
                                System.out.println("1) Helicoptero, 2) Avioneta, 3) Avion");
                                option=sc.nextInt();
                                switch(option){
                                    case 1:
                                        dates[2]="Helicoptero";
                                        break;
                                    case 2:
                                        dates[2]="Avioneta";
                                        break; 
                                    case 3:
                                        dates[2]="Avion";
                                        break;
                                    default:
                                        break;
                                }
                                System.out.println("Ingrese el número de llantas del vehiculo");
                                dates[4]=String.valueOf(sc.nextInt());
                                option=0;                                
                            }
                            break;
                        case 5:
                            System.out.println("Ingrese el número de pasageros que puede transportar el vehiculo ");
                            dates[5]=String.valueOf(sc.nextInt());
                            break;
                        case 6:    
                            System.out.println("El vehiculo actualmente tiene tripulación a bordo 1) Si, 2) No");
                            option=sc.nextInt();
                            sc.nextLine();
                            if(option==1){dates[6]="true";}
                            if(option==2){dates[6]="false";}
                            option=0;
                            break;
                        default:
                            break;                    
                    }                
                }            
                vehicles.add(new Vehicle(dates[0],dates[1],dates[2],dates[3],dates[4],dates[5],dates[6]));
                
                if("Acuatico".equals(dates[3])){
                    water.add(new Water(dates[0],dates[1],dates[2],dates[3],dates[4],dates[5],dates[6]));
                    if("Lancha".equals(dates[2])){
                        System.out.println("Ingrese el tipo de motor");
                        sc.nextLine();
                        aux=sc.nextLine();                    
                        water.get(water.size()-1).TypeOfMotor(aux);
                    }
                    if("Barco".equals(dates[2])){
                        System.out.println("Ingrese la altura del calado del barco");
                        option=sc.nextInt();                    
                        water.get(water.size()-1).Fretwork(option);
                    }   
                    if("Moto de agua".equals(dates[2])){
                        System.out.println("1) Monoplaza, 2) Multiplaza");
                        option=sc.nextInt();
                        if(option==1){
                            water.get(water.size()-1).TypeOfJetSki("Monoplaza");
                        }
                        if(option==2){
                            water.get(water.size()-1).TypeOfJetSki("Multiplaza");
                        }
                    }        
                    
                    System.out.println("1) Agua dulce, 2) Agua salada");
                    option=sc.nextInt();
                    sc.nextLine();
                    if(option==1){
                        water.get(water.size()-1).TypeOfWater("Dulce");
                    }
                    if(option==2){
                        water.get(water.size()-1).TypeOfWater("Salada");
                    }
                    
                }
                if("Terrestre".equals(dates[3])){
                    terrestrial.add(new Terrestrial(dates[0],dates[1],dates[2],dates[3],dates[4],dates[5],dates[6]));
                    if("Automovil".equals(dates[2])){
                        System.out.println("Ingrese el cilindraje en números");
                        option=sc.nextInt(); 
                        sc.nextLine();
                        terrestrial.get(terrestrial.size()-1).setDisplacement(option);
                        
                    }
                    if("Buseta".equals(dates[2])){
                        System.out.println("Ingrese el tipo de sistema de frenos");
                        
                        aux=sc.nextLine();                    
                        terrestrial.get(terrestrial.size()-1).setBraking(aux);
                    }   
                    if("Camion".equals(dates[2])){
                        System.out.println("Ingrese el número de ejes del camion");
                        option=sc.nextInt();
                        sc.nextLine();
                        terrestrial.get(terrestrial.size()-1).setEjes(option);
                    }        
                    
                    System.out.println("Ingrese el tipo de combustible");
                    aux=sc.nextLine();                    
                    terrestrial.get(terrestrial.size()-1).setOil(aux);
                }
                if("Aereo".equals(dates[3])){
                    aerial.add(new Aerial(dates[0],dates[1],dates[2],dates[3],dates[4],dates[5],dates[6]));
                    if("Helicoptero".equals(dates[2])){
                        System.out.println("Ingrese los cuantos rotores tiene");
                        option=sc.nextInt(); 
                        sc.nextLine();
                        aerial.get(aerial.size()-1).Rotors(option);                        
                    }
                    if("Avioneta".equals(dates[2])){
                        System.out.println("Ingrese el tipo de sistema de propulsión");
                        aux=sc.nextLine();                    
                        aerial.get(aerial.size()-1).PropulsionSystem(aux);
                    }   
                    if("Avion".equals(dates[2])){
                        System.out.println("1) Carga, 2) Pasajeros");
                        option=sc.nextInt();
                        sc.nextLine();
                        if(option==1){
                            aerial.get(aerial.size()-1).UseOfThePlane("Carga");
                        }
                        if(option==2){
                            aerial.get(aerial.size()-1).UseOfThePlane("Pasajeros");
                        }                        
                    }
                }
                System.out.println("-----------------------------------------Listado de vehiculos en el ferry-----------------------------------------------");
                PrintArray(vehicles);
                while(optionWhile!=10){
                    System.out.println("1) Desea ingresar mas vehiculos, 2) Ver por tipos de vehiculo, 3) Salir");
                    option=sc.nextInt();
                    sc.nextLine();
                    if(option==1){optionWhile=10;}
                    if(option==2){
                        System.out.println("1) Acuaticos, 2) Terrestres, 3) Aereos");
                        option=sc.nextInt();
                        sc.nextLine();
                        switch(option){
                            case 1:
                                System.out.println("-----------------------------------------Listado de vehiculos acuaticos-------------------------------------------------");
                                PrintArray(water);
                                break;
                            case 2: 
                                System.out.println("-----------------------------------------Listado de vehiculos terrestres------------------------------------------------");
                                PrintArray(terrestrial);
                                break;
                            case 3: 
                                System.out.println("-------------------------------------------Listado de vehiculos aereos--------------------------------------------------");
                                PrintArray(aerial);
                                option=2;
                                break;
                            default:
                                break;
                        }
                    }
                    if(option>=3){option=10;optionWhile=10;}          
                }
            }
        }catch(Exception e){
            System.out.print("Se estan ingresando datos no validos en las opciones de selección  ("+e.getMessage()+")");
        }    
    }
      /**
     * @return String aux1 que contiene la fecha completa en formato yyyy/MM/dd 
     * 
     * @trows Exepción
     * 
     * [Detalles del objetivo del metodo
     * El metodo tiene la finalidad de guiar al usuario para el ingreso de una fecha valida.
     * ]
     * @version: 1.02.001  25/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
     */
    @Override
    public String EntryDate(){
        /**
         * Variable del metodo que sirve como auxiliar para ingresar la fecha la captura de números.
         */
        int aux=0;
        /**
         * Variable creada para controlar el ciclo do While.
         */
        int controlcicle=0;
        /**
         * Variable creada con la finalidad de recibir los números de la fecha y darles formato.
         */
        String aux1="";   
        try{
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
        }catch(Exception e){
            System.out.print(e.getMessage());
        }
        finally{
            System.out.println("Fecha ingresada correctamente  :)");
        }
        return aux1;
    }
      /**
     * @trows Exepción
     * 
     * [Detalles del objetivo del metodo
     * El metodo tiene la finalidad de imprimir el array de vehiculos cada que se ingresa un nuevo vehiculo.
     * ]
     * @version: 1.02.001  25/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
     */
    @Override
    public void PrintArray(ArrayList printDates){
        try{
            for(int i=0;i<printDates.size();i++){
                System.out.println(printDates.get(i).toString());
            }
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
        }catch(Exception e){
            System.out.print(e.getMessage());
        }
    }   
}
