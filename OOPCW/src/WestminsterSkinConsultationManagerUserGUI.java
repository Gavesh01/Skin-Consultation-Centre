import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class WestminsterSkinConsultationManagerUserGUI implements ActionListener {
    JFrame frame = new JFrame("Westminster Skin Consultation Center");      //Create a frame and set title
    JLabel heading = new JLabel("Westminster \r\nSkin Consultation Center" );
    JButton button = new JButton();

    WestminsterSkinConsultationManagerUserGUI(){

        button.setBounds(700, 450, 150, 50);
        button.addActionListener(this);
        button.setText("View Doctors");
        button.setFocusable(false);
        button.setFont(new Font("Arial", Font.BOLD, 15));
        button.setForeground(Color.black );
        button.setBackground(Color.decode("#28112B"));
        button.setBorder(BorderFactory.createEmptyBorder());

        heading.setHorizontalTextPosition(JLabel.CENTER);
        heading.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 45));
        heading.setForeground(Color.white);
        heading.setBounds(300, 300, 1000, 100);

        frame.setSize(1550, 900);        //Set x-dimension and y-dimension
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       //exit out of the application
        frame.setVisible(true);         //Make the frame visible
        frame.setLayout(null);
        frame.setResizable(false);      //Make frame cannot be resized by the user
        frame.add(heading);
        frame.add(button);

    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            new DoctorGUI();
            frame.setVisible(true);

        }
    }
}