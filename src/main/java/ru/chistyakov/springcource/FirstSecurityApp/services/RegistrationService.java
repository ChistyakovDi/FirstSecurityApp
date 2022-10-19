package ru.chistyakov.springcource.FirstSecurityApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.chistyakov.springcource.FirstSecurityApp.models.Person;
import ru.chistyakov.springcource.FirstSecurityApp.repositories.PeopleRepository;

@Service
public class RegistrationService {

    public final PeopleRepository peopleRepository;

    @Autowired
    public RegistrationService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Transactional
    public void register(Person person) {
        peopleRepository.save(person);
    }
}
