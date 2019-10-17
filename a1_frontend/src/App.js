import React from 'react';
import './App.css';

import { HashRouter, Switch, Route } from "react-router-dom";
import SmartLoginDoctor from './view/SmartLoginDoctor';
import SmartPatientsList from './view/SmartPatientsList';
import SmartPatientOps from './view/SmartPatientOps';
import SmartDoctorOperations from './view/SmartDoctorOperations';






const App = () => (
  <div className="App">
    <HashRouter>
      <Switch>
        <Route exact={true} component={SmartLoginDoctor} path="/" />
        <Route exact={true} component={SmartDoctorOperations} path="/doctor-operations" />
        <Route exact={true} component={SmartPatientsList} path="/patients-list" />
        <Route exact={true} component={SmartPatientOps} path="/patient-ops" />

       
        
      </Switch>
    </HashRouter>
  </div>
);


export default App;