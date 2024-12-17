/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 * $Id$ 
 * Universidad de los Andes (Bogot� - Colombia) 
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1  
 * 
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co) 
 * Ejercicio: n1_lineasTelefonicas
 * Autor: Pablo Barvo - Dec 6, 2005
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */

package uniandes.cupi2.lineasTelefonicas.mundo;

/**
 * Clase que representa el consorcio
 */
 
 public class Consorcio
 {
    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------
     
    private Empresa empresaA;
    private Empresa empresaB;
    private Empresa empresaC;
  
    /**
    * Constructor de la clase Consorcio
    */
    public Consorcio()
    {
    	empresaA = new Empresa();
        empresaA.inicializar();
        
        empresaB = new Empresa();
        empresaB.inicializar();
        
        empresaC = new Empresa();
        empresaC.inicializar();
	    
    }
	
    /**
    * Calcula el total de dinero que debe pagar el consorcio por consumo en lineas telefonicas
    * @return cantidad a pagar por consumo telefonico
    */
     public double darTotalFacturaConsorcio ( )
     {
    	return empresaA.darTotalCostoLlamadas() + empresaB.darTotalCostoLlamadas() + empresaC.darTotalCostoLlamadas();
     }
 
     /**
     * Calcula el costo de impuestos que debe pagar el consorcio por concepto de inpuestos telefonicos
     * @return impuestos
     */
     public double darTotalImpuestos()
     {
    	double impA = 1 * empresaA.darTotalNumeroLlamadas() + 0.04*empresaA.darTotalCostoLlamadas();
	    double impB = 3 * empresaB.darTotalNumeroLlamadas() + 0.01*empresaB.darTotalMinutos();
	    double impC = 0.05*empresaC.darTotalCostoLlamadas();
	    
	    return impA + impB + impC;   	
     }
}
 