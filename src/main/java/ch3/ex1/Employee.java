package ch3.ex1;

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

    @Override
    public double getMeasure() {
        return this.salary;
    }

    //todo рассчитать среднюю зарплату в массиве работников эти иетоом
    public double average(Measurable[] objects){
        return 0;
    }



}
