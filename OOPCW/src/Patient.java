import java.time.LocalDate;

public class Patient extends Person{
    private String patient_id;

    public Patient(String name, String surname, LocalDate dateOfBirth, String mobileNumber, String patient_id) {
        super(name, surname, dateOfBirth, mobileNumber);
        this.patient_id=patient_id;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }
}

