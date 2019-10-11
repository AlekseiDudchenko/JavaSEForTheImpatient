package ch3.ex1ex2;

import java.util.ArrayList;

/**
 * 1. Provide an interface Measurable with a method double getMeasure() that measures
 * an object in some way. Make Employee implement Measurable. Provide
 * a method double average(Measurable[] objects) that computes the average
 * measure. Use it to compute the average salary of an array of employees.
 *//**
 * 2. Continue with the preceding exercise and provide a method Measurable
 * largest(Measurable[] objects). Use it to find the name of the employee with
 * the largest salary. Why do you need a cast?
 */

public interface Measurable{
    double getMeasure();

    static double average(Measurable[] objects){
        if (objects.length != 0) {
            double average = 0;
            for (Measurable object : objects)
                average += object.getMeasure();
            return average / objects.length;
        } else return 0;
    }

    static double average(ArrayList<Measurable> objects){
        if (!objects.isEmpty()) {
            double average = 0;
            for (Measurable object : objects)
                average += object.getMeasure();
            return average/objects.size();
        }
        else return 0;
    }

    static Measurable largest(Measurable[] objects){
        Measurable largestObject = objects[0];
        for (Measurable object : objects) {
                if (object.getMeasure() > largestObject.getMeasure())
                    largestObject = object;
        }
        return largestObject;
    }

    static  Measurable largest(ArrayList<Measurable> objects){
        Measurable largestObject = objects.get(0);
        for (Measurable object: objects) {
            if (object.getMeasure() > largestObject.getMeasure())
                largestObject = object;
        }
        return largestObject;
    }
}

