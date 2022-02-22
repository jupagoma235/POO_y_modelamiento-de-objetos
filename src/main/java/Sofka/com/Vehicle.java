/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sofka.com;

/**
 * [Detalle del objeto de la clase.
 * Se crea la clase con la finalidad simular un los objetos vehiculo que se cargan al ferry.
 * ]
 * @version: 1.01.001  21/02/2022.
 *
 * @author Juan Pablo Gonzalez Marin.
 * 
 * @since: 1.01.001
 */
public class Vehicle{
    /**
     * Corresponde al consecutivo de los vehiculos ingresados.
     */
    private int id;
    /**
     * Corresponde al número de pasajeros que puede transportar el vehiculo.
     */
    private int passangerNumbert;
    /**
     * Corresponde al número de ruedas que tiene el vehiculo.
     */
    private int wheelsNumbers;
    /**
     * Corresponde a la fecha de matricula del vehiculo.
     */
    private String registrationDate;
    /**
     * Corresponde al tipo de vehiculo que sube al ferry.
     */
    private String vehicleType;
    /**
     * Corresponde al medio que utiliza el vehiculo para trasladarse.
     */
    private String mediumWhereMoves;
    /**
     * Corresponde a la definicio de si el vehiculo sube con tripulación o sin ella.
     */
    private boolean crew;
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
     * El metodo tiene la finalidad de servir de constructor del objeto vehiculo.
     * ]
     * @version: 1.01.001  21/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
    */  
    public Vehicle(String id, String registrationDate, String vehicleType, String mediumWhereMoves, String wheelsNumbers, String passangerNumbert, String crew) {
        try{
            this.id=Integer.parseInt(id);
            this.passangerNumbert = Integer.parseInt(passangerNumbert);
            this.wheelsNumbers = Integer.parseInt(wheelsNumbers);
            this.registrationDate = registrationDate;
            this.vehicleType = vehicleType;
            this.mediumWhereMoves = mediumWhereMoves;
            this.crew = Boolean.parseBoolean(crew);
        }catch(NumberFormatException e){
            System.out.print(e.getMessage());
        }
    }
    /**
    * @return Retorna el valor de los parametros que construyen la entidad vehiculo. 
    * 
    * @trows Exepción
    * 
    * [Detalles del objetivo del metodo
    * El metodo tiene la finalidad de sobre escribir al metodo toString, para que muestre las caracteristicas del objeto.
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
    public String toString(){
       
        return id+ "| F. matricula :"+registrationDate+" | Vehiculo :"+vehicleType+" | Medio :"+mediumWhereMoves+" | # llantas :"+wheelsNumbers+" | # pasajeros :"+passangerNumbert+" | Tripulación :"+crew;
    }    
    
}
