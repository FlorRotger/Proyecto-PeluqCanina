
package com.mycompany.peluqcanina.persistencia;

import com.mycompany.peluqcanina.logica.Duenio;
import com.mycompany.peluqcanina.logica.Mascota;


public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        
        //creamos en BD duenio
        duenioJpa.create(duenio);
        
        //creamos en BD mascota
        mascoJpa.create(masco);
        
    }
    
}
