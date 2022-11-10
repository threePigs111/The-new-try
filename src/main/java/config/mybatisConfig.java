package config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

public class mybatisConfig {
    @Bean
    public SqlSessionFactoryBean SqlSessionFactory(DataSource dataSource)
    {

        SqlSessionFactoryBean sqlSessionFactoryBean=new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setTypeAliasesPackage("MVC.POJO");
        sqlSessionFactoryBean.setMapperLocations();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer()
    {
        MapperScannerConfigurer mapperScannerConfigurer=new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("MVC.dao");
        return mapperScannerConfigurer;
    }
}
