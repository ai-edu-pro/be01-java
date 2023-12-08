package quiz.IO.bmiFour;

import java.io.Serializable;

/**
 * BMI = (체중) / (신장)^2)
 * 저체중 : 18.5 미만
 * 정상 : 18.5이상 ~ 23미만
 * 비만전 : 23이상 ~ 25미만
 * 1단계 : 25이상 ~ 30미만
 * 2단계 : 30이상 ~ 35미만
 * 3단계 : 35이상
 */
public class Bmi implements Serializable {  // Model 

    private String name;
    private double height;
    private double weight;
    private boolean gender;     // true : 남 / false : 여
    private double bmi;
    private String status;      // 비만여부

    public Bmi () {

    }
    public Bmi(String name, double height, double weight, boolean gender, double bmi, String status) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.bmi = bmi;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return  "이름 : " + name + "\n" +
                "신장 : " + height + "cm\n" +
                "체중 : " + weight + "kg\n" +
                "성별 : " + (gender ? "남" : "여") + "\n" +
                "BMI : " + bmi + "\n" +
                "결과 : " + status + "\n";
    }
}
