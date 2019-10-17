package ro.utcn.ioana.assignment1.Controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;

import org.springframework.web.bind.annotation.*;
import ro.utcn.ioana.assignment1.dto.PatientDTO;
import ro.utcn.ioana.assignment1.model.Patient;
import ro.utcn.ioana.assignment1.service.PatientManagementService;


import java.util.List;


@Slf4j
@RestController
@RequiredArgsConstructor
public class Controller {
    // private final Scanner scanner = new Scanner(System.in);
    private final PatientManagementService pms;
   // private final SimpMessagingTemplate messagingTemplate;


    @GetMapping("/patients")
    public List<PatientDTO> readAll() {

        return pms.listPatientsDTO();
    }
/*
    @DeleteMapping("/appointments/{id}")
    public void remove(@PathVariable int id) {
        ams.removeAppointment(id);
    }

    @PostMapping("/appointments")
    public AppointmentDTO create(@RequestBody AppointmentDTO dto) {
        return ams.addAppointmentDTO(dto);
    }

    @EventListener(BaseEvent.class)
    public void handleEvent(BaseEvent event) {
        log.info("Got an event: {}.", event);
        messagingTemplate.convertAndSend("/topic/events", event);

    }
*/

}