import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login implements ActionListener {
    JFrame frame = new JFrame();
    JButton mbutton = new JButton("Mitarbeiter");
    JButton abutton = new JButton("Aufträge");


    Login(){
        //MitarbeiterButton
        mbutton.setBounds(50, 125, 100, 50);
        mbutton.setFocusable(false);
        mbutton.addActionListener(this);
        //AufträgeButton
        abutton.setBounds(250, 125, 100, 50);
        abutton.setFocusable(false);
        abutton.addActionListener(this);



        //Frame
        frame.setTitle("Menü");
        frame.add(mbutton);
        frame.add(abutton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mbutton) {
            frame.dispose();
            Mitarbeiter Mitarbeiter = new Mitarbeiter();
        }
        else if(e.getSource()==abutton){
            frame.dispose();
            Aufträge Aufträge = new Aufträge();

            // TODO : open Aufträge
            }

    }
}
