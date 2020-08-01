/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc_notas;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;

/**
 *
 * @author AlumnoTarde
 */
public class Bloc_notas {
    
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista,modelo);
        vista.setVisible(true);
    }
    
}
