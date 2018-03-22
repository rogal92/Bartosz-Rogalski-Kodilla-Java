package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopServiceTestSuite {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    CompanyDao companyDao;

    @Autowired
    SearchFacade searchFacade;

    @Test
    public void testFindEmployeesBySequence() {
        //Given
        Employee employee = new Employee("Marcin", "Nowak");
        employeeDao.save(employee);

        //When
        List<Employee> result = searchFacade.searchEmployeesByNames("owa");
        //Then
        Assert.assertEquals(1, result.size());
        //CleanUp
        employeeDao.delete(employee.getId());
    }

    @Test
    public void testFindCompaniesBySequence() {
        //Given
        Company company = new Company("Burton");
        companyDao.save(company);

        //When
        List<Company> result = searchFacade.searchCompaniesByNames("urt");

        //Then
        Assert.assertEquals(1, result.size());

        //CleanUp
        companyDao.delete(company.getId());
    }
}