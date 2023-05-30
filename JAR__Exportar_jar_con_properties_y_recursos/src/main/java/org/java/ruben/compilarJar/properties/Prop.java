package org.java.ruben.compilarJar.properties;

import org.java.ruben.compilarJar.rutas.ServRuta;

/*
 * Este enum se encarga de mapear, los properties del fichero PreexBackEndWSIL
 */
public enum Prop { 
    NUMERO_DE_HILOS("numero_de_hilos"),
    DIRECTORIO_DE_LECTURA("directorio_de_lectura");
    
    
    private static final String ARCHIVO_PROPERTIES = ServRuta.ponerRutaDelJar("ejemplo.properties") ;
    private String _clave;
    
    private Prop(String clave) {
        _clave = clave;
    }

    public int getInteger(){
        try{
            return Integer.parseInt( SingletonProperties.getInstance(ARCHIVO_PROPERTIES).getValor(_clave));
        }catch(NumberFormatException e){
            throw new RuntimeException("Error al iniciar parsear a un integer la clave: "+_clave, e);
        }
    }    

    public String[] getListado(){
        return SingletonProperties.getInstance(ARCHIVO_PROPERTIES).getValor(_clave).split(",");
    }  

    public String get(){
        return SingletonProperties.getInstance(ARCHIVO_PROPERTIES).getValor(_clave);
    }
    public String key(){
        return _clave;
    }

    @Override
    public String toString() {
        return key()+" -> "+get();
    }
 
    
	
}