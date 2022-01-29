package ru.satizhanov.myspringapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);

        System.out.println(classicalMusic.getSong());

        //Music music = context.getBean("musicBean", Music.class);

        //MusicPlayer musicPlayer = new MusicPlayer(music);

        /*MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        firstMusicPlayer.playMusic();
        secondMusicPlayer.playMusic();

        boolean comparison = firstMusicPlayer == secondMusicPlayer;

        System.out.println(comparison);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        firstMusicPlayer.setVolume(10);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());*/

        context.close();
    }
}
