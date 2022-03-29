import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelDatos extends JPanel implements ActionListener
{
  private JButton  btnGuardar;
  private JTextField txtNombre, txtTelefono, txtCorreo, txtCumple;

  
  MPersona mpa = new MPersona();
  
  public PanelDatos()
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

    JLabel lblCorreo = new JLabel("Correo: ", JLabel.RIGHT);
    txtCorreo = new JTextField(15);
    add(lblCorreo);
    add(txtCorreo);
    
    JLabel lblCumple = new JLabel("Fecha de cumpleaños: ", JLabel.RIGHT);
    txtCumple = new JTextField(30);
    add(lblCumple);
    add(txtCumple);
    
   
    btnGuardar = new JButton("Guardar");
    btnGuardar.addActionListener(this);

    
    add(btnGuardar);
 
  }
  
  public void actionPerformed(ActionEvent e)
  {
   
     if(e.getSource()==btnGuardar){
       if(txtNombre.getText()==null || txtNombre.getText().isEmpty())
        { JOptionPane.showMessageDialog(null, "Debes colocar al menos el nombre",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.requestFocus();
        }
       else
        if(txtTelefono.getText()==null || txtTelefono.getText().isEmpty())
        { JOptionPane.showMessageDialog(null, "Debes capturar su telefono",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtTelefono.requestFocus();
        }
        else
        {
          mpa.agregar(txtNombre.getText(), txtTelefono.getText(), txtCorreo.getText(),txtCumple.getText());
          JOptionPane.showMessageDialog(null, "Se guardaran los datos",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.setText(null);
            txtTelefono.setText(null);
            txtCorreo.setText(null);
            txtCumple.setText(null);
            txtNombre.requestFocus();
        }

     }
  }
}