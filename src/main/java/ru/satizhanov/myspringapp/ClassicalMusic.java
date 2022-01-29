package ru.satizhanov.myspringapp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.ArrayList;
import java.util.List;

@Component
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
    private List<String> songs = new ArrayList<>();

    {
        songs.add("1CSONG");
        songs.add("2CSONG");
        songs.add("3CSONG");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
