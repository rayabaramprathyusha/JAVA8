import java.util.*;

class User{
    private Optional<String> Email;

    public User(String email){
        Email = Optional.ofNullable(email);
    }
    public Optional<String> getEmail(){
        return Email;
    }
}

public class OptionalUserExample {
    public static void main(String[] args) {
        User user=new User(null);

        String Email=user.getEmail()
                .orElse("no_email@System.com");
        System.out.println("User Email: "+Email);

    }
}
