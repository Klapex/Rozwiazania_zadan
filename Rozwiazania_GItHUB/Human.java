package pl.samouczek.zbior_zadan;

public class Human {

    public int age;
    int weight;
    int height;
    String sex;
    String name;

    public Human(int age, int weight, int height, String sex, String name) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.sex = sex;
        this.name = name;

    }

    public int getAge() {
        return age;
    }
    public int getHeight(){
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getName(){
        return name;
    }

    public boolean isMale(){

        return sex.equals("male");
    }
    }





