import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.JFrame;

public class TablaDatos extends JPanel
{


  JTable tabla;
  JScrollPane scroll = new JScrollPane();
  JButton salir;
  MPersona mp = new MPersona();
  ArrayList<Persona> datosPer = new ArrayList<Persona>();
  
  public TablaDatos()
  {
     datosPer = mp.Datos();
     String titulos [] = {"Nombre", "Telefono", "Correo", "Cumpleaños"};
     String info [][] = obtenerDatos();
     setLayout (new GridLayout(1,1));
     
     tabla = new JTable(info, titulos);
     tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
     scroll.setViewportView(tabla);
     add(scroll);
     
     
  }
    
  private String[][] obtenerDatos()
  {
    int x=0;
    String informacion[][] = new String[datosPer.size()][5];
    Iterator<Persona> itrPersona = datosPer.iterator();
    while(itrPersona.hasNext()){
       Persona p = itrPersona.next();
       informacion[x][0] = p.getNombre();
       informacion[x][1] = p.getTelefono();
       informacion[x][2] = p.getCorreo();
       informacion[x][3] = p.getCumple();
   
       x++;
     }
   return informacion;
   
  }
}