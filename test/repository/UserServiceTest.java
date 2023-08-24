package repository;

import models.User;
import org.testng.annotations.Test;
import repositories.UserRepository;
import repositories.UserRepositoryImpl;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class UserServiceTest {
    @Test
    public void testToSaveAUser(){
        User user = new User();
        user.setName("Duru");
        user.setPassword("80808");
        UserRepository userRepository =  new UserRepositoryImpl();
        User SavedUser = userRepository.saveUser(user);
        User foundUser = userRepository.findById(SavedUser.getId());
        assertNotNull(foundUser);
    }
    @Test
    public  void testToFindAUserById(){
        User user = new User();
        UserRepository userRepository =  new UserRepositoryImpl();
        User savedUser1 = userRepository.saveUser(user);
        User foundUser1 = userRepository.findById(savedUser1.getId());
        assertNotNull(foundUser1);
    }
    @Test
    public  void testToSaveTwoUser(){
        User user = new User();
        User user2 = new User();
        UserRepository userRepository =  new UserRepositoryImpl();

        userRepository.saveUser(user);
        userRepository.saveUser(user2);

        List<User> userList =  userRepository.findALLUser();
        assertEquals(2,userList.size());
    }

    @Test
    public  void  testToRemoveUser(){
        User user = new User();
        UserRepository userRepository =  new UserRepositoryImpl();
        User user2 = new User();
        User user3= new User();
        userRepository.saveUser(user);
        userRepository.saveUser(user2);
        userRepository.saveUser(user3);

        List<User>userList =  userRepository.findALLUser();

        assertEquals(3,userList.size());


    }

}
