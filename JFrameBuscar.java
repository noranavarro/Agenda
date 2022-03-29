import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;

public class JFrameBuscar extends JFrame
{
  PanelBuscar mostrar = new PanelBuscar();
 
    public JFrameBuscar()
   {  
      super.setVisible(true);
      initComponents();
     
   }
   
   private void initComponents()
   {
      super.setVisible(true);
      setSize(300, 200);
      setTitle("BUSCAR");
      
      setResizable(false);
      setContentPane(mostrar);
      setVisible(true);
       
   } 
   
    
     
}