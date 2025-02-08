package com.telusko.springdatajpaproject01.repo;

import com.telusko.springdatajpaproject01.entity.Vaccine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVaccineRepo extends CrudRepository<Vaccine, Integer>
{

}
