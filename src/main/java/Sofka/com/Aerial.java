/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sofka.com;

/**
 * [Detalle del objeto de la clase.
 * Se crea la clase con la finalidad simular un vehiculo de tipo aereo.
 * ]
 * @version: 1.02.001  25/02/2022.
 *
 * @author Juan Pablo Gonzalez Marin.
 * 
 * @since: 1.02.001
 */
public class Aerial extends Vehicle{
    /**
     * Variable que captura la cantidad de rotores que tiene el vehiculo.
     */
    private int rotors;
    /**
     * Variable que captura el sistema de propulsión del vehiculo.
     */
    private String propulsionSystem;
    /**
     * Variable que captura el uso del avion.
     */
    private String useOfThePlane;
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
    * El metodo tiene la finalidad de crear el constructor para el objeto vehiculo de tipo aereo,
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
    public Aerial(String id, String registrationDate, String vehicleType, String mediumWhereMoves, String wheelsNumbers, String passangerNumbert, String crew) {
        super(id, registrationDate, vehicleType, mediumWhereMoves, wheelsNumbers, passangerNumbert, crew);
    }  
    /**
    * 
    * @param rotors int que recibe el parametro de la cantidad de rotores del vehiculo.
    *
    * @trows Exepción
    * 
    * [Detalles del objetivo del metodo
    * El metodo tiene la finalidad de capturar la cantidad de rotores y configurarlos en el objeto.
    * ]
    * @version: 1.02.001  25/02/2022.
    *
    * @autor: Juan Pablo Gonzalez Marin
    *
    * @since: 1.02.001
    * 
    * @see: No tiene documentación para consultar.
    */
    public void Rotors(int rotors){
        this.rotors=rotors;
    }
    /**
    * 
    * @param propulsionSystem String que recibe el parametro del tipo del sistema de propulsión del vehiculo.
    *
    * @trows Exepción
    * 
    * [Detalles del objetivo del metodo
    * El metodo tiene la finalidad de capturar el tipo de propulsión y configurarlos en el objeto.
    * ]
    * @version: 1.02.001  25/02/2022.
    *
    * @autor: Juan Pablo Gonzalez Marin
    *
    * @since: 1.02.001
    * 
    * @see: No tiene documentación para consultar.
    */
    public void PropulsionSystem(String propulsionSystem){
        this.propulsionSystem=propulsionSystem;
    }
    /**
    * 
    * @param useOfThePlane String que recibe el parametro del uso que se le da al vehiculo.
    *
    * @trows Exepción
    * 
    * [Detalles del objetivo del metodo
    * El metodo tiene la finalidad de capturar el uso del vehiculo y configurarlos en el objeto.
    * ]
    * @version: 1.02.001  25/02/2022.
    *
    * @autor: Juan Pablo Gonzalez Marin
    *
    * @since: 1.02.001
    * 
    * @see: No tiene documentación para consultar.
    */
    public void UseOfThePlane(String useOfThePlane){
        this.useOfThePlane=useOfThePlane;
    }
    /**
    * @return Retorna el valor de los parametros que construyen la entidad vehiculo tipo aereo. 
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
        if("Helicoptero".equals(vehicleType)){
            return id+ "| F. matricula :"+registrationDate+" | Vehiculo :"+vehicleType+" | Medio :"+mediumWhereMoves+" | # llantas :"+wheelsNumbers+" | # pasajeros :"+passangerNumbert+" | Tripulación :"+crew+" | # de rotores :"+rotors;
        }
        if("Avioneta".equals(vehicleType)){
            return id+ "| F. matricula :"+registrationDate+" | Vehiculo :"+vehicleType+" | Medio :"+mediumWhereMoves+" | # llantas :"+wheelsNumbers+" | # pasajeros :"+passangerNumbert+" | Tripulación :"+crew+" | Sistema de propulsion :"+propulsionSystem;
        }
        if("Avion".equals(vehicleType)){
            return id+ "| F. matricula :"+registrationDate+" | Vehiculo :"+vehicleType+" | Medio :"+mediumWhereMoves+" | # llantas :"+wheelsNumbers+" | # pasajeros :"+passangerNumbert+" | Tripulación :"+crew+" | Uso"+useOfThePlane;
        }       
        return null;       
    }    
}
