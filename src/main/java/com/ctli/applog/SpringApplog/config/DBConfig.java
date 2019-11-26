package com.ctli.applog.SpringApplog.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DBConfig {
	 @Bean(name = "dbDev1Service")
	   @ConfigurationProperties(prefix = "spring.db-dev1")
	   @Primary
	   public DataSource createDev1ServiceDataSource() {
	      return DataSourceBuilder.create().build();
	   }
	 @Bean(name = "dbDev2Service")
	   @ConfigurationProperties(prefix = "spring.db-dev2")
	   public DataSource createDev2ServiceDataSource() {
	      return DataSourceBuilder.create().build();
	   }
	   @Bean(name = "dbTest1Service")
	   @ConfigurationProperties(prefix = "spring.db-test1")
	   public DataSource createTest1ServiceDataSource() {
	      return DataSourceBuilder.create().build();
	   }
	   @Bean(name = "dbTest2Service")
	   @ConfigurationProperties(prefix = "spring.db-test2")
	   public DataSource createTest2ServiceDataSource() {
	      return DataSourceBuilder.create().build();
	   }
	   @Bean(name = "dbTest3Service")
	   @ConfigurationProperties(prefix = "spring.db-test3")
	   public DataSource createTest3ServiceDataSource() {
	      return DataSourceBuilder.create().build();
	   }
	   @Bean(name = "dbTest4Service")
	   @ConfigurationProperties(prefix = "spring.db-test4")
	   public DataSource createTest4ServiceDataSource() {
	      return DataSourceBuilder.create().build();
	   }
	   @Bean(name = "dbProdService")
	   @ConfigurationProperties(prefix = "spring.db-prod")
	   public DataSource createProdServiceDataSource() {
	      return DataSourceBuilder.create().build();
	   }
	   @Bean(name = "jdbcDev1Service")
	   @Autowired
	   public JdbcTemplate createJdbcTemplate_Dev1Service(@Qualifier("dbDev1Service") DataSource dev1ServiceDS) {
	      return new JdbcTemplate(dev1ServiceDS);
	   }
	   @Bean(name = "jdbcDev2Service")
	   @Autowired
	   public JdbcTemplate createJdbcTemplate_Dev2Service(@Qualifier("dbDev2Service") DataSource dev2ServiceDS) {
	      return new JdbcTemplate(dev2ServiceDS);
	   }
	   @Bean(name = "jdbcTest1Service")
	   @Autowired
	   public JdbcTemplate createJdbcTemplate_Test1Service(@Qualifier("dbTest1Service") DataSource test1ServiceDS) {
	      return new JdbcTemplate(test1ServiceDS);
	   }
	   @Bean(name = "jdbcTest2Service")
	   @Autowired
	   public JdbcTemplate createJdbcTemplate_Test2Service(@Qualifier("dbTest2Service") DataSource test2ServiceDS) {
	      return new JdbcTemplate(test2ServiceDS);
	   }
	   @Bean(name = "jdbcTest3Service")
	   @Autowired
	   public JdbcTemplate createJdbcTemplate_Test3Service(@Qualifier("dbTest3Service") DataSource test3ServiceDS) {
	      return new JdbcTemplate(test3ServiceDS);
	   }
	   @Bean(name = "jdbcTest4Service")
	   @Autowired
	   public JdbcTemplate createJdbcTemplate_Test4Service(@Qualifier("dbTest4Service") DataSource test4ServiceDS) {
	      return new JdbcTemplate(test4ServiceDS);
	   }
	   @Bean(name = "jdbcProdService")
	   @Autowired
	   public JdbcTemplate createJdbcTemplate_ProdService(@Qualifier("dbProdService") DataSource prodServiceDS) {
	      return new JdbcTemplate(prodServiceDS);
	   }
}
