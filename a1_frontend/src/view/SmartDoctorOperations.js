import DoctorOperations from "./DoctorOperations";
import operationsPresenter from "../presenter/operationsPresenter";
import React, { Component } from "react";


export default class SmartDoctorOperations extends Component {
  

    render() {
        return (
            <DoctorOperations
                 onListPatients  ={operationsPresenter.onListPatients}
                 onPatientOps= {operationsPresenter.onPatientOps }

                
                
                 />
        );
    }
}