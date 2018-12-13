import controllers.UserController;
import models.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SampleTestCase {

    private UserController userController;

    @Before
    public void setUp() {
        userController = new UserController();
    }

    @Test
    public void testUserInfoResponse() {
        User user = userController.getUserByUserName("keryit");
        System.out.println(user);
        assertTrue(user.getHtml_url().contains("https://github.com/keryit"));
    }

    @Test
    public void testFollowers() {
        User[] followers = userController.getFollowersByUser("keryit");
        assertTrue(followers.length == 0);

    }
}
