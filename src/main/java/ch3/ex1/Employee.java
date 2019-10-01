package ch3.ex1;

/**
 * Provide an interface Measurable with a method double getMeasure() that measures
 * an object in some way. Make Employee implement Measurable. Provide
 * a method double average(Measurable[] objects) that computes the average
 * measure. Use it to compute the average salary of an array of employees.
 */

public class Employee implements Measurable{

    private double salary;
    private int id;
    static int number;

    private void setId(){
        id = number;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    Employee(){
        setId();
        number +=1;
    }

    Employee(double salary){
        this();
        this.salary = salary;
    }

    /**
     * @return employee's salary
     */
    @Override
    public double getMeasure() { return getSalary(); }

}
