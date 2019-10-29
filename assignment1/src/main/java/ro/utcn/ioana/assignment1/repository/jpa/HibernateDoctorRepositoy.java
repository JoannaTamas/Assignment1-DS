package ro.utcn.ioana.assignment1.repository.jpa;

import lombok.RequiredArgsConstructor;
import ro.utcn.ioana.assignment1.model.Doctor;
import ro.utcn.ioana.assignment1.repository.api.DoctorRepository;

import javax.persistence.EntityManager;
import java.util.Optional;

@RequiredArgsConstructor
public class HibernateDoctorRepositoy implements DoctorRepository {
    private final EntityManager entityManager;

    @Override
    public Optional<Doctor> findById(int id) {
        return Optional.ofNullable(entityManager.find(Doctor.class, id));
    }
}
