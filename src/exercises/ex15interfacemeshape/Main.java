package exercises.ex15interfacemeshape;

abstract class Shape {
    abstract void perimeter();
    abstract void area();
}

abstract class Quadrangle extends Shape {

}

class Rectangle extends Quadrangle{
    @Override
    void perimeter() {

    }

    @Override
    void area() {

    }
}

class Square extends Quadrangle{
    @Override
    void perimeter() {

    }

    @Override
    void area() {

    }
}

interface Controller {
    void start();
    void pause();
    void stop();
}

class MusicPlayer implements Controller {
    @Override
    public void start() {
        //start music
    }

    @Override
    public void pause() {
        //pause music
    }

    @Override
    public void stop() {
        //stop music
    }
}

interface MediaController {
    void play();
    void pause();
    void stop();
}

interface VolumeController {
    void increase(int level);
    void decrease(int level);
}

interface AudioController extends MediaController, VolumeController{

}

class AudioPlayer implements AudioController {
    @Override
    public void play() {
        //play Audio
    }

    @Override
    public void pause() {
        //pause Audio
    }

    @Override
    public void stop() {
        //stop Audio
    }

    @Override
    public void increase(int level) {
        //increase volume
    }

    @Override
    public void decrease(int level) {
        //decrease volume
    }
}

interface MediaPlayer {
    void play();
    void pause();
    void stop();

    default void backward(){
        System.out.println("Skip 10 secs");
    }
}

class VideoPlayer implements MediaPlayer{
    @Override
    public void play() {
        //play video
    }

    @Override
    public void pause() {
        //pause video
    }

    @Override
    public void stop() {

    }
}

public class Main {
    public static void main(String[] args) {

    }
}
