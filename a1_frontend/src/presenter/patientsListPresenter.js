import modelPatient from "../model/modelPatient";

class PatientsListPresenter{
    onCreatePatient(){

    }

    onInit(){
        modelPatient.newPatientList();
    }
}

const patientsListPresenter=new PatientsListPresenter();
export default patientsListPresenter;