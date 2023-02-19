import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class DoctorGUI {

    DoctorGUI() {

        JFrame frame = new JFrame(); // Create a frame
        frame.setTitle("Westminster Skin Consultation Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(1550, 1000);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setLayout(new FlowLayout(FlowLayout.LEADING));


        JPanel Panel3 = new JPanel(null);
        Panel3.setBackground(Color.decode("#17202A"));
        Panel3.setBounds(900, 150, 600, 600);

        JLabel title3 = new JLabel("Doctor Information");
        Panel3.add(title3);
        title3.setBounds(30, 1, 830, 50);
        title3.setForeground(Color.decode("#FDFEFE"));
        title3.setFont(new Font("Belleza", Font.BOLD, 25));

        JTable table = new JTable();
        String[] col = new String[]{"First name", "Surname", "Birthday", "Mobile", "Medical No."};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
        tableModel.setColumnIdentifiers(col);
        table.setModel(tableModel);
        JScrollPane jScrollPane = new JScrollPane(table);
        jScrollPane.setBounds(50, 50, 500, 400);
        Panel3.add(jScrollPane);
        Object[] data = new Object[5];

        for (int i = 0; i < WestminsterSkinConsultationManager.doctorList.size(); ++i) {
            data[0] = ((Doctor) WestminsterSkinConsultationManager.doctorList.get(i)).getName();
            data[1] = ((Doctor) WestminsterSkinConsultationManager.doctorList.get(i)).getSurname();
            data[2] = ((Doctor) WestminsterSkinConsultationManager.doctorList.get(i)).getDateOfBirth();
            data[3] = ((Doctor) WestminsterSkinConsultationManager.doctorList.get(i)).getMobileNumber();
            data[4] = ((Doctor) WestminsterSkinConsultationManager.doctorList.get(i)).getSpecialization();
            data[5] = ((Doctor) WestminsterSkinConsultationManager.doctorList.get(i)).getMedicalLicenceNumber();
            tableModel.addRow(data);

//        label.setBounds(0,0,100,50);
//        label.setFont(new Font(null,Font.PLAIN,24));
//
//        frame.add(label);
//        frame.setSize(1550, 900);        //Set x-dimension and y-dimension
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       //exit out of the application
//        frame.setVisible(true);         //Make the frame visible
//        frame.setLayout(null);
//        frame.setResizable(false);
        }

    }
}

