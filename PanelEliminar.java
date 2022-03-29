import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelEliminar extends JPanel implements ActionListener
{
  private JButton btnBuscar, btnEliminar;
  private JTextField txtNombre, txtTelefono, txtCorreo, txtCumple;

  MPersona mpersona = new MPersona();
  


  
  public PanelEliminar()
  {
    setLayout(new GridLayout(7,2));
    JLabel lblNombre = new JLabel("Nombre: ", JLabel.RIGHT);
    txtNombre = new JTextField(30);
    add(lblNombre);
    add(txtNombre);
    
    JLabel lblTelefono = new JLabel("Telefono: ", JLabel.RIGHT);
    txtTelefono = new JTextField(30);
    
    add(lblTelefono);
    add(txtTelefono);
    txtTelefono.setEditable(false);


    JLabel lblCorreo = new JLabel("Correo: ", JLabel.RIGHT);
    txtCorreo = new JTextField(15);
    add(lblCorreo);
    add(txtCorreo);
    txtCorreo.setEditable(false);
    
    JLabel lblCumple = new JLabel("Fecha de cumpleaños: ", JLabel.RIGHT);
    txtCumple = new JTextField(30);
    add(lblCumple);
    add(txtCumple);
    txtCumple.setEditable(false);

    
    btnBuscar = new JButton("Buscar");
    btnBuscar.addActionListener(this);
    add(btnBuscar);
    
    btnEliminar = new JButton("Eliminar");
    btnEliminar.addActionListener(this);
    btnEliminar.setEnabled(false);
    add(btnEliminar);
    
  }
  
  public void actionPerformed(ActionEvent e)
  {
      String nombre, telefono, correo, cumple;
      int celda;
      Persona p;
      
      if(e.getSource()== btnBuscar){
      nombre = txtNombre.getText();
      celda  = mpersona.getCasilla(nombre);
      if (celda != -1) {
          p = mpersona.consultar(celda);
          txtTelefono.setText(p.getTelefono());
          txtCorreo.setText(p.getCorreo());
          txtCumple.setText(p.getCumple());
          
          txtNombre.setEditable(false);
          txtTelefono.setEditable(true);
          txtCorreo.setEditable(true);
          txtCumple.setEditable(true);
          btnEliminar.setEnabled(true);
        
         }else {
         JOptionPane.showMessageDialog(null, " No se encuentro ninguna persona con ese nombre");
         }
      }
      
      if(e.getSource()== btnEliminar){
      nombre = txtNombre.getText();
      celda  = mpersona.getCasilla(nombre);
      mpersona.eliminar(celda);
      JOptionPane.showMessageDialog(null, " Persona Eliminada");

      }
   }
}