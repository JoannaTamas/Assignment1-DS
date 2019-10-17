package ro.utcn.ioana.assignment1.dto;


import lombok.Data;
import org.springframework.util.CollectionUtils;
import ro.utcn.ioana.assignment1.model.Patient;


import java.util.List;
import java.util.stream.Collectors;

@Data
public class PatientDTO {
    private Integer id;
    private String name;
    private String birthdate;
    private String gender;
    private String address;
    private String medicalRecord;

    public static PatientDTO ofEntity(Patient patient){
        PatientDTO patientDTO=new PatientDTO();
        patientDTO.setId(patient.getID());
        patientDTO.setName(patient.getName());
        patientDTO.setBirthdate(patient.getBirthdate());
        patientDTO.setGender(patient.getGender());
        patientDTO.setAddress(patient.getAddress());
        patientDTO.setMedicalRecord(patient.getMedicalRecord());

        return patientDTO;

    }

}


