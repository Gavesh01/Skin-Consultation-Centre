import java.time.LocalDate;

public class Person {
    private String name;
    private String surname;
    private String mobileNumber;
    private LocalDate dateOfBirth;

    public Person (String name, String surname, LocalDate dateOfBirth, String mobileNumber){
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.mobileNumber = mobileNumber;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }



    public String toString(){
        return "Name: " + name + surname +
                "Mobile Number: " + mobileNumber +
                "Date Of Birth: " + dateOfBirth;
    }

}
