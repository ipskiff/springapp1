package ru.satizhanov.myspringapp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
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
