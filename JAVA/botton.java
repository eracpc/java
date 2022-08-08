import javax.swing.*;
import java.awt.event.*;

public class botton extends JFrame implements ActionListener{
      
  JButton boton1;
  public botton (){
    setLayout(null);
    boton1=new JButton("cerrar");
    boton1.setBounds(300, 250,100, 30); 
    add(boton1);
    boton1.addActionListener(this);
  }
 
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == boton1 ) {
      System.exit(0);
    } 
  }
  public static void main(String[] args) {
    botton botton1 = new botton();
    botton1.setBounds(0,0,450,350);
    botton1.setVisible(true);
    botton1.setResizable(false);
    botton1.setLocationRelativeTo(null);
  }
}
