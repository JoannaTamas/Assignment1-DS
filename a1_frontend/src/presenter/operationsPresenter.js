class OperationsPresenter{

    
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

const operationsPresenter=new OperationsPresenter();
export default operationsPresenter;