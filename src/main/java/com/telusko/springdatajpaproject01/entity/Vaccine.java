package com.telusko.springdatajpaproject01.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vaccineTable")
public class Vaccine
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String vaccineName;

    private String vaccineCompany;

    private Double vaccinePrice;

    public Vaccine() {
        System.out.println("Vaccine constructor");
    }
    public Vaccine( String vaccineName, String vaccineCompany, Double vaccinePrice)
    {
        this.vaccineName = vaccineName;
        this.vaccineCompany = vaccineCompany;
        this.vaccinePrice = vaccinePrice;
    }

    public void setVaccineName(String vaccineName)
    {
        this.vaccineName = vaccineName;
    }
    public void setVaccineCompany(String vaccineCompany)
    {
        this.vaccineCompany = vaccineCompany;
    }
    public void setVaccinePrice(Double vaccinePrice)
    {
        this.vaccinePrice = vaccinePrice;
    }

    public Integer getId()
    {
        return id;
    }
    public String getVaccineName()
    {
        return vaccineName;
    }
    public String getVaccineCompany()
    {
        return vaccineCompany;
    }
    public Double getVaccinePrice()
    {
        return vaccinePrice;
    }

    public String toString()
    {
        return "Vaccine [ id : " + id + " VaccineName : "+vaccineName + " vaccineCompany : "+ vaccineCompany + " vaccinePrice : "+ vaccinePrice + " ]";
    }


}
