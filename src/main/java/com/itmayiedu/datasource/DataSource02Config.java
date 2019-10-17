//package com.itmayiedu.datasource;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//
//import javax.sql.DataSource;
//
//// DataSource02
//@Configuration
//@MapperScan(basePackages = "com.itmayiedu.test02", sqlSessionFactoryRef = "test02SqlSessionFactory")
//public class DataSource02Config {
//
//	@Bean(name = "test02DataSource")
//	@ConfigurationProperties(prefix = "spring.datasource.test02")
//	public DataSource testDataSource() {
//		return DataSourceBuilder.create().build();
//	}
//
//	@Bean(name = "test02TransactionManager")
//	public DataSourceTransactionManager testTransactionManager(@Qualifier("test02DataSource") DataSource dataSource) {
//		return new DataSourceTransactionManager(dataSource);
//	}
//
//	@Bean(name = "test02SqlSessionFactory")
//	public SqlSessionFactory testSqlSessionFactory(@Qualifier("test02DataSource") DataSource dataSource) throws Exception {
//		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//		bean.setDataSource(dataSource);
//		return bean.getObject();
//	}
//
//	@Bean(name = "test02SqlSessionTemplate")
//	public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("test02SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
//		return new SqlSessionTemplate(sqlSessionFactory);
//	}
//
//}
