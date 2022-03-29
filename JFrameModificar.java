import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;

public class JFrameModificar extends JFrame
{
  PanelModificar mostrar = new PanelModificar();
 
    public JFrameModificar()
   {  
      super.setVisible(true);
      super.dispose();
      initComponents();
     
   }
   
   private void initComponents()
   {
      super.setVisible(true);
      super.dispose();
      setSize(300, 200);
      setTitle("MODIFICAR");
      
      setResizable(false);
      setContentPane(mostrar);
      setVisible(true);
       
   } 
   
    
     
}