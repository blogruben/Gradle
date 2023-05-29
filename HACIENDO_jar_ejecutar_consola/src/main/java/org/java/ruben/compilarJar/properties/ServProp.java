package org.java.ruben.compilarJar.properties;

public class ServProp {

    /*
     * mostramos por pantalla las propiedades del Enun Prop
     */
    public static void mostrarPropiedades( )
	{
        System.out.println("-------------------------Propiedades--------------------------");    
        for (Prop prop : Prop.values()) { 
            System.out.println(prop); 
        }
        System.out.println("---------------------------------------------------------------");    
        System.out.println();   
	}
}
