package mongodb;

import java.util.HashMap;

/*
Create by jiangyun on 2018/1/15
*/
public class Bean extends MongoBean {
    private int age;
    private double salary;
    private String name;
    private HashMap<String, Object> hashMap;

    public Bean() {
    }

    public Bean(int age, double salary, String name, HashMap<String, Object> hashMap) {
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.hashMap = hashMap;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Object> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<String, Object> hashMap) {
        this.hashMap = hashMap;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", hashMap=" + hashMap +
                '}';
    }
}
