package repositories;

import models.User;

import java.util.List;

public interface UserRepository {
    User saveUser(User user);
    User findById(String id);
    void deleteById(String id);

    List<User> findALLUser();
}


