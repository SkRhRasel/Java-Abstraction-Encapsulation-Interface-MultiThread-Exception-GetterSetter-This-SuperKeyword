package Abstraction.Exercise2;

public class GetFb extends FacebookLife {

    public static void main(String[] args){

        FacebookLife facebookLife = new GetFb();

        facebookLife.profile();
        facebookLife.timeline();
        facebookLife.home();

        facebookLife.like();
        facebookLife.comment();
        facebookLife.status();
    }

    @Override
    void profile() {
        System.out.println("Profile View:");
    }

    @Override
    void timeline() {
        System.out.println("TimeLine View:");
    }

    @Override
    void home() {
        System.out.println("Home View:");
    }
}
