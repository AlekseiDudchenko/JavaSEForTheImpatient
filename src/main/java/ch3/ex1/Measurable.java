package ch3.ex1;

public interface Measurable{
    double getMeasure();

    static double average(Measurable[] objects){
        double average = 0;
        for (Measurable object : objects) { average += object.getMeasure(); }
        return average/objects.length;
    }
}

