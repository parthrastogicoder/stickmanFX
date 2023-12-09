package com.example.stickmanfx;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class FallingSound implements Soundable{
    @Override
    public void makeSound() {
        String ssound = "/images/Falling.mp3";
        Media sound = new Media(getClass().getResource(ssound).toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);

        mediaPlayer.play();
    }
}
