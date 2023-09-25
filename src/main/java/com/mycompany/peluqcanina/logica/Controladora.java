package com.mycompany.peluqcanina.logica;

import com.mycompany.peluqcanina.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
     ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, String observaciones, 
            String nombreDuenio, String celDuenio, String alergico, String atenEsp) {
        
        //creamos el duenio y asignamos sus valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        masco.setObservaciones(observaciones);
        masco.setUnDuenio(duenio);
        
        //guardamos en la persistencia
        controlPersis.guardar(duenio,masco);
       
         
    }

    public List<Mascota> traerMasccotas() {
        
        return controlPersis.traerMascotas();
        
    }
    
    
}
