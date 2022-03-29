import javax.swing.*;
import java.awt.*;

public class JFrameMostrar extends JFrame
{
   PanelDatos mostrar = new PanelDatos();
   
    public JFrameMostrar()
   {  
     super.setVisible(true);
      initComponents();
   }
   
   private void initComponents()
   {
      super.setVisible(true);
      super.dispose();
      setSize(300, 200);
      setTitle("AGENDA");
      setResizable(false);
      setContentPane(mostrar);
      setVisible(true);
       
   } 
   
    
     
}