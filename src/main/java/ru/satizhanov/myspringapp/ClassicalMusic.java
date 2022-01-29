package ru.satizhanov.myspringapp;

public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Some classical music";
    }
}
