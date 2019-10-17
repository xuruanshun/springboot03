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
//// DataSource01
//// 注册到springboot容器中
//@Configuration
//// 扫描mapper，引入sessionFactory
//@MapperScan(basePackages = "com.itmayiedu.test01", sqlSessionFactoryRef = "test01SqlSessionFactory")
//public class DataSource01Config {
//
//	// 定义数据源，加载application.yml文件中前缀为 spring.datasource.test01 的配置信息
//	@Bean(name = "test01DataSource")
//	@ConfigurationProperties(prefix = "spring.datasource.test01")
//	public DataSource testDataSource() {
//		return DataSourceBuilder.create().build();
//	}
//
//	// 定义事务管理器，注入数据源
//	@Bean(name = "test01TransactionManager")
//	public DataSourceTransactionManager testTransactionManager(@Qualifier("test01DataSource") DataSource dataSource) {
//		return new DataSourceTransactionManager(dataSource);
//	}
//
//	// 定义sessionFactory,注入数据源
//	@Bean(name = "test01SqlSessionFactory")
//	public SqlSessionFactory testSqlSessionFactory(@Qualifier("test01DataSource") DataSource dataSource) throws Exception {
//		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//		bean.setDataSource(dataSource);
//		return bean.getObject();
//	}
//
//	// 定义sqlSessionTemplate
//	@Bean(name = "test01SqlSessionTemplate")
//	public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("test01SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
//		return new SqlSessionTemplate(sqlSessionFactory);
//	}
//
//}
