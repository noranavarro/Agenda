import javax.swing.*;
import java.awt.*;

public class JFrameEliminar extends JFrame
{
  PanelEliminar mostrar = new PanelEliminar();
   
    public JFrameEliminar()
   {  
    super.setVisible(true);
      initComponents();
     
   }
   
   private void initComponents()
   {
      setSize(300, 200);
      setTitle("ELIMINAR");
      setResizable(false);
      setContentPane(mostrar);
      setVisible(true);
       
   } 
   
    
     
}