import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuBarExemplo {
  public static void main(String[] args) {
    
    // Permite criar uma barra de menu no container
    JMenuBar mb = new JMenuBar();
    
    JMenu m1 = new JMenu("Arquivo");
    m1.setMnemonic('A');

    JMenuItem mi1 = new JMenuItem("Sair");
    mi1.setMnemonic('S');
    m1.add(mi1);
    

    JMenu m2 = new JMenu("Editar");
    m2.setMnemonic('E');
    
    JMenuItem mi2 = new JMenuItem("Configurar");
    mi2.setMnemonic('C');
    // adicionando item no menu
    m2.add(mi2);
    
    // adicionando menu ao menuBar
    mb.add(m1);
    mb.add(m2);

    JFrame f = new JFrame();
    f.setJMenuBar(mb);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(500,300);
    f.setVisible(true);
  }
}
