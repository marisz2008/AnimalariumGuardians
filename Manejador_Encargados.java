/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.Encargado;
import MODELO.RegistroEncargado;
import VISTA.FRM_Encargado;
import VISTA.FRM_Reporte_Encargados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author MARISELA
 */
public class Manejador_Encargados implements ActionListener,MouseListener {
    
    private RegistroEncargado registroEncargado;
    private FRM_Encargado frmEncargado;
    private Encargado encargado;
    private  FRM_Reporte_Encargados reporte;
    
    
     public Manejador_Encargados(RegistroEncargado registroEncargado){
        this.frmEncargado = new FRM_Encargado();
        this.registroEncargado = registroEncargado; // Primero inicializa registroEncargado
        this.frmEncargado.escucharBotones(this);
        this.frmEncargado.escuchadorCombo(this);
        this.frmEncargado.cargarCombo(this.registroEncargado.getComboIdentificacion()); // Luego carga el combo
        this.frmEncargado.setVisible(true);
        this.reporte = new FRM_Reporte_Encargados();
        this.reporte.escucharMouse(this);
        
        
    }
     
     
     public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand().toString()){
            
            case "AGREGAR":
            try {
                if (frmEncargado.verificar()) {
                    frmEncargado.mensaje("Por favor ingrese todos los valores");
                } else {
                    Encargado nuevoEncargado = frmEncargado.getEncargado();
                    frmEncargado.mensaje(registroEncargado.agregarEncargado(nuevoEncargado));
                    frmEncargado.cargarCombo(registroEncargado.getComboIdentificacion());
                    frmEncargado.limpiar();
                }
            } catch (NumberFormatException ex) {
                frmEncargado.mensaje("El annio de nacimiento y la contrasena deben ser valores numericos enteros.");
            }


            break;
            
            case "BUSCAR":
              String idEncargado = frmEncargado.devolverCombo();
              Encargado encargadoEncontrado = registroEncargado.buscarEncargado(idEncargado);
              if (encargadoEncontrado != null) {
                    frmEncargado.setEncargado(encargadoEncontrado);
                    frmEncargado.mensaje("Encargado encontrado");
               } else {
                    // Si no se encuentra, mostrar un mensaje indicando que no se encontró
                    frmEncargado.mensaje("No se encuentra el encargado");
               }  
                
                
            break;
            
            
            case "MODIFICAR":
                 if(frmEncargado.verificar()== true){
                    this.frmEncargado.mensaje("Por favor ingrese todos los valores");
                } else {
                     this.encargado = frmEncargado.getEncargado();
                     this.frmEncargado.mensaje(registroEncargado.editarEncargado(encargado));
                     this.frmEncargado.cargarCombo(this.registroEncargado.getComboIdentificacion());
                     this.frmEncargado.limpiar();
                    
                }
            break;
            
            case "ELIMINAR":
                this.encargado = frmEncargado.getEncargado();
                this.frmEncargado.mensaje(registroEncargado.borrarEncargado(encargado));
                this.frmEncargado.cargarCombo(this.registroEncargado.getComboIdentificacion());
                this.frmEncargado.limpiar();
                
            break;
            
            case "SALIR":
                frmEncargado.dispose();
            break;
            
            case "comboBoxIdentificaciones":
                this.encargado = this.registroEncargado.buscarEncargado(this.frmEncargado.devolverCombo());
                this.frmEncargado.setEncargado(encargado);
                
               
            break;
            
            case "REPORTE":
               this.reporte.setDataTabla(registroEncargado.getMatrizEncargados(), Encargado.IDENTIFICACIONES_ENCARGADOS);
               this.reporte.setVisible(true);
            break;
        }
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
     this.frmEncargado.setEncargado(new Encargado(this.reporte.getDataRow()[0], this.reporte.getDataRow()[1], this.reporte.getDataRow()[2], Integer.parseInt(this.reporte.getDataRow()[3]), Integer.parseInt(this.reporte.getDataRow()[4])));
     this.reporte.dispose();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
    }
    
    
}
