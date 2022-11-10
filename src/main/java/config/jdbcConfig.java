package config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
public class jdbcConfig {
    @Bean
    public DataSource dataSource()
    {
        DruidDataSource dataSource=new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mydb1?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT");
        dataSource.setUsername("root");
        dataSource.setPassword("1234");
        return dataSource;

    }
    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource)
    {
        DataSourceTransactionManager transactionManager=new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }

}
