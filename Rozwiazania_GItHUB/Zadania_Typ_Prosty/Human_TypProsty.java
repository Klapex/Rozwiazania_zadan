package pl.samouczek.zbior_zadan;

public class Human_TypProsty {

    public Integer age;
    Double weight;
    Integer height;
    String sex;
    String name;

    public Human_TypProsty(Integer age, Double weight, Integer height, String sex, String name) {
        this.age = new Integer(age);
        this.weight = new Double(weight);
        this.height = new Integer(height);
        this.sex = sex;
        this.name = name;
       }

    public Integer getAge() {
        return age;
    }
    public Integer getHeight(){
        return height;
    }

    public Double getWeight() {
        return weight;
    }

    public String getName(){
        return name;
    }

    public boolean isMale(){
        String male = sex;
        return male == "male";
    }
    }





