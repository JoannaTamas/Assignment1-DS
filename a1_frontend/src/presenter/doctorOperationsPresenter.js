class DoctorOperationsPresenter{

    onAddPatient(){
        window.location.assign("#/create-patient");
    }

    onListPatients(){
        window.location.assign("#/patients-list");
    }
    onPatientOps(){
        window.location.assign("#/patient-ops");
    }
    
}

const doctorOperationsPresenter=new DoctorOperationsPresenter();
export default doctorOperationsPresenter;