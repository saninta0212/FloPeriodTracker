package model;



public class Person extends MoodRelievers {

    private String name;
    private int age;
    private int weight;
    private int heartRate;
    private int bodyTemperature;
    private String feelings;



    public Person(String name, int age, int weight, int heartRate,
                int bodyTemperature, String feelings) {
        super("");
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.heartRate = heartRate;
        this.bodyTemperature = bodyTemperature;
        this.feelings = feelings;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getBodytemperature() {
        return bodyTemperature;

    }

    public int getHeartrate() {
        return heartRate;
    }

    public String getFeelings() {
        return feelings;
    }


    @Override
    public boolean predictOvulate() {
        return getBodytemperature() > 37 && getBodytemperature() < 39;
    }
}


