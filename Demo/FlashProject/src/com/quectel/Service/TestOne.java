package com.quectel.Service;

import com.quectel.Pojo.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luxingbang
 * @date 2022-05-29-16:12
 */
public class TestOne {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("硝化",25,89.6));
        studentList.add(new Student("小明",18,109.6));
        studentList.add(new Student("小李",17,26.6));
        studentList.add(new Student("萨福克两千",21,55.6));
        studentList.stream().filter(s -> s.getScore()>=80).forEach(s -> System.out.println(s));
        //sum提交至主分区
    }
}
