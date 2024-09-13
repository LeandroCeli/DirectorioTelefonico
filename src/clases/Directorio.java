package clases;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Celi Leandro
 */
public class Directorio 
{
    
    public TreeMap<Long, Contacto> directorio;

    public Directorio() {
        directorio = new TreeMap<>();
    }
    public  void agregarContacto(Long telefono, Contacto contacto){
        directorio.put(telefono, contacto);
    }
    
    public Contacto busarContacto(Long numeroTelefono){
        
        // Atencion hay q ver el valor q retorna si el telefono no esta almacenado
        return (directorio.get(numeroTelefono));
    }
    
   
    public Set<Long> buscarTelefono(String apellido) {
        Set<Long> telefonos = new TreeSet<>();
        for (Map.Entry<Long, Contacto> entry : directorio.entrySet()) {
            if (entry.getValue().getApellido().equals(apellido)) {
                telefonos.add(entry.getKey());
            }
        }
        return telefonos;
    }
    
    
public ArrayList<Contacto> buscarContactos(String ciudad) {
        ArrayList<Contacto> contactos = new ArrayList<>();
        for (Contacto contacto : directorio.values()) {
            if (contacto.getCiudad().equals(ciudad)) {
                contactos.add(contacto);
            }
        }
        return contactos;
    }
    
    public void borrarContacto(Long telefono) {
        directorio.remove(telefono);
    }
    public Set<Map.Entry<Long, Contacto>> ObtenerContactos() {
        return directorio.entrySet();
    }
}
