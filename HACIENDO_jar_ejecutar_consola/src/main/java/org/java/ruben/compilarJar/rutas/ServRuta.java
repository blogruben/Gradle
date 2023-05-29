package org.java.ruben.compilarJar.rutas;

import java.io.File;
import java.net.URISyntaxException;

public class ServRuta {


    public  static final String ponerRutaDelJar(String archivo) {
        File jarFile;
        try {
            jarFile = new File(ServRuta.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
        } catch (URISyntaxException e) {
            throw new RuntimeException("Error al buscar el directorio donde se encuentra este jar. Buscamos el archivo: "+archivo,e);
        }
        String rutaArchivo = jarFile.getParent() + File.separator + archivo; 
        System.out.println(rutaArchivo);
        return rutaArchivo;
    }
}
