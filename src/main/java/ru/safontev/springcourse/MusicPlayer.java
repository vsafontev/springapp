package ru.safontev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    //    private List<Music> musicList = new ArrayList<>();
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private Music music;
    private String name;
    private int volume;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }



    /*public MusicPlayer(Music music) {
        this.music = music;
    }


    public void setMusic(Music music) {
        this.music = music;
    }*/

   /* public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public String playMusic() {
        return "Playing: " + classicalMusic.getSong();
//        for (Music music: musicList){
//        System.out.println("Playing: " + classicalMusic.getSong());
//        System.out.println("Playing: " + rockMusic.getSong());
//        }

    }
}
