import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class PatientRecord<T1, T2> {
    T1 patientID;
    T2 doctor;

    void addRecord(T1 patientID, T2 doctor) {
        this.patientID = patientID;
        this.doctor = doctor;
    }

    void displayRecord() {
        System.out.println("Patient ID: " + patientID);
        System.out.println("Doctor Assigned: " + doctor);
    }
}

public class HospitalSystem {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        PatientRecord<String, String> p1 =
            new PatientRecord<String, String>();

        PatientRecord<String, String> p2 =
            new PatientRecord<String, String>();

        System.out.println("Enter first patient details");

        System.out.print("Patient ID: ");
        String id1 = br.readLine();

        System.out.print("Doctor Name: ");
        String doctor1 = br.readLine();

        p1.addRecord(id1, doctor1);

        System.out.println("\nEnter second patient details");

        System.out.print("Patient ID: ");
        String id2 = br.readLine();

        System.out.print("Doctor Name: ");
        String doctor2 = br.readLine();

        p2.addRecord(id2, doctor2);

        System.out.println("\nPatient Records");

        p1.displayRecord();

        System.out.println();

        p2.displayRecord();
    }
}
