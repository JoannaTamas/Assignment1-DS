package ro.utcn.ioana.assignment1.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.utcn.ioana.assignment1.model.Doctor;
import ro.utcn.ioana.assignment1.service.DoctorUserDetailsService;

@RestController
@RequiredArgsConstructor
public class DoctorController {
    private final DoctorUserDetailsService service;

    @GetMapping("/me")
    public Doctor readCurrent() {
        return service.loadCurrentUser();


    }
}