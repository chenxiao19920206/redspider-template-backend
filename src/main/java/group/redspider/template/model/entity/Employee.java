package group.redspider.template.model.entity;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Employee {

    public Employee(String name ,int age){
        this.name=name;
        this.age=age;
    }
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name", nullable = true)
    private String name;

    @Column(name = "age", nullable = true)
    private int age;
}
