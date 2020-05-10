package dataSource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * csp0
 */

public class C3P0Demo2 {
    public static void main(String[] args) throws SQLException {
        // 1、获取dataSource
        DataSource ds = new ComboPooledDataSource();
        // 2、获取连接
        for (int i = 0; i < 11; i++) {
            Connection conn = ds.getConnection();
            System.out.println(i + "：" + conn);
        }
    }
}
