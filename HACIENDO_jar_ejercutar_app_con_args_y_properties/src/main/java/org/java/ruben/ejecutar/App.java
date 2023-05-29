package org.java.ruben.ejecutar;

import java.util.Arrays;

public class App {

    public static void main(String[] args)  {
        
        System.out.print("Los argumentos son -> ");
        Arrays.stream(args).forEach(str -> System.out.print(str + " "));

        System.out.println(System.lineSeparator()+"La propiedad hola -> "+System.getProperty("hola"));


    }


    
}
