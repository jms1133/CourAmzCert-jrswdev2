package exercises.ex14interfacemediacontroller;

public class MediaPlayer implements MediaController{

    @Override
    public void start() {
        System.out.println("Player has started.");
    }

    @Override
    public void pause() {
        System.out.println("Player has paused.");
    }

    @Override
    public void stop() {
        System.out.println("Player stopped.");

    }

    @Override
    public void increase(int value) {
        System.out.println("Volume level increased to " + value);
    }

    @Override
    public void decrease(int value) {
        System.out.println("Volume level decreased to " + value);

    }
}
