/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sofka.com;

/**
 * [Detalle del objeto de la clase.
 * Se crea la clase con la finalidad simular un vehiculo de tipo terrester.
 * ]
 * @version: 1.02.001  25/02/2022.
 *
 * @author Juan Pablo Gonzalez Marin.
 * 
 * @since: 1.02.001
 */
public class Terrestrial extends Vehicle{
    /**
     * entero que captura el número de ejes.
     */
    private int ejes;
    /**
     * entero que captura el cilindraje del vehiculo.
     */ 
    private int displacement;
    /**
     * String que captura el tipo de combustible del vehiculo. 
     */
    private String oil;
    /**
     * Variable que captura el tipo de sistema de frenos.
     */
    private String braking;
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
    * El metodo tiene la finalidad de crear el constructor para el objeto vehiculo de tipo terrestre,
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
    public Terrestrial(String id, String registrationDate, String vehicleType, String mediumWhereMoves, String wheelsNumbers, String passangerNumbert, String crew) {
        super(id, registrationDate, vehicleType, mediumWhereMoves, wheelsNumbers, passangerNumbert, crew);        
    }
    /**
    * @param ejes int que captura la cantidad de ejes para conigurarla en el objeto.
    *
    * @trows Exepción
    * 
    * [Detalles del objetivo del metodo
    * El metodo tiene la finalidad de capturar la cantidad de ejes y configurarlos en el objeto.
    * ]
    * @version: 1.02.001  25/02/2022.
    *
    * @autor: Juan Pablo Gonzalez Marin
    *
    * @since: 1.02.001
    * 
    * @see: No tiene documentación para consultar.
    */ 
    public void setEjes(int ejes) {
        this.ejes = ejes;
    }
    /**
    * 
    * @param displacement int que recibe el cilindraje del vehiculo.
    *
    * @trows Exepción
    * 
    * [Detalles del objetivo del metodo
    * El metodo tiene la finalidad de capturar el cilindraje y configurarlos en el objeto.
    * ]
    * @version: 1.02.001  25/02/2022.
    *
    * @autor: Juan Pablo Gonzalez Marin
    *
    * @since: 1.02.001
    * 
    * @see: No tiene documentación para consultar.
    */
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }
     /**
    * 
    * @param braking String que recibe el parametro tipo de freno del vehiculo.
    *
    * @trows Exepción
    * 
    * [Detalles del objetivo del metodo
    * El metodo tiene la finalidad de capturar el cilindraje y configurarlos en el objeto.
    * ]
    * @version: 1.02.001  25/02/2022.
    *
    * @autor: Juan Pablo Gonzalez Marin
    *
    * @since: 1.02.001
    * 
    * @see: No tiene documentación para consultar.
    */
    public void setBraking(String braking) {
        this.braking = braking;
    }
     /**
    * 
    * @param oil String que recibe el parametro tipo de combustible del vehiculo.
    *
    * @trows Exepción
    * 
    * [Detalles del objetivo del metodo
    * El metodo tiene la finalidad de capturar el tipo de comobustible y configurarlos en el objeto.
    * ]
    * @version: 1.02.001  25/02/2022.
    *
    * @autor: Juan Pablo Gonzalez Marin
    *
    * @since: 1.02.001
    * 
    * @see: No tiene documentación para consultar.
    */
    public void setOil(String oil) {
        this.oil = oil;
    }
    /**
    * @return Retorna el valor de los parametros que construyen la entidad vehiculo tipo terrestre. 
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
        if("Camion".equals(vehicleType)){
            return id+ "| F. matricula :"+registrationDate+" | Vehiculo :"+vehicleType+" | Medio :"+mediumWhereMoves+" | # llantas :"+wheelsNumbers+" | # pasajeros :"+passangerNumbert+" | Tripulación :"+crew+" | # ejes :"+ejes+" | Combustible :"+oil;
        }
        if("Buseta".equals(vehicleType)){
            return id+ "| F. matricula :"+registrationDate+" | Vehiculo :"+vehicleType+" | Medio :"+mediumWhereMoves+" | # llantas :"+wheelsNumbers+" | # pasajeros :"+passangerNumbert+" | Tripulación :"+crew+" | Sistema de frenos :"+braking+" | Combustible :"+oil;
        }
        if("Automovil".equals(vehicleType)){
            return id+ "| F. matricula :"+registrationDate+" | Vehiculo :"+vehicleType+" | Medio :"+mediumWhereMoves+" | # llantas :"+wheelsNumbers+" | # pasajeros :"+passangerNumbert+" | Tripulación :"+crew+" | Cilindraje :"+displacement+" | Combustible :"+oil;
        }       
        return null;       
    }
    
}
