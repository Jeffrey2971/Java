package dataSource.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * Druid
 */

public class DruidDemo1 {
    public static void main(String[] args) throws Exception {
        // 1、导入jar包

        // 2、定义配置文件

        // 3、加载配置文件
        Properties pro = new Properties();
        InputStream ips = DruidDemo1.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(ips);
        // 4、获取连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        // 5、获取连接
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
