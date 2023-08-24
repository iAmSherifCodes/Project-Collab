package repositories;

import models.User;
import utils.AppUtils;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements  UserRepository{
    List<User> userList = new ArrayList<>();
    @Override
    public User saveUser(User user) {
        String id = AppUtils.generatedId();
        user.setId(id);
        userList.add(user);
        return user;
    }
    @Override
    public User findById(String Userid) {
        for (User user : userList)
            if (user.getId().equals(Userid)) {
                return user;
            }
        return null;
    }
    @Override
    public void deleteById(String id) {
        User foundUser = findById(id);
        delete(foundUser);
    }

    @Override
    public List<User> findALLUser() {
        return  userList;
    }
    public void delete(User user){
        userList.remove(user);
    }


}
