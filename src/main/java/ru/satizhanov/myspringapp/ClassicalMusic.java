package ru.satizhanov.myspringapp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.ArrayList;
import java.util.List;

//@Component
//@Scope("prototype")
public class ClassicalMusic implements Music{

    @PostConstruct
    public void doMyInit() {
        System.out.println("Init");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Destroy");
    }

    @Override
    public String getSong() {
        return "Some classical music";
    }
}
