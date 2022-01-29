package ru.satizhanov.myspringapp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> songs = new ArrayList<>();

    {
        songs.add("1RSONG");
        songs.add("2RSONG");
        songs.add("3RSONG");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
