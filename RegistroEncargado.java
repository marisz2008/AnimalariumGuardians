/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 *
 * @author MARISELA
 */


public class RegistroEncargado {
    
    private String mensaje;
    private String filePath = "encargados.json";
    ArrayList<Encargado> listaEncargados; 

    public RegistroEncargado() {
        this.listaEncargados = new ArrayList<>();
        this.mensaje = "";
        this.listaEncargados = leerJSON();
    }
    
    public String agregarEncargado(Encargado encargado) {
        if (encargado != null) {
            if (buscarEncargado(encargado.getIdEncargado()) == null) {
                this.listaEncargados.add(encargado);
                mensaje = "Encargado agregado correctamente";
                escribirJSON();
            } else {
                mensaje = "Ya se encuentra un encargado con esa identificación";
            }
        } else {
            mensaje = "Error al agregar";
        }
        return mensaje;
    }
    
        public Encargado buscarEncargado(String idEncargado) {
         for (Encargado miEncargado : listaEncargados) {
             if (miEncargado.getIdEncargado().equalsIgnoreCase(idEncargado)) {
                 return miEncargado;
             }
         }
         return null;
     }

    
  public String borrarEncargado(Encargado encargado) {
        
        if (buscarEncargado(encargado.getIdEncargado()) != null) {
            this.listaEncargados.remove(buscarEncargado(encargado.getIdEncargado()));
            escribirJSON();
            mensaje = "La Operacion ha sido removida";
        } else {

            mensaje = "La Operacion no se encuentra registrada";

        }

        return mensaje;
    }

    
    
    
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
   public String editarEncargado(Encargado encargado) {
    if (buscarEncargado(encargado.getIdEncargado()) != null) {
        borrarEncargado(encargado); // Se borra el encargado antiguo
        agregarEncargado(encargado); // Se agrega el encargado actualizado
        escribirJSON(); // Se escribe la lista actualizada en el archivo JSON
        mensaje = "El encargado ha sido editado";
    } else {
        mensaje = "El encargado no se encuentra registrado";
    }
    return mensaje;
}

    
    
 //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++   
    
    private void escribirJSON() {
        JSONArray jsonArray = new JSONArray();
        for (Encargado encargado : listaEncargados) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("idEncargado", encargado.getIdEncargado());
            jsonObject.put("nombre", encargado.getNombre());
            jsonObject.put("apellido", encargado.getApellido());
            jsonObject.put("annioNacimiento", encargado.getAnnioNacimiento());
            jsonObject.put("contrasena", encargado.getContrasena());
            jsonArray.add(jsonObject);
        }
        try (FileWriter file = new FileWriter(filePath)) {
            file.write(jsonArray.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private ArrayList<Encargado> leerJSON() {
        ArrayList<Encargado> listaEncargados = new ArrayList<>();
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader(filePath)) {
            Object obj = parser.parse(reader);
            JSONArray jsonArray = (JSONArray) obj;
            for (Object object : jsonArray) {
                JSONObject jsonObject = (JSONObject) object;
                String idEncargado = (String) jsonObject.get("idEncargado");
                String nombre = (String) jsonObject.get("nombre");
                String apellido = (String) jsonObject.get("apellido");
                int annioNacimiento = ((Long) jsonObject.get("annioNacimiento")).intValue();
                int contrasena = ((Long) jsonObject.get("contrasena")).intValue();
                Encargado encargado = new Encargado(idEncargado, nombre, apellido, annioNacimiento, contrasena);
                listaEncargados.add(encargado);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return listaEncargados;
    } 
    
    public String[] getComboIdentificacion() {
        String[] identificaciones = new String[this.listaEncargados.size()];
        for (int i = 0; i < this.listaEncargados.size(); i++) {
            identificaciones[i] = this.listaEncargados.get(i).getIdEncargado();
        }
        return identificaciones;
    }
    
    public String[][] getMatrizEncargados() {
        String[][] matrizEncargados = new String[this.listaEncargados.size()][Encargado.IDENTIFICACIONES_ENCARGADOS.length];
        for (int f = 0; f < matrizEncargados.length; f++) {
            matrizEncargados[f][0] = listaEncargados.get(f).getIdEncargado();
            matrizEncargados[f][1] = listaEncargados.get(f).getNombre();
            matrizEncargados[f][2] = listaEncargados.get(f).getApellido();
            matrizEncargados[f][3] = listaEncargados.get(f).getAnnioNacimiento() + "";
            matrizEncargados[f][4] = listaEncargados.get(f).getContrasena() + "";
        }
        return matrizEncargados;
    }
}
