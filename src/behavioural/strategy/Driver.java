package behavioural.strategy;

public class Driver {

    public static void main(String[] args) {

        SocialMediaContext context = new SocialMediaContext();

        // Setting Facebook strategy.
        context.setSocialmediaStrategy(new FacebookStrategy());
        context.connect("Ankita");

        System.out.println("====================");

        // Setting Twitter strategy.
        context.setSocialmediaStrategy(new TwitterStrategy());
        context.connect("Ankita");

        System.out.println("====================");

        // Setting Instagram strategy.
        context.setSocialmediaStrategy(new InstagramStrategy());
        context.connect("Ankita");


    }
}
