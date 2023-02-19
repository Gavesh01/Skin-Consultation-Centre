import java.io.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.*;



public class WestminsterSkinConsultationManager implements SkinConsultationManager {
    public static ArrayList<Doctor> doctorList = new ArrayList<>();

    private List<Consultation> consultation;

    WestminsterSkinConsultationManagerUserGUI gui = new WestminsterSkinConsultationManagerUserGUI();


    public void menu() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n\n                                                Hello !! Thank you for visiting Westminster Skin Consultation Clinic.\n");
            System.out.println("           CONSOLE MENU");
            System.out.println("               A> Add a new doctor");
            System.out.println("               R> Remove a doctor");
            System.out.println("               P> Print the list of doctors");
            System.out.println("               S> Save in a file");
            System.out.println("               L> Load the file");
            System.out.println("               Q> Quit");

            System.out.print("\n               Please enter your selection:  ");
            char choice = input.next().toUpperCase().charAt(0);
            System.out.println("\n_______________________________________________________");

            switch (choice) {         //calling methods based on user selection
                case ('A'):
                    this.addDoctor();
                    break;

                case ('R'):
                    this.deleteDoctor();
                    break;

                case ('P'):
                    this.printDoctors();
                    break;

                case ('S'):
                    this.saveToFile();
                    break;

                case ('L'):
                   new WestminsterSkinConsultationManagerUserGUI();
                    break;

                case ('Q'): //When the user chooses to exit the program
                    System.out.println("\n\n\n                                                             Exit from the Program!");
                    System.out.println("                                                                   Thank you for joining with us,have a nice day!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Input!! Please choose an option from the menu below.");   //If the user selects the incorrect option
            }
        }

    }

    @Override
    public void addDoctor() {
        Scanner input = new Scanner(System.in);
        LocalDate dateOfBirth;

        if (this.doctorList.size() <10) {
            System.out.println("Enter doctor's details\n\n");


            while (true) {

                System.out.print("First Name: ");
                String name = input.nextLine();
                if (name.equals("") || name.equals(" ")) {
                    System.out.println("The First Name Field Must Be Complete!");
                    String answer = input.nextLine();
                } else {
                    break;}
                }

            while (true){
                System.out.print("Last Name: ");
                String surname = input.nextLine();
                if (surname.equals("") || surname.equals(" ")) {
                    System.out.println("The Last Name Field Must Be Complete!");
                } else {
                    break;
                }
            }


            System.out.println("Enter The Doctor's Date of Birth");
                    while (true) {
                        try{
                            System.out.print("\nEnter The Doctor's Birth Year: ");
                            int year = input.nextInt();

                            System.out.print("Enter The Doctor's Birth Month: ");
                            int month = input.nextInt();

                            System.out.print("Enter The Doctor's Birth Date: ");
                            int date = input.nextInt();

                            dateOfBirth = LocalDate.of(year, month, date);
                            break;
                        } catch (DateTimeException e){
                            System.out.println("\nDate of Birth is Invalid!! Try once more");
                        } catch (InputMismatchException ei){
                            System.out.println();
                            input.next();
                        }
                    }


            while (true){
            System.out.print("\nEnter The Doctor's Mobile Number: ");
            input.nextLine();
            String mobileNumber = input.nextLine();
                if (mobileNumber.equals("") || mobileNumber.equals(" "))  {
                    System.out.println("The Mobile Number Field Must Be Complete!");
                    String answer = input.nextLine();
                } else {
                    break;
                }
            }

            while (true){
            System.out.print("\nEnter The Doctor's Medical Licence Number: ");

            String medicalLicenceNumber = input.nextLine();
                if (medicalLicenceNumber.equals("") || medicalLicenceNumber.equals(" ")) {
                    System.out.println("The Medical Licence Number Field Must Be Complete!");
                    String answer = input.nextLine();
                } else {
                    break;
                }
            }


            while (true){
            System.out.print("\nEnter The Doctor's Specialization: ");
            String specialization = input.nextLine();
                if (specialization.equals("") || specialization.equals(" "))  {
                    System.out.println("The Specialization Field Must Be Complete!");
                    String answer = input.nextLine();
                } else {
                    break;
                }
            }


                    // Doctor doctor = new Doctor(name, surname, dateOfBirth, mobileNumber, medicalLicenceNumber, specialization);
//            doctorList.add(doctor);

        }

            else {
            System.out.println(" SORRY!! The clinic has reached capacity!!  There can only be ten doctors assigned.Please begin by deleting a doctor and replacing it with a new doctor.");
        }

    }

    @Override
    public void deleteDoctor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the doctor's medical license number to be removed: ");
        String licenceNumber = input.nextLine();

        Doctor doctor = null;
        for (Doctor d : this.doctorList) {
            if (d.getMedicalLicenceNumber().equals(licenceNumber)) {
                doctor = d;
                break;
            }
        }

        if (doctor != null) {
            this.doctorList.remove(doctor);
            System.out.println("Details about the doctor who has been removed: " + doctor.toString());
            System.out.println("The current number of doctors at the center: " + this.doctorList.size());
        } else {
            System.out.println("There was no doctor with this license number identified.");
        }
    }

    @Override
    public void printDoctors() {
        System.out.println("\nList of Doctors Organized Alphabetically by Last Name\n");
        Collections.sort(doctorList,new Comparator<Doctor>() {
            public int compare(Doctor d1, Doctor d2) {
                return d1.getSurname().compareToIgnoreCase(d2.getSurname());
            }
        });

        for(int i = 0; i < doctorList.size(); i++) {
            System.out.println("Dr." + doctorList.get(i).getName() + " " + doctorList.get(i).getSurname());
        }
    }

    @Override
    public void saveToFile() {


            try{
                FileOutputStream fileOut = new FileOutputStream("DoctorInfoDocument.txt");       // Creates a FileOutputStream to write objects from ObjectOutputStream
                ObjectOutputStream objOut = new ObjectOutputStream(fileOut);        //Create ObjectOutputStream

                for ( Doctor d : doctorList){
                    objOut.writeObject(d);      //write Doctor objects to the output stream
                }
//            objOut.writeObject(doctorList);
                objOut.close();
                fileOut.close();

                System.out.println("Congratulations!! Your data has been successfully saved to the DoctorInfoDocument.txt file.");

            } catch (IOException e) {
                System.out.println();
                e.printStackTrace();
            }
        }










    @Override
    public void loadFile() {
        try {
            FileInputStream fileIn = new FileInputStream("DoctorInfoDocument.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            for (Doctor d : doctorList) {
                doctorList.add((Doctor) in.readObject());
            }

            System.out.println("Data Has Been Loaded Successfully");
            in.close();
            fileIn.close();
        } catch (FileNotFoundException e) {
            System.out.println("Data Has Not Been Stored Yet");
        } catch (IOException e) {
            System.out.println("Something Went Wrong !");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            }
        }
    }


