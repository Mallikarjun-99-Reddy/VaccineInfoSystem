package com.telusko.springdatajpaproject01.service;

import com.telusko.springdatajpaproject01.entity.Vaccine;

public interface IVaccineService
{
    public String registerVaccine(Vaccine vaccine);
    public Iterable<Vaccine> registerMultipleVaccine(Iterable<Vaccine> vaccines);
    public Long countVaccines();
    public Boolean checkExistence(Integer id);
    public Iterable<Vaccine> getAllVaccines();
    public Iterable<Vaccine> getAllVaccines(Iterable<Integer> vaccines);
    public Vaccine fetchVaccineById(Integer id);
    public String deleteVaccineById(Integer id);
}
