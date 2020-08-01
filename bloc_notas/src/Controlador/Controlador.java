/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author AlumnoTarde
 */
public class Controlador {

    public static Vista vista;
    public static Modelo modelo;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        botones();
    }

    private void botones() {
        vista.jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelo.jMenuItem9ActionPerformed(evt);
            }
        });
        vista.jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelo.jMenuItem2ActionPerformed(evt);
            }
        });
        vista.jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelo.jMenuItem3ActionPerformed(evt);
            }
        });
        vista.jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelo.jMenuItem4ActionPerformed(evt);
            }
        });
        vista.jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelo.jMenuItem1ActionPerformed(evt);
            }
        });
        vista.jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelo.jMenuItem5ActionPerformed(evt);
            }
        });
        vista.jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelo.jMenuItem6ActionPerformed(evt);
            }
        });
        vista.jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelo.jMenuItem7ActionPerformed(evt);
            }
        });
        vista.jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelo.jMenuItem8ActionPerformed(evt);
            }
        });
    }

    private static class OyenteSalir implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

}
