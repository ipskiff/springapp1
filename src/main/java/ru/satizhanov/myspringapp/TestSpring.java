package ru.satizhanov.myspringapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

<<<<<<< HEAD
        TestBean testBean = context.getBean("testBean", TestBean.class);

        System.out.println(testBean.getName());
=======
        Music music = context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();
>>>>>>> 0408e22 (IoC and Manual DI)

        context.close();
    }
}
