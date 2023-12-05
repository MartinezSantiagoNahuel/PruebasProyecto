/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios.vistas;

import interfaces.IGestorUsuarios;
import java.awt.Dialog;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import usuarios.modelos.Cliente;
import usuarios.modelos.GestorUsuarios;
import usuarios.modelos.ModeloComboPerfiles;
import usuarios.modelos.Perfil;
import usuarios.modelos.Usuario;

/**
 * Ventana destinada al Alta y Modificación de los Usuarios del programa
 *
 * @author Ana Kuenneth
 */
public class VentanaAMUsuario extends JDialog {

    IGestorUsuarios gu = GestorUsuarios.instanciar();
    
    private ArrayList<Cliente> clientes = new ArrayList<>();

    /**
     * Constructor
     *
     * @param ventanaPadre ventana padre
     */
    public VentanaAMUsuario(Dialog ventanaPadre) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setTitle("Usuarios");
        this.configurarComboPerfiles();
    }

    public JTextField verCorreo() {
        return this.txtCorreo;
    }

    public JTextField verNombre() {
        return this.txtNombre;
    }

    public JTextField verApellido() {
        return this.txtApellido;
    }

    public JComboBox verPerfil() {
        return this.comboPerfiles;
    }

    public JPasswordField verClave() {
        return this.passClave;
    }

    public JPasswordField verClaveRep() {
        return this.passClaveRep;
    }

    /**
     * Destinado para el uso y configuración de los distintos perfiles de los
     * usuarios Configura el combo de perfiles.
     */
    private void configurarComboPerfiles() {
        ModeloComboPerfiles mcp = new ModeloComboPerfiles();
        this.comboPerfiles.setModel(mcp);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        apellidoLabel = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        nombreLabel = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        correoLabel = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        passClave = new javax.swing.JPasswordField();
        claveLabel = new javax.swing.JLabel();
        claverepetidaLabel = new javax.swing.JLabel();
        passClaveRep = new javax.swing.JPasswordField();
        perfilLabel = new javax.swing.JLabel();
        comboPerfiles = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        apellidoLabel.setText("Apellido");

        txtApellido.setToolTipText("Apellidos del profesor");
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        nombreLabel.setText("Nombre");

        txtNombre.setToolTipText("Nombres del profesor");
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        btnGuardar.setMnemonic('G');
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Guarda el profesor");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClic(evt);
            }
        });

        btnCancelar.setMnemonic('C');
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancela la operación");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarClic(evt);
            }
        });

        correoLabel.setText("Correo");

        txtCorreo.setToolTipText("Documento del profesor");
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        passClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passClaveActionPerformed(evt);
            }
        });

        claveLabel.setText("Clave");

        claverepetidaLabel.setText("Clave Repetida");

        passClaveRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passClaveRepActionPerformed(evt);
            }
        });

        perfilLabel.setText("Perfil:");

        comboPerfiles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboPerfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPerfilesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(perfilLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellidoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreLabel)
                            .addComponent(correoLabel)
                            .addComponent(claveLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(claverepetidaLabel)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                    .addComponent(passClave, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCorreo)
                    .addComponent(txtApellido)
                    .addComponent(passClaveRep)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnGuardar)
                        .addGap(43, 43, 43)
                        .addComponent(btnCancelar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(comboPerfiles, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoLabel))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(claveLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passClaveRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(claverepetidaLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(perfilLabel)
                    .addComponent(comboPerfiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarClic(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarClic
        this.dispose();
    }//GEN-LAST:event_btnCancelarClic

    private void btnGuardarClic(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClic
        String correo = this.txtCorreo.getText().trim();
        String apellido = this.txtApellido.getText().trim();
        String nombre = this.txtNombre.getText().trim();
        String clave = new String(this.passClave.getPassword());
        String claveRepetida = new String(this.passClaveRep.getPassword());
//        String clave = "";
//        char[] passclave = this.passClave.getPassword();
//        for (int i = 0; i < passclave.length; i++) {
//            clave += passclave[i];
//        }

        
        String passclaverep = "";
        char[] claveRepAux = this.passClaveRep.getPassword();
//        for (int i = 0; i < claveRepAux.length; i++) {
//            passclaverep += claveRepAux[i];
//        }

        Perfil perfil = ((ModeloComboPerfiles) this.comboPerfiles.getModel()).obtenerPerfil();
        
        String mensajeError=gu.crearUsuario(correo, apellido, nombre, perfil, clave, claveRepetida);
        
        if(!mensajeError.equals(gu.EXITO)){
            JOptionPane.showMessageDialog(null, mensajeError, gu.ERROR, JOptionPane.ERROR_MESSAGE);
        }
        else{
            
            JOptionPane.showMessageDialog(null, mensajeError, gu.VALIDACION_EXITO, JOptionPane.PLAIN_MESSAGE);
        }
        
        System.out.println( mensajeError);
        System.out.println("Usuarios");
        System.out.println("========");
        
        
        for(Usuario u : this.gu.verUsuarios()) {
            u.mostrar();
            System.out.println();
        }
        
    }//GEN-LAST:event_btnGuardarClic

    private void passClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passClaveActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void comboPerfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPerfilesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPerfilesActionPerformed

    private void passClaveRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passClaveRepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passClaveRepActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidoLabel;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel claveLabel;
    private javax.swing.JLabel claverepetidaLabel;
    private javax.swing.JComboBox<String> comboPerfiles;
    private javax.swing.JLabel correoLabel;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JPasswordField passClave;
    private javax.swing.JPasswordField passClaveRep;
    private javax.swing.JLabel perfilLabel;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
