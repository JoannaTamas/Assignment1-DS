import {EventEmitter} from "events";


class Model extends EventEmitter{
    constructor(){
        super();
        this.state={
            patients: [{
                name: "name1",
                birth_date:"2019-02-09",
                gender:"F",
                addr:"addr1",
                medical_record:"med record1"
            },{
                name: "name2",
                birth_date:"2018-02-09",
                gender:"F",
                addr:"addr2",
                medical_record:"med record2"
            }],
            newPatient:{
                name: "",
                birth_date:"",
                gender:"",
                addr:"",
                medical_record:""
            },

        };
    }
    changeSelectedPatientsIndex(index) {
        this.state = {
            ...this.state,
            selectedPatientIndex: index
        };
        this.emit("change", this.state);
    }

    
 




changeNewPatientProperty(property,value) {
    this.state = {
        ...this.state,
        newPatient: {
            ...this.state.newPatient,
            [property]: value
        }
    };
    this.emit("change", this.state);
}


newPatientList(patients){
    this.state = {
        ...this.state,
        patients:patients
    };
    this.emit("change", this.state);

}


}


const modelPatient = new Model();



export default modelPatient;