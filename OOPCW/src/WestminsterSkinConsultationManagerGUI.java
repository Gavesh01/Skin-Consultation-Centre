//import javax.naming.Name;
//import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
//import java.awt.*;
//
//
//public class WestminsterSkinConsultationManagerGUI {
//    public void GUI(){
//        JFrame frame = new JFrame(); // Create a frame
//        frame.setTitle("Westminster Skin Consultation Manager");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(true);
//        frame.setSize(1550,1000);
//        frame.setLayout(new BorderLayout());
//        frame.setVisible(true);
//        frame.setLayout(null);
////        frame.setLayout(new FlowLayout(FlowLayout.LEADING));
//
//        JPanel Panel1 = new JPanel(null);
//        Panel1.setBackground(Color.decode("#17202A"));
//        Panel1.setBounds(90, 20, 1340, 50);
//
//        JLabel title1 = new JLabel("Welcome to Westminster Skin Consultation Center!");
//        Panel1.add(title1);
//        title1.setBounds(340,1,830,50);
//        title1.setForeground(Color.decode("#FDFEFE"));
//        title1.setFont(new Font("Belleza", Font.BOLD, 30));
//
//        JPanel Panel2 = new JPanel(null);
//        Panel2.setBackground(Color.decode("#17202A"));
//        Panel2.setBounds(20, 150, 600, 600);
//
//        JLabel title2 = new JLabel("Enter Patient Information");
//        Panel2.add(title2);
//        title2.setBounds(30,1,830,50);
//        title2.setForeground(Color.decode("#FDFEFE"));
//        title2.setFont(new Font("Belleza", Font.BOLD, 25));
//
//
//        JPanel Panel3 = new JPanel(null);
//        Panel3.setBackground(Color.decode("#17202A"));
//        Panel3.setBounds(900, 150, 600, 600);
//
//        JLabel title3 = new JLabel("Doctor Information");
//        Panel3.add(title3);
//        title3.setBounds(30,1,830,50);
//        title3.setForeground(Color.decode("#FDFEFE"));
//        title3.setFont(new Font("Belleza", Font.BOLD, 25));
//
//
//
//        JLabel patientName = new JLabel("Enter Name:");
//        Panel2.add(patientName);
//        patientName.setForeground(Color.decode("#FDFEFE"));
//        patientName.setBounds(40, 50, 300, 50);
//        patientName.setFont(new Font("Arial", Font.PLAIN, 15));
//
//        JLabel patientSurname = new JLabel("Enter Sure Name:");
//        Panel2.add(patientSurname);
//        patientSurname.setForeground(Color.decode("#FDFEFE"));
//        patientSurname.setBounds(40, 100, 300, 50);
//        patientSurname.setFont(new Font("Arial", Font.PLAIN, 15));
//
//        JLabel patientDOB = new JLabel("Enter Date of Birth:");
//        Panel2.add(patientDOB);
//        patientDOB.setForeground(Color.decode("#FDFEFE"));
//        patientDOB.setBounds(40, 150, 300, 50);
//        patientDOB.setFont(new Font("Arial", Font.PLAIN, 15));
//
//        JLabel patientMobile = new JLabel("Enter Mobile No:");
//        Panel2.add(patientMobile);
//        patientMobile.setForeground(Color.decode("#FDFEFE"));
//        patientMobile.setBounds(40, 200, 300, 50);
//        patientMobile.setFont(new Font("Arial", Font.PLAIN, 15));
//
//        JLabel patientID = new JLabel("Patient ID:");
//        Panel2.add(patientID);
//        patientID.setForeground(Color.decode("#FDFEFE"));
//        patientID.setBounds(40, 250, 300, 50);
//        patientID.setFont(new Font("Arial", Font.PLAIN, 15));
//
//        JLabel patientNotes = new JLabel("Enter Notes:");
//        Panel2.add(patientNotes);
//        patientNotes.setForeground(Color.decode("#FDFEFE"));
//        patientNotes.setBounds(40, 300, 300, 50);
//        patientNotes.setFont(new Font("Arial", Font.PLAIN, 15));
//
//        JLabel DoctorID = new JLabel("Doctor ID:");
//        Panel2.add(DoctorID);
//        DoctorID.setForeground(Color.decode("#FDFEFE"));
//        DoctorID.setBounds(40, 350, 300, 50);
//        DoctorID.setFont(new Font("Arial", Font.PLAIN, 15));
//
//
//
//        JLabel consultHours = new JLabel("Consultation hours");
//        Panel2.add(consultHours);
//        consultHours.setForeground(Color.decode("#FDFEFE"));
//        consultHours.setBounds(40, 400, 300, 50);
//        consultHours.setFont(new Font("Arial", Font.PLAIN, 15));
//
//        JLabel date = new JLabel("Date Of Consultation");
//        Panel2.add(date);
//        date.setForeground(Color.decode("#FDFEFE"));
//        date.setBounds(40, 450, 300, 50);
//        date.setFont(new Font("Arial", Font.PLAIN, 15));
//
//        JLabel time1 = new JLabel("Time Of Consultation");
//        Panel2.add(time1);
//        time1.setForeground(Color.decode("#FDFEFE"));
//        time1.setBounds(40, 500, 300, 50);
//        time1.setFont(new Font("Arial", Font.PLAIN, 15));
//
//        JLabel cost = new JLabel("Cost");
//        Panel2.add(cost);
//        cost.setForeground(Color.decode("#FDFEFE"));
//        cost.setBounds(40, 550, 200, 50);
//        cost.setFont(new Font("Arial", Font.PLAIN, 15));



