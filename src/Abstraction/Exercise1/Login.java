package Abstraction.Exercise1;
/**
 * Created by skrockybulhasanrasel 04/08/18.
 */
public class Login {
    public static void main(String[] args){

        SocialLife socialLife;

        socialLife = new Facebook();
        String a = socialLife.socialSites();
        System.out.println(a);

        socialLife = new Twitter();
        String b = socialLife.socialSites();
        System.out.println(b);

    }
}
