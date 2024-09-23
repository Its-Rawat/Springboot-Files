package com.rawat.orm.projectorm.entities;

import jakarta.persistence.*;

@Entity // Making User class a Entity Class
@Table(name="USER") // table Name, if not given then Entity Class name will become table Name.
public class User {
    // This is a Primary Key
    @Id
    @Column(name="USER_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="USER_NAME",length = 100)
    private String name;
    @Column(name="USER_CITY",length = 30)
    private String city;
    @Column(name="USER_AGE",length = 20)
    private int age;

    public User(int id, String name, String city, int age) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }
}
