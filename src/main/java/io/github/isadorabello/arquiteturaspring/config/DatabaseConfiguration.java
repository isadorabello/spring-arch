package io.github.isadorabello.arquiteturaspring.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {

    @Value("${spring.datasource.url}")
    String url;
    @Value("${spring.datasource.username}")
    String username;
    @Value("${spring.datasource.password}")
    String password;
    @Value("${spring.datasource.driver-class-name}")
    String driver;

    // @Bean // não otimizado para usar em produção
    public DataSource dataSource (){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        ds.setDriverClassName(driver);
        return ds;
    }

    @Bean // recomendado
    public DataSource hikariDataSource(){
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(url);
        config.setUsername(username);
        config.setPassword(password);
        config.setDriverClassName(driver);

        config.setMaximumPoolSize(10); // maximo de conexões liberadas
        config.setMinimumIdle(1); //tamanho inicial do pool
        config.setPoolName("livraria-db-pool"); //github.com/brettwooldridge/HikariCP
        config.setMaxLifetime(600000); // 10 min de conexao
        config.setConnectionTimeout(120000); // tentativa de conexao pro 2 minutos, time out após isso
        config.setConnectionTestQuery("SELECT 1"); // query teste


        return new HikariDataSource(config);
    }

}
