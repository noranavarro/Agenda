import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelSeleccion extends JPanel implements ActionListener
{
  private JButton btnAgregar, btnBuscar, btnEliminar, btnModificar ;
  private JTextField txtUser, lblText;
  
  public PanelSeleccion()
  {
     
    setLayout(new GridLayout(5,1));
   
     
     JLabel lblText = new JLabel("SELECCIONE UNA OPCION  ", JLabel.CENTER);
      add(lblText);
    
     
    btnAgregar = new JButton("Agregar");
    btnAgregar.addActionListener(this);
    btnBuscar= new JButton("Buscar");
    btnBuscar.addActionListener(this);
    btnEliminar = new JButton("Eliminar");
    btnEliminar.addActionListener(this);
    btnModificar = new JButton("Modificar ");
    btnModificar.addActionListener(this);
    btnAgregar.setBackground(Color.pink);
    btnEliminar.setBackground(Color.pink);
    add(btnAgregar);
    add(btnBuscar);
    add(btnEliminar);
    add(btnModificar);
   }
  
  public void actionPerformed(ActionEvent e){

      if(e.getSource()== btnBuscar){
       JFrameBuscar buscar = new JFrameBuscar();
      } 
 
   if(e.getSource()== btnAgregar){
       JFrameMostrar datos = new JFrameMostrar();
    
            
      }
   if(e.getSource()== btnEliminar){
       JFrameEliminar eliminar= new JFrameEliminar();
      }
      
   if(e.getSource()== btnModificar){
       JFrameModificar modificar= new JFrameModificar();
      } 

  

   }
  
}