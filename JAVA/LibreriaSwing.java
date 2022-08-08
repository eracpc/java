import javax.swing.*;

public class LibreriaSwing extends JFrame {
  private JLabel label1;

  public LibreriaSwing(){
    setLayout(null);
    label1 = new JLabel("Programando Con Roberto");
    label1.setBounds(10,10,200,250);
    add(label1);
  }
  
  public static void main(String[] args) {
    LibreriaSwing formulario1 = new LibreriaSwing();
    formulario1.setBounds(0,0,200,250);
    formulario1.setVisible(true);
    formulario1.setLocationRelativeTo(null);
  }
}
