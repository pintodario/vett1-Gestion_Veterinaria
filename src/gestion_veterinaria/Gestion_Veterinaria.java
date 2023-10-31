/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestion_veterinaria;

import Acceso_a_Datos.ClienteData;
import Acceso_a_Datos.MascotaData;
import Acceso_a_Datos.TratamientoData;
import Acceso_a_Datos.VisitaData;
import Entidades.Mascota;
import Entidades.Tratamiento;
import Entidades.Visita;
import java.time.LocalDate;

/**
 *
 * @author carol
 */
public class Gestion_Veterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClienteData cliente = new ClienteData();
        MascotaData mascota = new MascotaData();
        VisitaData visita = new VisitaData();
        TratamientoData tratamiento = new TratamientoData();
        

        for (Visita v : visita.listarVisitas()) {
            System.out.println(v.getID_visita());
        }
        
//        for (Visita v : visita.obtenerVisitasXmascota(10)) {
//            System.out.println(v.getDetalle());
//        }
       
    }
    
}
