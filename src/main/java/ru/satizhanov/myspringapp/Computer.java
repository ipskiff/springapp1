package ru.satizhanov.myspringapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    public void playMusicFromMusicPlayer() {
        musicPlayer.playMusic(Genre.CLASSICAL);
        musicPlayer.playMusic(Genre.ROCK);
    }

}
