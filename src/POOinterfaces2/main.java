package POOinterfaces2;

import java.util.List;
import java.util.function.Consumer;

public class main {
    public static void main(String[] args) {

        List<User> users= List.of(new User("Alex",25), new User("Bruno",20),new User("Gab",22),new User("Ana", 19 ));
        var consumer = new Consumer<User>(){
            @Override
            public void accept (final User user){
                System.out. println(user);
            }

        };
        users.forEach(consumer);
    }
}
