package creational.builder;

public class Main {
    public static void main(String[] args)
    {
        User user1 = new User.Builder("Georgia", "Bradley")
                .age(30)
                .phone("1234567")
                .address("address 1234")
                .build();

        System.out.println(user1);

        User user2 = new User.Builder("Jesse", "Reacher")
                .middleName("ajhdad")
                .age(40)
                .phone("5655")
                //no address
                .build();

        System.out.println(user2);

        User user3 = new User.Builder("Shana", "Daniel")
                .build();

        System.out.println(user3);
    }
}
