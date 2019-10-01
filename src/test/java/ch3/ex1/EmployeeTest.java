package ch3.ex1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {

    @Test
    void constructorWithoutArguments(){
        Employee firstEmployee = new Employee();
        assertEquals(Employee.number-1, firstEmployee.getId());
        assertEquals(0, firstEmployee.getSalary());

        Employee secondEmployee = new Employee();
        assertEquals(Employee.number-1, secondEmployee.getId());
        assertEquals(0, secondEmployee.getSalary());
    }

    @Test
    void constructorWithSalary(){
        Employee employee1 = new Employee(1000);
        assertEquals(1000, employee1.getSalary());
        Employee employee2 = new Employee(20);
        assertEquals(20, employee2.getSalary());

        Employee[] employees = new Employee[]{new Employee(100), new Employee(200)};
        assertEquals(100, employees[0].getSalary());
        assertEquals(200, employees[1].getSalary());
    }

    @Test
    void getMeasureTest(){
        Employee employee1 = new Employee(1000);
        assertEquals(1000, employee1.getMeasure());

        Measurable employee2 = new Employee(20);
        assertEquals(20, employee2.getMeasure());

        Measurable[] employees = new Employee[]{new Employee(100), new Employee(200)};
        assertEquals(100, employees[0].getMeasure());
        assertEquals(200, employees[1].getMeasure());
    }

    @Test
    void arrayAverageTest(){
        Measurable[] employees = new Employee[]{new Employee(100), new Employee(100), new Employee(100)};
        double average = Measurable.average(employees);
        assertEquals(100, average);

        employees = new Employee[5];
        employees[0] = new Employee(100);
        employees[1] = new Employee(50);
        employees[2] = new Employee(200);
        employees[3] = new Employee(500);
        employees[4] = new Employee(10000);
        assertEquals((100+50+200+500+10000)/5, Measurable.average(employees));
    }

    @Test
    void arrayListAverageTest(){
        ArrayList<Measurable> empl = new ArrayList<>();
        empl.add(new Employee(100));
        empl.add(new Employee(200));
        assertEquals(150, Measurable.average(empl));
    }

    @Test
    void emptyArrayListAverageTest(){
        ArrayList<Measurable> empl = new ArrayList<>();
        assertEquals(0, Measurable.average(empl));
    }

    @Test
    void emptyArrayAverageTest(){
        Measurable[] empl = new Employee[]{};
        assertEquals(0, Measurable.average(empl));
    }

    @Test
    void largestTest(){
        Measurable[] employees = new Employee[5];
        employees[0] = new Employee(100);
        employees[1] = new Employee(50);
        employees[2] = new Employee(200);
        employees[3] = new Employee(500);
        employees[4] = new Employee(10000);

        assertEquals(employees[4], Measurable.largest(employees));
    }

    @Test
    void nameOfEmployeeWithLargestSalary(){
        Employee[] employees = new Employee[5];
        employees[0] = new Employee(100);
        employees[1] = new Employee(50);
        employees[2] = new Employee(200);
        employees[3] = new Employee(500);
        employees[4] = new Employee("Ivan",10000);

        Employee largestEmpl =  (Employee)Measurable.largest(employees);
        assertEquals(employees[4].getName(), largestEmpl.getName());
    }

}