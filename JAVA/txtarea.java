import javax.swing.*;
public class txtarea extends JFrame {
  private JTextField textField1;
  private JTextArea textArea1;

  public txtarea(){
    setLayout(null);
    textField1 = new JTextField();
    textField1.setBounds(10,10,200,30);
    add(textField1);

    textArea1 = new JTextArea();
    textArea1.setBounds(10,50,400,300);
    add(textArea1);
  }

  public static void main(String[] args) {
    txtarea formulario1 = new txtarea();
    formulario1.setBounds(0,0,540,400);
    formulario1.setVisible(true);
    formulario1.setResizable(false);
    formulario1.setLocationRelativeTo(null);
  }
}
