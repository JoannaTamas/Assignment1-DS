package ro.utcn.ioana.assignment1.service;


import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ro.utcn.ioana.assignment1.model.Patient;

@Component
@RequiredArgsConstructor
public class ConsoleController implements CommandLineRunner {
    private final PatientManagementService pms;

    @Override
    public void run(String... args) throws Exception {
        addPatient();

    }

    private void addPatient(){
        int id= 1;
        String name="NEW";
        String birthdate="x.xx.xxxx";
        String gender="F";
        String addr="address";
        String medRecord="medical record";
        Patient patient=  pms.addPatient1(new Patient(2,name,birthdate,gender,addr,medRecord));

      // pms.removePatient(1);
        //pms.listPatientsDTO().forEach(s -> print(s.toString()));

        System.out.println("hello! ");

    }


    private void print(String value) {

        System.out.println(value);
    }
}
