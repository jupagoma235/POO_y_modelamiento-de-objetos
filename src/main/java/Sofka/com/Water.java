/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sofka.com;

/**
 * [Detalle del objeto de la clase.
 * Se crea la clase con la finalidad simular un vehiculo de tipo acuatico.
 * ]
 * @version: 1.02.001  25/02/2022.
 *
 * @author Juan Pablo Gonzalez Marin.
 * 
 * @since: 1.02.001
 */
public class Water extends Vehicle{
    /**
     * Variable que captura el calado del barco.
     */
    private int fretwork;
    /**
     * Variable que captura el tipo de motor del vehiculo.
     */
    private String typeOfMotor;
    /**
     * Variable que captura el agua en el que se se desplaza el vehiculo.
     */
    private String typeOfWater;
    /**
     * Variable que captura el tipo de moto de agua.
     */
    private String typeOfJetSki;
    /**
    * @param id  String que recibe el consecutivo del vehiculo.
    * @param registrationDate String que recibe la fecha ingresada por el usuario.
    * @param vehicleType String que recibe el tipo de vehiculo.
    * @param mediumWhereMoves String que recibe el medio en donde se desplaza.
    * @param wheelsNumbers String que recibe el número de ruedas.
    * @param passangerNumbert String que recibe el número de pasajeros.
    * @param crew String que recibe si el vehiculo entra con tripulación o no.
    *
    * @trows Exepción
    * 
    * [Detalles del objetivo del metodo
    * El metodo tiene la finalidad de crear el constructor para el objeto vehiculo de tipo acuatico,
    * se da por extensión de la clase proncipal.
    * ]
    * @version: 1.02.001  25/02/2022.
    *
    * @autor: Juan Pablo Gonzalez Marin
    *
    * @since: 1.02.001
    * 
    * @see: No tiene documentación para consultar.
    */  
    public Water(String id, String registrationDate, String vehicleType, String mediumWhereMoves, String wheelsNumbers, String passangerNumbert, String crew) {
        super(id, registrationDate, vehicleType, mediumWhereMoves, wheelsNumbers, passangerNumbert, crew);
    }
    /**
    * 
    * @param fretwork int que recibe el parametro calado del vehiculo.
    *
    * @trows Exepción
    * 
    * [Detalles del objetivo del metodo
    * El metodo tiene la finalidad de capturar el calado del barco y configurarlos en el objeto.
    * ]
    * @version: 1.02.001  25/02/2022.
    *
    * @autor: Juan Pablo Gonzalez Marin
    *
    * @since: 1.02.001
    * 
    * @see: No tiene documentación para consultar.
    */
    public void Fretwork(int fretwork){
        this.fretwork=fretwork;
    }
     /**
    * 
    * @param typeOfMotor String que recibe el parametro tipo de motor del vehiculo.
    *
    * @trows Exepción
    * 
    * [Detalles del objetivo del metodo
    * El metodo tiene la finalidad de capturar el tipo de motor y configurarlos en el objeto.
    * ]
    * @version: 1.02.001  25/02/2022.
    *
    * @autor: Juan Pablo Gonzalez Marin
    *
    * @since: 1.02.001
    * 
    * @see: No tiene documentación para consultar.
    */
    public void TypeOfMotor(String typeOfMotor){
        this.typeOfMotor=typeOfMotor;
    }    
     /**
    * 
    * @param typeOfWater String que recibe el parametro del agua en la que se desplaza el vehiculo.
    *
    * @trows Exepción
    * 
    * [Detalles del objetivo del metodo
    * El metodo tiene la finalidad de capturar el agua en la que se desplaza y configurarlos en el objeto.
    * ]
    * @version: 1.02.001  25/02/2022.
    *
    * @autor: Juan Pablo Gonzalez Marin
    *
    * @since: 1.02.001
    * 
    * @see: No tiene documentación para consultar.
    */
    public void TypeOfWater(String typeOfWater){
        this.typeOfWater=typeOfWater;
    }  
    /**
    * 
    * @param typeOfJetSki String que recibe el parametro del tipo de moto de agua.
    *
    * @trows Exepción
    * 
    * [Detalles del objetivo del metodo
    * El metodo tiene la finalidad de capturar el tipo de moto de agua y configurarlos en el objeto.
    * ]
    * @version: 1.02.001  25/02/2022.
    *
    * @autor: Juan Pablo Gonzalez Marin
    *
    * @since: 1.02.001
    * 
    * @see: No tiene documentación para consultar.
    */
    public void TypeOfJetSki(String typeOfJetSki){
        this.typeOfJetSki=typeOfJetSki;
        if("Monoplaza".equals(typeOfJetSki)){
            passangerNumbert=1;
        }
        if("Multiplaza".equals(typeOfJetSki)){
            passangerNumbert=2;
        }
    }
    /**
    * @return Retorna el valor de los parametros que construyen la entidad vehiculo tipo acuatico. 
    * 
    * @trows Exepción
    * 
    * [Detalles del objetivo del metodo
    * El metodo tiene la finalidad de sobre escribir al metodo toString, para que muestre las caracteristicas del objeto.
    * ]
    * @version: 1.02.001  25/02/2022.
    *
    * @autor: Juan Pablo Gonzalez Marin
    *
    * @since: 1.02.001
    * 
    * @see: No tiene documentación para consultar.
    */  
    @Override
    public String toString(){
        if("Lancha".equals(vehicleType)){
            return id+ "| F. matricula :"+registrationDate+" | Vehiculo :"+vehicleType+" | Medio :"+mediumWhereMoves+" | # pasajeros :"+passangerNumbert+" | Tripulación :"+crew+" | Tipo de motor :"+typeOfMotor+" | Para utilizar en agua :"+typeOfWater;
        }
        if("Barco".equals(vehicleType)){
            return id+ "| F. matricula :"+registrationDate+" | Vehiculo :"+vehicleType+" | Medio :"+mediumWhereMoves+" | # pasajeros :"+passangerNumbert+" | Tripulación :"+crew+" | Calado del barco :"+fretwork+"mts | Para utilizar en agua :"+typeOfWater;
        }
        if("Moto de agua".equals(vehicleType)){
            return id+ "| F. matricula :"+registrationDate+" | Vehiculo :"+vehicleType+" | Medio :"+mediumWhereMoves+" | # pasajeros :"+passangerNumbert+" | Tripulación :"+crew+" | Tipo de Moto de agua :"+typeOfJetSki+" | Para utilizar en agua :"+typeOfWater;
        }       
        return null;       
    }
}
