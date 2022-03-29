import javax.swing.*;
import java.awt.*;

public class JFrameSeleccion extends JFrame
{
  PanelSeleccion mostrar = new PanelSeleccion();

      
    public JFrameSeleccion()
   {  
    
      initComponents();
   }
   
   private void initComponents()
   {
      this.setEnabled(true);
      setSize(350, 200);
      setTitle("Seleccion");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setContentPane(mostrar);
      setVisible(true);
      this.getContentPane().setBackground(Color.orange);  
   }   
}