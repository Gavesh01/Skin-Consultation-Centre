import java.time.LocalDate;

public class Doctor extends Person {
    private String medicalLicenceNumber;
    private String specialization;

    public Doctor(String name, String surname, LocalDate dateOfBirth, String mobileNumber, String medicalLicenceNumber, String specialization){
        super(name, surname, dateOfBirth, mobileNumber);
        this.medicalLicenceNumber = medicalLicenceNumber;
        this.specialization = specialization;
    }

    public String getMedicalLicenceNumber() {
        return medicalLicenceNumber;
    }

    public void setMedicalLicenceNumber(String medicalLicenceNumber) {
        this.medicalLicenceNumber = medicalLicenceNumber;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String toString(){
        return super.toString() +
                "Medical Licence Number: " + medicalLicenceNumber +
                "Specialization: " + specialization;
    }

}

