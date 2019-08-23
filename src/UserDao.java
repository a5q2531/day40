import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author zhengtx
 * @description dfbz
 * @date 2019/8/23
 */
public class UserDao {
    private JdbcTemplate template = new JdbcTemplate(DataSourceUtils.getDataSource());

    public User findUser(String username,String password){
        try {
            return template.queryForObject("select * from user where username=? and password=?",
                    new BeanPropertyRowMapper<>(User.class),username,password);
        } catch (DataAccessException e) {
            return null;
        }

    }

}

