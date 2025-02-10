import java.util.ArrayList;
import java.util.List;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }
}

class InPatient extends Patient {
    private double dailyRate;
    private int daysAdmitted;

    public InPatient(String patientId, String name, int age, double dailyRate, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        return dailyRate * daysAdmitted;
    }
}

class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }
}

interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

class PatientRecord implements MedicalRecord {
    private List<String> records;

    public PatientRecord() {
        records = new ArrayList<>();
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public List<String> viewRecords() {
        return records;
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        InPatient inPatient = new InPatient("IP001", "Alice", 30, 200.0, 5);
        OutPatient outPatient = new OutPatient("OP002", "Bob", 40, 150.0);
        
        patients.add(inPatient);
        patients.add(outPatient);

        PatientRecord patientRecord = new PatientRecord();
        patientRecord.addRecord("Diagnosis: Flu");
        patientRecord.addRecord("Treatment: Rest and hydration");

        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Total Bill: " + patient.calculateBill());
            System.out.println();
        }

        System.out.println("Medical Records:");
        for (String record : patientRecord.viewRecords()) {
            System.out.println(record);
        }
    }
}