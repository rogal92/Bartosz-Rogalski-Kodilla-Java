package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SearchFacade {

        @Autowired
        CompanyDao companyDao;

        @Autowired
        EmployeeDao employeeDao;


        public List<Company> searchCompaniesNames(final String passedLetters) {

                return companyDao.retrieveCompaniesNames("%" + passedLetters + "%");
        }

        public List<Employee> searchEmployeesNames(final String passedLetters) {

                return employeeDao.retrieveEmployeesNames( "%" + passedLetters + "%");

        }
}