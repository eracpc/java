import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class BotonTerminos extends JFrame implements ActionListener, ChangeListener {

  private JLabel label1;
  private JCheckBox check1;
  private JButton button1;

  public BotonTerminos (){
    setLayout(null);
    label1 = new JLabel("Aceptar Terminos y Condiciones");
    label1.setBounds(10,10,400,30);
    add(label1);

    check1 = new JCheckBox("Acepto");
    check1.setBounds(10,50,100,30);
    check1.addChangeListener(this);
    add(check1);

    button1 = new JButton("Continuar");
    button1.setBounds(10,100,100,30);
    add(button1);
    button1.addActionListener(this);
    button1.setEnabled(false);
  }

  public void stateChanged(ChangeEvent e) {
    if (check1.isSelected() == true) {
      button1.setEnabled(true);
    } else {
      button1.setEnabled(false);
    }
  }

  public void actionPerformed (ActionEvent e) {
    if (e.getSource() == button1) {
      System.exit(0);
    }
  }

  public static void main(String[] args) {
    BotonTerminos formulario1 = new BotonTerminos();
    formulario1.setBounds(0,0,350,200);
    formulario1.setVisible(true);
    formulario1.setResizable(false);
    formulario1.setLocationRelativeTo(null);
  }
}
