/**
 * @author zhengtx
 * @description dfbz
 * @date 2019/8/23
 */
public class UserService {
    private UserDao userDao = new UserDao();
    public User login(String username,String password){
        return userDao.findUser(username,password);
    }
}

