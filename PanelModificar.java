import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelModificar extends JPanel implements ActionListener
{
  private JButton btnBuscar, btnModificar;
  private JTextField txtNombre, txtTelefono, txtCorreo, txtCumple;

  MPersona mpersona = new MPersona();
  


  
  public PanelModificar()
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
    
    btnModificar = new JButton("Modificar");
    btnModificar.addActionListener(this);
    btnModificar.setEnabled(false);
    add(btnModificar);
    
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
          btnModificar.setEnabled(true);
        
         }else {
         JOptionPane.showMessageDialog(null, " No se encuentro ninguna persona con ese nombre");
         }
      }
      
      if(e.getSource()== btnModificar){
         

         nombre=txtNombre.getText();
         celda  = mpersona.getCasilla(nombre);

         telefono=txtTelefono.getText();
         correo=txtCorreo.getText();
         cumple=txtCumple.getText();
         
         p= new Persona(nombre, telefono, correo, cumple);
         
         mpersona.modificar(celda,p);
         JOptionPane.showMessageDialog(null, "Se ha modificado a la persona");
         txtNombre.setText("");
         txtTelefono.setText("");
         txtCorreo.setText("");    
         txtCumple.setText("");
         
         txtNombre.setEditable(true);
         txtTelefono.setEditable(false);
         txtCorreo.setEditable(false);
         txtCumple.setEditable(false);
         btnModificar.setEnabled(false);



         
      }
       
   }
}