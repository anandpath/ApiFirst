package in.anandpath.apifirst.petstore.controller;

import in.anandpath.api.UserApi;
import in.anandpath.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController implements UserApi {
    Map<String, User> users = new HashMap<>();

    @Override
    public ResponseEntity<Void> createUser(User user) {
        this.users.put(user.getUsername(), user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<User> getUserByName(String username) {
        User user = this.users.get(username);
        user = (null == user) ? getDummyUser() : user;
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    private User getDummyUser() {
        User user = new User();
        user.setUsername("anandpath");
        user.setEmail("anandpath@gmail.com");
        user.setUserStatus("Active");
        user.setId(1L);
        user.setFirstName("Anand");
        user.setLastName("Pathak");
        user.setPassword("Password");
        user.setPhone("+919923420012");
        return user;
    }
}
