/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VISTA;

import MODELO.Encargado;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author MARISELA
 */
public class FRM_Encargado extends javax.swing.JFrame {

    /**
     * Creates new form FRM_Encargado
     */
    public FRM_Encargado() {
        initComponents();
    }

    
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   public void escuchadorCombo(ActionListener manejador)
   {
     this.jcbId.addActionListener(manejador);
   }
  //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 
  public Encargado getEncargado()
  {
    return new Encargado(this.txtIdentificacionEncargado.getText(),this.txtNombre.getText(),this.txtApellido.getText(),Integer.parseInt(this.txtAnioNacimiento.getText()),Integer.parseInt(this.txtContrasena.getText()));
  }  
 //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
  
  public void setEncargado(Encargado encargado)
  {
    this.txtIdentificacionEncargado.setText(encargado.getIdEncargado());
    this.txtNombre.setText(encargado.getNombre());
    this.txtApellido.setText(encargado.getApellido());
    this.txtAnioNacimiento.setText(encargado.getAnnioNacimiento()+"");
    this.txtContrasena.setText(encargado.getContrasena()+"");
  }
 //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
  
   public void limpiar()
   {
     this.txtIdentificacionEncargado.setText("");
     this.txtNombre.setText("");
     this.txtApellido.setText("");
     this.txtAnioNacimiento.setText("");
     this.txtContrasena.setText("");
   }
   //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   
    public void cargarCombo(String[] listaEncargados)
    {
      this.jcbId.setModel(new DefaultComboBoxModel<>(listaEncargados));
    }
  //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    
    public String devolverCombo()
    {
      return jcbId.getSelectedItem().toString();
    }
  //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    
    public boolean verificar()
    {
        if (txtIdentificacionEncargado.getText().isEmpty() || txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtAnioNacimiento.getText().isEmpty()|| txtContrasena.getText().isEmpty()) 
        {
            return true;
        }
        return false;     
        
    }
    
    public void escucharBotones(ActionListener manejador)
    {
        this.btnAgregar.addActionListener(manejador);
        this.btnBuscar.addActionListener(manejador);
        this.btnModificar.addActionListener(manejador);
        this.btnEliminar.addActionListener(manejador);
        this.btnReporte.addActionListener(manejador);
        this.btnSalir.addActionListener(manejador);
        this.jcbId.addActionListener(manejador);
    }
    
    public void mensaje(String mensaje)
    {
       JOptionPane.showMessageDialog(null,mensaje);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jlIdentificacionEncargado = new javax.swing.JLabel();
        txtIdentificacionEncargado = new javax.swing.JTextField();
        jlNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jlApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jlAnioNacimiento = new javax.swing.JLabel();
        txtAnioNacimiento = new javax.swing.JTextField();
        jlContrasena = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JTextField();
        jcbId = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Registro Encargados");

        jlIdentificacionEncargado.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jlIdentificacionEncargado.setText("Identificacion Encargado:");

        jlNombre.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jlNombre.setText("Nombre:");

        jlApellido.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jlApellido.setText("Apellido:");

        jlAnioNacimiento.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jlAnioNacimiento.setText("Año Nacimiento:");

        jlContrasena.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jlContrasena.setText("Contraseña:");

        jcbId.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jcbId.setActionCommand("comboBoxIdentificaciones");

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnAgregar.setText("AGREGAR");

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnBuscar.setText("BUSCAR");

        btnModificar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnModificar.setText("MODIFICAR");

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnEliminar.setText("ELIMINAR");

        btnReporte.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnReporte.setText("REPORTE");

        btnSalir.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnSalir.setText("SALIR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jlNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlIdentificacionEncargado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jlApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jlContrasena, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlAnioNacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIdentificacionEncargado)
                                    .addComponent(txtNombre)
                                    .addComponent(txtApellido)
                                    .addComponent(txtAnioNacimiento)
                                    .addComponent(txtContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnReporte)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir)
                        .addContainerGap(33, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlIdentificacionEncargado)
                    .addComponent(txtIdentificacionEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAnioNacimiento)
                    .addComponent(txtAnioNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlContrasena)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnBuscar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnReporte)
                    .addComponent(btnSalir))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbId;
    private javax.swing.JLabel jlAnioNacimiento;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlContrasena;
    private javax.swing.JLabel jlIdentificacionEncargado;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JTextField txtAnioNacimiento;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtIdentificacionEncargado;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
