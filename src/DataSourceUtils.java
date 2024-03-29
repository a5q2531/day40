import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author zhengtx
 * @description dfbz
 * @date 2019/8/23
 */


public class DataSourceUtils {

    private static DataSource ds;
    static{
        Properties info = new Properties();

        try(InputStream in = DataSourceUtils.class.getResourceAsStream("/drud.properties")){
            info.load(in);
            ds = DruidDataSourceFactory.createDataSource(info);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static DataSource getDataSource(){
        return ds;
    }
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

}

