package org.java.ruben.ejecutar;

import java.util.Arrays;

public class App {

    public static void main(String[] args)  {
        
        System.out.print("Los argumentos son -> ");
        Arrays.stream(args).forEach(str -> System.out.print(str + ", "));

        System.out.println(System.lineSeparator()+"La propiedad myvariable -> "+System.getProperty("myvariable"));
        System.out.println(System.lineSeparator()+"La propiedad applicationName -> "+System.getProperty("applicationName"));
        System.out.println(System.lineSeparator()+"La propiedad saludar -> "+System.getProperty("saludar"));


    }


    
}
