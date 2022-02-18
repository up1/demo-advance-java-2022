package solid;

public class MVCDemo {
}

class UserController {
    void register(UserModel user) {
        // 1. Validate input => user
        new RegisterProcess().process(user);
    }
}

class RegisterProcess {
    void process(UserModel user) {
        // 2. Check user in database (existing ?)
        // 3. Create user into database
    }
}

class UserModel {

}
