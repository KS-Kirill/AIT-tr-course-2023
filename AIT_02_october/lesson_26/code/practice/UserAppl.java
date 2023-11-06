package practice;

public class UserAppl {
    public static void main(String[] args) {
        User user = new User("peter@gmail..com", "12345");//create user

        System.out.println(user);//print user

        user.setEmail("petermail.com");
        System.out.println(user);
    }
}
