import javax.swing.*;
import java.awt.*;

public class Aufträge extends JFrame {

    private JPanel listscreen = new JPanel();

    private JList<String> auliste;


    Aufträge(){
        listscreen.setLayout(new BorderLayout());
        String[] Aufträge= {"A", "b","c","d","e"};
        auliste = new JList<String>(Aufträge);

        auliste.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(auliste);
        listscreen.setVisible(true);
        listscreen.add(scrollPane);
        getContentPane().add(listscreen);
        setVisible(true);
        pack();
    }

}
