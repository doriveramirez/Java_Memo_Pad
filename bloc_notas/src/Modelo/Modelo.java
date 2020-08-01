/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.Vista;
import bloc_notas.Bloc_notas;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author AlumnoTarde
 */
public class Modelo {
    public static void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (!Vista.jTextArea1.getText().equals("")) {
            jMenuItem3ActionPerformed(evt);
        }
        JFileChooser selector = new JFileChooser();
        int seleccion = selector.showOpenDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = selector.getSelectedFile();
            try {
                FileReader flujo=new FileReader(fichero);
                Scanner lector = new Scanner(flujo);
                String texto2 = "";
                boolean finalfichero = false;
                while (finalfichero==false) {
                    String texto = lector.nextLine() + "\n";
                    texto2 = texto2 + texto;
                    System.out.println(lector.hasNext());
                    if (lector.hasNext() == false) {
                        finalfichero=true;
                    }
                }
                Vista.jTextArea1.setText(texto2);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error de fichero","Bloc de Notas",0);
            }
        }
    }                                          

    public static void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        Vista.jTextArea1.cut();

    }                                          

    public static void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        Vista.jTextArea1.copy();
    }                                          

    public static void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        Vista.jTextArea1.paste();
    }                                          

    public static void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
            Vista.jTextArea1.print();
        } catch (PrinterException ex) {
            Logger.getLogger(bloc_notas.Bloc_notas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                          

    public static void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        JFileChooser selector= new JFileChooser();
        int seleccion=selector.showSaveDialog(null);
        if(seleccion==JFileChooser.APPROVE_OPTION){
            String ruta =""+selector.getSelectedFile();
            File fichero=new File(ruta);
            String texto;
            if(!fichero.getAbsoluteFile().exists()){
                try{
                    fichero.createNewFile();
                    FileWriter flujo =new FileWriter(fichero,true);
                    PrintWriter escritor=new PrintWriter(flujo);
                    texto=Vista.jTextArea1.getText();
                    String[] texto2=texto.split(texto);
                    for(int i=0;i<texto2.length;i++){
                        escritor.println(texto2[i]);
                    }
                }catch(IOException e){
                   JOptionPane.showMessageDialog(null, "Error de fichero","Bloc de Notas",0);
                }
            }
        }
    }                                          

    public static void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        jMenuItem3ActionPerformed(evt);
    }                                          

    public static void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        int eleccion;
        if (!Vista.jTextArea1.getText().equals("")) {
            eleccion = JOptionPane.showConfirmDialog(null, "¿Desea guardar los cambios hechos?", "Bloc de Notas", 0);
            if (eleccion == JOptionPane.YES_OPTION) {
                jMenuItem3ActionPerformed(evt);
                Vista.jTextArea1.setText(null);
            }
            if (eleccion == JOptionPane.NO_OPTION) {
                Vista.jTextArea1.setText(null);
            }
        }
    }                                          

    public static void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if(Vista.jTextArea1.getText().equals("")){
            System.exit(0);
        }
        else{
            int seleccion=JOptionPane.showConfirmDialog(null, "¿Desea guardar los cambios hechos?", "Bloc de Notas", 0);
            if(seleccion==JOptionPane.YES_OPTION){
                jMenuItem3ActionPerformed(evt);
                System.exit(0);
            }else{
                System.exit(0);
            }
        }
    }                                         
}
