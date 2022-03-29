import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelBuscar extends JPanel implements ActionListener
{
  private JButton btnBuscar;
  private JTextField txtNombre, txtTelefono, txtCorreo, txtCumple;

  MPersona mpersona = new MPersona();
  


  
  public PanelBuscar()
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
    
  }
  
  public void actionPerformed(ActionEvent e)
  {
      String nombre;
      int celda;
      Persona p;
       
      nombre = txtNombre.getText();
      celda  = mpersona.getCasilla(nombre);
      if (celda != -1) {
          p = mpersona.consultar(celda);
          txtTelefono.setText(p.getTelefono());
          txtCorreo.setText(p.getCorreo());
          txtCumple.setText(p.getCumple());

         
      } else {
          JOptionPane.showMessageDialog(null, " No se encuentro ninguna persona con ese nombre");
      }
    
   }
}