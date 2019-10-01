package ch3.ex1;

import java.util.ArrayList;

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
}

