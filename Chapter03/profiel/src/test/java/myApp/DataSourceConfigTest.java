package myApp;

import com.myApp.MyAppDataSourceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class DataSourceConfigTest {

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes = MyAppDataSourceConfig.class)
    @ActiveProfiles("dev")
    public static class DevDataSourceTest{
        @Autowired
        private DataSource dataSource;

        @Test
        public void shouldBeEmbeddedDatasource(){
            assertNotNull(dataSource);
            JdbcTemplate jdbc = new JdbcTemplate(dataSource);
            List<String> results = jdbc.query("select id,name from Things", new RowMapper<String>() {
                @Override
                public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                    return rs.getLong("id") + ":" + rs.getString("name");
                }
            });
            assertEquals(1,results.size());
            assertEquals("0:A",results.get(0));
        }
    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes = MyAppDataSourceConfig.class)
    @ActiveProfiles("prod")
    public static class ProductionDataSourceTest{
        @Autowired
        private DataSource dataSource;

        @Test
        public void shouldBeJndiDataSource(){
            //这里会输出null，应用没有一个数据源配置在JNDI里面
            assertNull(dataSource);
        }
    }


    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration("classpath:profile-config.xml")
    @ActiveProfiles("dev")
    public static class DevDataSourceTest_XMLConfig{
        @Autowired
        private DataSource dataSource;

        @Test
        public void shouldBeEmbeddedDatasource(){
            assertNotNull(dataSource);
            JdbcTemplate jdbc = new JdbcTemplate(dataSource);
            List<String> results = jdbc.query("select id,name from Things", new RowMapper<String>() {
                @Override
                public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                    return rs.getLong("id") + ":" + rs.getString("name");
                }
            });
            assertEquals(1,results.size());
            assertEquals("0:A",results.get(0));
        }
    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration("classpath:profile-config.xml")
    @ActiveProfiles("prod")
    public static class ProdDataSourceTest_XMLConfig {
        @Autowired(required = false)
        private DataSource dataSource;

        @Test
        public void shouldBeEmbeddedDatasource() {
            //这里会输出null，应用没有一个数据源配置在JNDI里面
            assertNull(dataSource);
        }
    }
}
