import javax.swing.*;
import java.awt.*;

public class Mitarbeiter extends JFrame {

    private JPanel listscreen = new JPanel();

    private JList<String> maliste;


    Mitarbeiter(){
        listscreen.setLayout(new BorderLayout());
        Employee MitarbeiterListe = new Employee();
        maliste = new JList<String>(Employee);

        maliste.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(maliste);
        listscreen.setVisible(true);
        listscreen.add(scrollPane);
        getContentPane().add(listscreen);
        setVisible(true);
        pack();
    }

}
