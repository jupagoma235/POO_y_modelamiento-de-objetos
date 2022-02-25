/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_planetario;

/**
 * [Detalle del objeto de la clase.
 * Se crea la clase con la finalidad simular un los objetos Planetas.
 * ]
 * @version: 1.01.001  24/02/2022.
 *
 * @author Juan Pablo Gonzalez Marin.
 * 
 * @since: 1.01.001
 */
public class Planet implements IPlanet{
    /**
     *Captura el valor de la masa del objeto planeta. 
     */
    public double mass;
    /**
     * Caputura la densidad del objeto planeta.
     */
    public double density;
    /**
     * Captura el diametro del objeto planeta.
     */
    public double diameter;
    /**
     * Captura la distancia del objeto al sol.
     */
    public double distanceToTheSun;
    /**
     * Captura el identificador de cada planeta.
     */
    public int id;
    /**
     * Captura el nombre de cada objeto planeta.
     */
    public String name;
    /**
     * 
     * @param id int que recibe el consecutido de cada objeto.
     * @param name String que recibe el nombre del objeto.
     * @param mass double que recibe el valor de la masa del objeto.
     * @param density double que recibe el valor de la densidad del objeto.
     * @param diameter double que recibe el diametro del objeto.
     * @param distanceToTheSun double que recibe la distancia del obejto al sol.
     * 
     * @trows Exepción
     * 
     * [Detalles del objetivo del metodo
     * El metodo tiene la finalidad de servir de constructor del objeto vehiculo.
     * ]
     * @version: 1.01.001  24/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
     */
    public Planet(int id, String name, double mass, double density, double diameter, double distanceToTheSun) {
        try{
            this.mass = mass;
            this.density = density;
            this.diameter = diameter;
            this.distanceToTheSun = distanceToTheSun;
            this.id=id;
            this.name= name;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    /**
    * @return el valro de la masa del objeto. 
    * 
    * @trows Exepción
    * 
    * [Detalles del objetivo del metodo
    * Metodo para capturar la masa del objeto seleccionado.
    * ]
    * @version: 1.01.001  24/02/2022.
    *
    * @autor: Juan Pablo Gonzalez Marin
    *
    * @since: 1.01.001
    * 
    * @see: No tiene documentación para consultar.
    */  
    @Override
    public double GetMass() {
        return this.mass;        
    }
    
    /**
    * @return el la distancia del objeto. 
    * 
    * @trows Exepción
    * 
    * [Detalles del objetivo del metodo
    * Metodo para capturar la masa del objeto seleccionado.
    * ]
    * @version: 1.01.001  24/02/2022.
    *
    * @autor: Juan Pablo Gonzalez Marin
    *
    * @since: 1.01.001
    * 
    * @see: No tiene documentación para consultar.
    */  
    @Override
    public double GetDistanceToTheSun() {
        return this.distanceToTheSun;   
    }

    /**
    * @return Retorna el valor de los parametros que construyen la entidad Planeta. 
    * 
    * @trows Exepción
    * 
    * [Detalles del objetivo del metodo
    * El metodo tiene la finalidad de sobre escribir al metodo toString, para que muestre las caracteristicas del objeto.
    * ]
    * @version: 1.01.001  24/02/2022.
    *
    * @autor: Juan Pablo Gonzalez Marin
    *
    * @since: 1.01.001
    * 
    * @see: No tiene documentación para consultar.
    */  
    @Override
    public String toString(){
        return id+" | Masa del planeta "+name+" : "+ mass+ " | Densidad : "+density+" g/cm^3 | Diametro : "+diameter+" km^2 | Distancia al sol : "+distanceToTheSun+" km^2";
    }
    
    
}
