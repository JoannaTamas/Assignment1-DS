package ro.utcn.ioana.assignment1.dto;

import lombok.Data;
import ro.utcn.ioana.assignment1.model.Medication;

@Data
public class MedicationDTO {
    private Integer id;
    private String name;
    private String sideEffects;
    private Double dosage;

    public static MedicationDTO ofEntity(Medication medication){
        MedicationDTO medicationDTO=new MedicationDTO();
        medicationDTO.setId(medication.getID());
        medicationDTO.setName(medication.getName());
        medicationDTO.setSideEffects(medication.getSideEffect());
        medicationDTO.setDosage(medication.getDosage());

        return medicationDTO;

    }
}
