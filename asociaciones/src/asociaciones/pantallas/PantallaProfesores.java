/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asociaciones.pantallas;

import asociaciones.entidades.Curso;
import asociaciones.entidades.Profesor;
import static asociaciones.pantallas.PantallaGestorCursos.ListaCurso;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Kelvin
 */
public class PantallaProfesores extends javax.swing.JFrame {
    
    private Curso curso;
    private Profesor profe=null;
    /**
     * Creates new form PantallaProfesores
     */
    public PantallaProfesores(Curso curso) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.curso = curso;
        
        llenarList();
    }
     public void llenarList(){
        DefaultListModel modelo =new DefaultListModel();        
        list_profesores.setModel(modelo); 
        modelo.removeAllElements();
        for (int i = 0; i < curso.getProfesores().length; i++) {
            if(curso.getProfesores()[i]!=null){
                modelo.addElement(curso.getProfesores()[i].getNombre());
            }
        }
    }
    public List<Profesor> buscar(String criterio) {
        return new ArrayList<>();
    }
    
  
    public void eliminar(Profesor profesor) {
        //TODO:implementar
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_agregar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_profesores = new javax.swing.JList<>();
        btn_salir = new javax.swing.JButton();
        txt_nombrebuscar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        lbl_profesorescurso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        list_profesores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(list_profesores);

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        lbl_profesorescurso.setText("Profesores de:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_salir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_eliminar)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_profesorescurso)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_nombrebuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_buscar)))
                        .addGap(0, 56, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(lbl_profesorescurso)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombrebuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_salir))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        
        Profesor profesor = new Profesor();
        PantallaEditarProfesor pantallaEditProfe = new PantallaEditarProfesor(curso);
        pantallaEditProfe.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
       
        boolean eliminado = false;
        Profesor [] nuevalista = curso.getProfesores();
        if(profe!=null)
        {            
            for (int i = 0; i < 2; i++) {
                if(curso.getProfesores()[i]!=null&&
                        curso.getProfesores()[i].equals(profe))
                {
                    nuevalista[i]=null;
                    curso.setProfesores(nuevalista);
                    eliminado= true;
                    llenarList();
                    JOptionPane.showMessageDialog(null, "Profesor Eliminado",
                    "Eliminar", JOptionPane.INFORMATION_MESSAGE); 
                }
            }
            if(eliminado==false){
                 JOptionPane.showMessageDialog(null, "El profesor ingresado no"
                    + " esta registrado","Eliminar", JOptionPane.INFORMATION_MESSAGE); 
            }
        }else{
            JOptionPane.showMessageDialog(null, "Primero debes buscar mediante el nombre",
                    "Eliminar", JOptionPane.INFORMATION_MESSAGE);   
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        PantallaGestorCursos pantalla = new PantallaGestorCursos(ListaCurso);
        pantalla.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        String nombreProfes = txt_nombrebuscar.getText();
        boolean encontrado = false;
        if(!nombreProfes.isEmpty())
        {
            for (int i = 0; i < 2; i++) {
                if(curso.getProfesores()[i]!=null &&
                    curso.getProfesores()[i].getNombre().equals(nombreProfes))
                {
                    encontrado= true;
                    llenarList();     
                    profe = curso.getProfesores()[i];
                    JOptionPane.showMessageDialog(null, "Profesor Encontrado \n"                        
                        + "Nombre: "+curso.getProfesores()[i].getNombre()+"\n",
                    "Buscar", JOptionPane.INFORMATION_MESSAGE); 
                }
            }
            if(encontrado==false){
                 JOptionPane.showMessageDialog(null, "El profesor ingresado no"
                         + " esta registrado","Buscar", JOptionPane.INFORMATION_MESSAGE); 
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese nombre del profesor",
                    "Buscar Profesor", JOptionPane.INFORMATION_MESSAGE);   
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_profesorescurso;
    private javax.swing.JList<String> list_profesores;
    private javax.swing.JTextField txt_nombrebuscar;
    // End of variables declaration//GEN-END:variables
}
