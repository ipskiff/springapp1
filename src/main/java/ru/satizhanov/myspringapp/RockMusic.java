package ru.satizhanov.myspringapp;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Some rock music";
    }
}
