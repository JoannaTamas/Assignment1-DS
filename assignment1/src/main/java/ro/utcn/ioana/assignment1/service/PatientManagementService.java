package ro.utcn.ioana.assignment1.service;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import ro.utcn.ioana.assignment1.dto.PatientDTO;
import ro.utcn.ioana.assignment1.exceptionController.PatientNotFoundException;
import ro.utcn.ioana.assignment1.model.Patient;
import ro.utcn.ioana.assignment1.repository.api.PatientRepository;
import ro.utcn.ioana.assignment1.repository.api.RepositoryFactory;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PatientManagementService {
    private final RepositoryFactory repositoryFactory;
    private final PatientRepository patientRepository;
    private final ApplicationEventPublisher eventPublisher;

    @Transactional
    public List<PatientDTO> listPatientsDTO(){
        return repositoryFactory.createPatientRepository().findAll().stream()
                .map(PatientDTO::ofEntity)
                .collect(Collectors.toList());
    }

    @Transactional
    public PatientDTO addPatientDTO(PatientDTO dto){
        Patient patient=new Patient();
        patient.setID(dto.getId());
        patient.setName(dto.getName());
        patient.setAddress(dto.getAddress());
        patient.setBirthdate(dto.getBirthdate());
        patient.setGender(dto.getGender());

        PatientDTO output=PatientDTO.ofEntity(repositoryFactory.createPatientRepository().save(patient));
      //  eventPublisher.publishEvent(new PatientCreatedEvent(output));
    return output;

    }


     @Transactional
    public void removePatient(int id) {
        PatientRepository repository = repositoryFactory.createPatientRepository();
        Patient patient = repository.findById(id).orElseThrow(PatientNotFoundException::new);
        repository.remove(patient);

    }

     /*
    public Integer updatePatient(PatientDTO patientDTO){
        Optional<Patient> patient=patientRepository.findById(patientDTO.getId());
        if(!patient.isPresent()){

              throw new ResourceNotFoundException("Person", "user id", personDTO.getId().toString());
        }
        PersonFieldValidator.validateInsertOrUpdate(personDTO);

        return personRepository.save(PersonBuilder.generateEntityFromDTO(personDTO)).getId();

        }
    }
 */



    //pentru testat db in consola
    @Transactional
    public Patient addPatient1(Patient patient) {

        return repositoryFactory.createPatientRepository().save(patient);
    }







}
