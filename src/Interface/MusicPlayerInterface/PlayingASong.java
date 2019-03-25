package Interface.MusicPlayerInterface;

public class PlayingASong implements MusicPlayer {
    public static void main(String[] a){

        PlayingASong ps = new PlayingASong();

        // calling method
        ps.my_method();

        // printing variable
        System.out.println("My Age is: " + MusicPlayer.my_age);
    }

    @Override
    public void my_method() {

        System.out.println("This method is overridden from interface");

    }
    // 'implements' keyword to use  a interface in a class.
}
