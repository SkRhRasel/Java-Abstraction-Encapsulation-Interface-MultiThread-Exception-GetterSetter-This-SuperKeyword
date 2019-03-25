package Interface.Exercise;

public class WordPress implements JarvisTheme {

    public static void main(String[] o){

        WordPress wp = new WordPress();
        wp.themeAuthor();
        wp.wordpressVersion();
        wp.themeName();
    }

    @Override
    public void themeName() {
        System.out.println("Theme Name: Jarvis");
    }

    @Override
    public void wordpressVersion() {
        System.out.println("WP Verions: 4.3");

    }

    @Override
    public void themeAuthor() {
        System.out.println("Author: Unknown");

    }
}
