package cs.glgeng.test;

import cs.glgeng.dao.userDao;
import cs.glgeng.domain.User;
import org.junit.Test;

public class useDaoTest {
    @Test
    public void testLogin() {
        User loginUser = new User();
        loginUser.setUsername("superBaby");
        loginUser.setPassword("123");

        userDao dao = new userDao();
        User user = dao.login(loginUser);
        System.out.println(user);
    }
}
