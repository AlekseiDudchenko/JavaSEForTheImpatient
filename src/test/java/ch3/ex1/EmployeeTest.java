package ch3.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void constructor(){
        Employee employee1 = new Employee(1000);
        assertEquals(1000, employee1.getSalary());
        Measurable employee2 = new Employee(20);
        assertEquals(20, employee2.getMeasure());

        Measurable[] employees = new Employee[]{new Employee(100), new Employee(200)};
        assertEquals(100, employees[0].getMeasure());
        assertEquals(200, employees[1].getMeasure());


    }

}