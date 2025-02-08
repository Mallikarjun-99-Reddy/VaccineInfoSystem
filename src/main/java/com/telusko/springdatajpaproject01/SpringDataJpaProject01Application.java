package com.telusko.springdatajpaproject01;

import com.telusko.springdatajpaproject01.entity.Vaccine;
import com.telusko.springdatajpaproject01.service.ServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringDataJpaProject01Application {

    public static void main(String[] args)
    {
        ApplicationContext container = SpringApplication.run(SpringDataJpaProject01Application.class, args);
        ServiceImpl serv =  container.getBean(ServiceImpl.class);

       Vaccine v1 = new Vaccine();
       v1.setVaccineName("CovidShield");
       v1.setVaccineCompany("CovidShield Company");
       v1.setVaccinePrice(453.2);
       System.out.println(serv.registerVaccine(v1));

       Vaccine v2 = new Vaccine("Covaxin", "Bharat", 5452.2);
       Vaccine v3 = new Vaccine("Polio", "Polio Company", 643.2);
       Vaccine v4 = new Vaccine("Sputnik", "XYZ", 542.2);

       List<Vaccine> list = new ArrayList<Vaccine>();
       list.add(v2);
       list.add(v3);
       list.add(v4);

       serv.registerMultipleVaccine(list).forEach((i)-> System.out.println(i));

       Long noOfVaccines = serv.countVaccines();
       System.out.println("Number of vaccines: " + noOfVaccines);

       Integer id = 3;
       Boolean status = serv.checkExistence(id);
       if(status)
           System.out.println("Vaccine with id " + id + " exists");
       else
           System.out.println("Vaccine with id " + id + " does not exist");

       serv.getAllVaccines().forEach((p)->System.out.println(p));

         List<Integer> idList = new ArrayList<>();
         idList.add(1);
         idList.add(2);
         idList.add(3);

         serv.getAllVaccines(idList).forEach(System.out::println);

       Vaccine vaccine = serv.fetchVaccineById(2);
       System.out.println(vaccine);

        System.out.println(serv.deleteVaccineById(3));


    }

}
