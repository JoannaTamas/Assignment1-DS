import React from "react";
import 'bootstrap/dist/css/bootstrap.css';


const CaregiverOps = ({title1, onListCaregiver,onDeleteCaregiver,onAddCaregiver}) => (
    <div class="col-sm-6 offset-sm-3 text-center">
    <div class="jumbotron jumbotron-fluid">  

   
    <div class="container ">   
    <div class="alert alert-success ">
   
            Login successfully
    </div>
    <div class="btn-group-vertical">
   
        <br />
        <br />
        
        <h2>{ title1 || "Choose Operation" }</h2>
       
        <button type="button" class="btn btn-outline-primary" onClick={onListCaregiver}>Display Caregiver</button>
        <button type="button" class="btn btn-outline-primary" onClick={onDeleteCaregiver}>Delete Caregiver</button>
        <button type="button" class="btn btn-outline-primary" onClick={onAddCaregiver}>Create Caregiver</button>

        <br />
        <br />
        
    </div>
    </div>
    </div>
    </div>
);

export default CaregiverOps;