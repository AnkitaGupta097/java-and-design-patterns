package creational.builder;

public class User
{
    //All final attributes
    private final String firstName; // required
    private final String middleName; //optional
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional

    private User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.middleName = builder.middleName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }
// No Setters to provide immutability
    @Override
    public String toString() {
        return "User: "+this.firstName+", "+this.middleName+" , " +this.lastName+", "+this.age+", "+this.phone+", "+this.address;
    }

    public static class Builder
    {
        private final String firstName;
        private String middleName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }
        public Builder address(String address) {
            this.address = address;
            return this;
        }
        //Return the finally consrcuted User object
        public User build() {
            User user =  new User(this);
            return user;
        }

    }
}
