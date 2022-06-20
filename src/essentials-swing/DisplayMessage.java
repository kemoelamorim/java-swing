import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class DisplayMessage {
    public static void main(String[] args) {
        
        /* * Etapa 1: criar os componentes */
        JLabel msgLabel = new JLabel();
        JButton yesButton = new JButton();
        JButton noButton = new JButton();

        /* * Etapa 2: Defina as propriedades dos componentes */
        msgLabel.setText(args[0]);
        msgLabel.setBorder(new EmptyBorder(10,10,10,10));
        yesButton.setText((args.length >= 2)?args[1]:"Sim");
        noButton.setText((args.length >= 3)?args[2]:"Não");

        /* * Etapa 3: criar contêineres para armazenar os componentes */
        JFrame f = new JFrame("Mensagem");
        JPanel p = new JPanel();
        
        /* * Etapa 4: Especifique LayoutManagers para organizar os componentes nos contêineres */
        f.getContentPane().setLayout(new BorderLayout());
        p.setLayout(new FlowLayout());

        /* * Step 5: Adicione componentes a contêineres, com restrições de layout opcionais */
        p.add(yesButton); // Adiciona o botão sim ao painel
        p.add(noButton); // Adiciona o botão Não ao painel

        // Adiciona o JLabel à janela, dizendo ao BorderLayout para colocá-lo na parte-inferior
        f.getContentPane().add(msgLabel, "Center");

        // Adiciona o Panel à janela, dizendo ao BorderLayout para colocá-lo na parte inferior
        f.getContentPane().add(msgLabel, "South");

        /* * Etapa 6: Organizar para lidar com eventos na interface do usuário */
        yesButton.addActionListener(new ActionListener(){
            // Este método é chamado quando o botão Sim é clicado
            public void actionPerformed(ActionEvent e) { System.exit(0); }
        });
        noButton.addActionListener(new ActionListener(){
            // Este método é chamado quando o botão Não é clicado
            public void actionPerformed(ActionEvent e) { System.exit(1); }
        });

        /* * Etapa 7: Exiba a GUI para o usuário */ 
        // Define o tamanho da janela com base nos tamanhos de seus filhos 
        f.pack(); 
        // Torna a janela visível
        f.isVisible();

    }
}