//        Panel2.add(patientName);
//        cost.setForeground(Color.decode("#FDFEFE"));
//        patientName.setBounds(50, 40, 100, 30);
//
//        frame.add(Panel1);
//        frame.add(Panel2);
//        frame.add(Panel3);



//        Panel2.add(patientSurname);
//        patientSurname.setBounds(300, 90, 300, 30);
//
//
//        Panel2.add(patientDOB);
//        patientMobile.setBounds(300, 140, 300, 30);
//
//
//        Panel2.add(patientMobile);
//        patientMobile.setBounds(300, 190, 300, 30);
//
//
//        Panel2.add(patientID);
//        patientID.setBounds(300, 240, 300, 30);
//
//
//        Panel2.add(patientNotes);
//        patientNotes.setBounds(300, 290, 300, 30);
//
//
//        Panel2.add(date);
//        date.setBounds(300, 490, 300, 30);
//
//        Panel2.add(time1);
//        time1.setBounds(300, 540, 300, 30);
//
//
//        Panel2.add(submit);
//        submit.setFont(new Font("Arial", Font.PLAIN, 15));
//        submit.addActionListener(this::actionPerformed);
//
//
//        Panel2.add(view);
//        view.setBounds(220, 660, 280, 40);
//        view.setFont(new Font("Arial", Font.PLAIN, 15));
//        view.addActionListener(this::actionPerformed);  submit.setBounds(40, 660, 160, 40);
//



//        JTable table = new JTable();
//        String[] col = new String[]{"First name", "Surname", "Birthday", "Mobile", "Medical No."};
//        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
//        tableModel.setColumnIdentifiers(col);
//        table.setModel(tableModel);
//        JScrollPane jScrollPane = new JScrollPane(table);
//        jScrollPane.setBounds(50, 50, 500, 400);
//        Panel3.add(jScrollPane);
//        Object[] data = new Object[5];
//
//        for (int i = 0; i < WestminsterSkinConsultationManager.doctorList.size(); ++i) {
//            data[0] = ((Doctor) WestminsterSkinConsultationManager.doctorList.get(i)).getName();
//            data[1] = ((Doctor) WestminsterSkinConsultationManager.doctorList.get(i)).getSurname();
//            data[2] = ((Doctor) WestminsterSkinConsultationManager.doctorList.get(i)).getDateOfBirth();
//            data[3] = ((Doctor) WestminsterSkinConsultationManager.doctorList.get(i)).getMobileNumber();
//            data[4] = ((Doctor) WestminsterSkinConsultationManager.doctorList.get(i)).getSpecialization();
//            data[5] = ((Doctor) WestminsterSkinConsultationManager.doctorList.get(i)).getMedicalLicenceNumber();
//            tableModel.addRow(data);
//        }
//
//
//
//
//    }
//}

