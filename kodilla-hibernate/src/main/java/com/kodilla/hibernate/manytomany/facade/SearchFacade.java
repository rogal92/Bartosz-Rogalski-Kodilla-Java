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


        public List<Company> searchCompaniesByNames(final String passedLetters) {

                return companyDao.retrieveCompaniesByNames("%" + passedLetters + "%");
        }

        public List<Employee> searchEmployeesByNames(final String passedLetters) {

                return employeeDao.retrieveEmployeesByNames( "%" + passedLetters + "%");
        }
}