/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.RegistroEncargado;
import VISTA.FRM_Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author MARISELA
 */
public class Manejador_Menus implements ActionListener {
    

    private FRM_Menu frmMenu;
    private RegistroEncargado registroEncargado;
    

    public Manejador_Menus() {
        this.frmMenu = new FRM_Menu();
        this.frmMenu.escucharBotonesMenu(this); 
        this.frmMenu.setVisible(true);
        this.registroEncargado = new RegistroEncargado();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) { 
            
            case "VER REGISTRO": 
                break;
                
            case "REGISTRAR": 
                break;
                
            case "ADMINISTRAR REGISTRO": 
                break;

            case "ADMINISTRAR USUARIO": 
                new Manejador_Encargados(registroEncargado);
                break;

            case "LOG_IN": 
                break;

            default:
               JOptionPane.showMessageDialog(null,"Ingrese una opcion valida");
                break;
        }
    }


    
    
    
    
    
    
}
