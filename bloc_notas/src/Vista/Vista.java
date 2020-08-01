/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author AlumnoTarde
 */
public class Vista extends JFrame {
    
    public static javax.swing.JMenu jMenu1;
    public static javax.swing.JMenu jMenu2;
    public static javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JMenuItem jMenuItem1;
    public static javax.swing.JMenuItem jMenuItem2;
    public static javax.swing.JMenuItem jMenuItem3;
    public static javax.swing.JMenuItem jMenuItem4;
    public static javax.swing.JMenuItem jMenuItem5;
    public static javax.swing.JMenuItem jMenuItem6;
    public static javax.swing.JMenuItem jMenuItem7;
    public static javax.swing.JMenuItem jMenuItem8;
    public static javax.swing.JMenuItem jMenuItem9;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JPopupMenu.Separator jSeparator1;
    public static javax.swing.JTextArea jTextArea1;
    
    public Vista() {
        super("Bloc de notas");
        setLayout(null);
        valoresIniciales();
        anadirColocar();
        setSize(500, 500);
    }
    
    private void valoresIniciales(){
        
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        
    }
    
    private void anadirColocar(){
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editor de Texto");
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);
        jMenu1.setText("Archivos");
        jMenuItem9.setText("Nuevo");
        jMenu1.add(jMenuItem9);
        jMenuItem2.setText("Abrir");
        jMenu1.add(jMenuItem2);
        jMenuItem3.setText("Guardar");
        jMenu1.add(jMenuItem3);
        jMenuItem4.setText("Guardar como...");
        jMenu1.add(jMenuItem4);
        jMenuItem1.setText("Imprimir");
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);
        jMenuItem5.setText("Salir");
        jMenu1.add(jMenuItem5);
        jMenuBar1.add(jMenu1);
        jMenu2.setText("Editar");
        jMenuItem6.setText("Cortar");
        jMenu2.add(jMenuItem6);
        jMenuItem7.setText("Copiar");
        jMenu2.add(jMenuItem7);
        jMenuItem8.setText("Pegar");
        jMenu2.add(jMenuItem8);
        jMenuBar1.add(jMenu2);
        setJMenuBar(jMenuBar1);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
        );
        pack();
    }

}
