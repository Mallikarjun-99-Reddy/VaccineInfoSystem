package com.telusko.springdatajpaproject01.service;

import com.telusko.springdatajpaproject01.entity.Vaccine;
import com.telusko.springdatajpaproject01.repo.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceImpl implements IVaccineService
{

    @Autowired
    private IVaccineRepo repo;

    @Override
    public String registerVaccine(Vaccine vaccine) {
        Vaccine vac = repo.save(vaccine);
        return "Registered vaccine : " + vac.getVaccineName();
    }

    @Override
    public Iterable<Vaccine> registerMultipleVaccine(Iterable<Vaccine> vaccines) {
        return repo.saveAll(vaccines);
    }

    @Override
    public Long countVaccines() {
        return repo.count();
    }

    @Override
    public Boolean checkExistence(Integer id) {
        return repo.existsById(id);
    }

    @Override
    public Iterable<Vaccine> getAllVaccines() {
        return repo.findAll();
    }

    @Override
    public Iterable<Vaccine> getAllVaccines(Iterable<Integer> vaccines) {
        return repo.findAllById(vaccines);
    }

    @Override
    public Vaccine fetchVaccineById(Integer id) {
        Optional<Vaccine> optional = repo.findById(id);
        if(optional.isPresent())
        {
            return optional.get();
        }
        return new Vaccine();
    }

    @Override
    public String deleteVaccineById(Integer id) {
        Optional<Vaccine> vc =  repo.findById(id);
        if(vc.isPresent())
        {
            repo.deleteById(id);
            return "Vaccine with id : " + id + " deleted successfully";
        }
        return "Vaccine with id: " + id + " is not found";
    }
}
