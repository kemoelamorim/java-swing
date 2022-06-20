import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class EventSourceExemplo implements ActionListener {
  JFrame f;
  JButton b1; 
  JButton b2; 
  public EventSourceExemplo(){
    f = new JFrame("Adicionando Eventos");
    b1 = new JButton("Botão 1");
    b2 = new JButton("Botão 2");
    
    b1.addActionListener(this);
    b2.addActionListener(this);

    f.add(b1);
    f.add(b2);
    f.setLayout(new FlowLayout());
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(500, 300);
    f.setVisible(true);
  }
  public static void main(String[] args) {
    new EventSourceExemplo();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    JButton b = (JButton) e.getSource();
    String nome = b.getText();
    JOptionPane.showMessageDialog(null, nome + " foi pressionado");
  }

  // Event source: Um component ou container que disparam um evento
  // Event Listeners: São os componentes interessados no evento
  // Event Manager: Notifica os componentes interessados no evento
}
