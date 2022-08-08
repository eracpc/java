import javax.swing.*;
public class scrollpane extends JFrame{
  private JTextField textField1;
  private JScrollPane scrollPane1;
  private JTextArea textArea1;

  public scrollpane(){
    setLayout(null);
    textField1 = new JTextField();
    textField1.setBounds(10,10,200,30);
    add(textField1);

    textArea1 = new JTextArea();
    scrollPane1 = new JScrollPane(textArea1);
    scrollPane1.setBounds(10,50,400,300);
    add(scrollPane1);
  }
  public static void main(String args[] ) {
  scrollpane  formulario1 = new scrollpane();
  formulario1.setBounds(0,0,500,400);    
  formulario1.setVisible(true);
  formulario1.setResizable(false);
  formulario1.setLocationRelativeTo(null);
  }
}
