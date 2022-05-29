package com.quectel.Pojo;

import java.util.Objects;

/**
 * @author luxingbang
 * @date 2022-05-29-16:11
 */
public class Student {

    private String name;

    private Integer age;

    private Double score;

    public Student(String name, Integer age, Double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(getName(), student.getName()) && Objects.equals(getAge(), student.getAge()) && Objects.equals(getScore(), student.getScore());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getScore());
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
