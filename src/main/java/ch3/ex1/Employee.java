package ch3.ex1;

/**
 * Provide an interface Measurable with a method double getMeasure() that measures
 * an object in some way. Make Employee implement Measurable. Provide
 * a method double average(Measurable[] objects) that computes the average
 * measure. Use it to compute the average salary of an array of employees.
 *
 * Continue with the preceding exercise and provide a method Measurable
 * largest(Measurable[] objects). Use it to find the name of the employee with
 * the largest salary. Why do you need a cast?
 */

public class Employee implements Measurable{

    private double salary;
    private int id;
    private String name;
    static int number;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

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

    Employee(String name){
        this();
        this.name = name;
    }

    Employee(String name, double salary){
        this(name);
        this.salary = salary;
    }

    /**
     * @return employee's salary
     */
    @Override
    public double getMeasure() { return getSalary(); }


}
