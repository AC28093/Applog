package com.ctli.applog.SpringApplog.repo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ctli.applog.SpringApplog.model.ApplogPojo;
@Repository
public class ApplogDao {
	@Qualifier("jdbcDev1Service")
	 @Autowired
	    JdbcTemplate jdbcTemplateDev1;
	@Qualifier("jdbcDev2Service")
	 @Autowired
	    JdbcTemplate jdbcTemplateDev2;
	@Qualifier("jdbcTest1Service")
	 @Autowired
	    JdbcTemplate jdbcTemplateTest1;
	@Qualifier("jdbcTest2Service")
	 @Autowired
	    JdbcTemplate jdbcTemplateTest2;
	@Qualifier("jdbcTest3Service")
	 @Autowired
	    JdbcTemplate jdbcTemplateTest3;
	@Qualifier("jdbcTest4Service")
	 @Autowired
	    JdbcTemplate jdbcTemplateTest4;
	@Qualifier("jdbcProdService")
	 @Autowired
	    JdbcTemplate jdbcTemplateProd;
	SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public void setJdbcTemplateDev1(JdbcTemplate jdbcTemplateDev1) {
		this.jdbcTemplateDev1 = jdbcTemplateDev1;
	}
	public void setJdbcTemplateDev2(JdbcTemplate jdbcTemplateDev2) {
		this.jdbcTemplateDev2 = jdbcTemplateDev2;
	}
	public void setJdbcTemplateTest1(JdbcTemplate jdbcTemplateTest1) {
		this.jdbcTemplateTest1 = jdbcTemplateTest1;
	}
	public void setJdbcTemplateTest2(JdbcTemplate jdbcTemplateTest2) {
		this.jdbcTemplateTest2 = jdbcTemplateTest2;
	}
	public void setJdbcTemplateTest3(JdbcTemplate jdbcTemplateTest3) {
		this.jdbcTemplateTest3 = jdbcTemplateTest3;
	}
	public void setJdbcTemplateTest4(JdbcTemplate jdbcTemplateTest4) {
		this.jdbcTemplateTest4 = jdbcTemplateTest4;
	}
	public void setJdbcTemplateProd(JdbcTemplate jdbcTemplateProd) {
		this.jdbcTemplateProd = jdbcTemplateProd;
	}

	public List<ApplogPojo> findAllFromDev1() {
		List<ApplogPojo> list = new ArrayList<>();
		jdbcTemplateDev1.query("select * from (select * from APPLICATION_LOG order by TIME_STAMP desc) where rownum between 1 and 1000",(rs, rowNum) -> new ApplogPojo(rs.getString("host_name"),rs.getString("application_name"),sdf.format(rs.getTimestamp("time_stamp")),rs.getString("version"), rs.getInt("alarm_id"),rs.getString("entry_type"),rs.getString("message"),rs.getString("context_information"),rs.getString("stack_trace"))
		        ).forEach(applog -> list.add(applog));
		return list;
	}
	public List<ApplogPojo> findDataFromDev1(String column,String value) {
		List<ApplogPojo> list = new ArrayList<>();
		jdbcTemplateDev1.query("select * from APPLICATION_LOG where "+column+" like '%"+value+"%' order by TIME_STAMP desc",(rs, rowNum) -> new ApplogPojo(rs.getString("host_name"),rs.getString("application_name"),sdf.format(rs.getTimestamp("time_stamp")),rs.getString("version"), rs.getInt("alarm_id"),rs.getString("entry_type"),rs.getString("message"),rs.getString("context_information"),rs.getString("stack_trace"))
		        ).forEach(applog -> list.add(applog));
		return list;
	}
	public List<ApplogPojo> findAllFromDev2() {
		List<ApplogPojo> list = new ArrayList<>();
		jdbcTemplateDev2.query("select * from (select * from APPLICATION_LOG order by TIME_STAMP desc) where rownum between 1 and 1000",(rs, rowNum) -> new ApplogPojo(rs.getString("host_name"),rs.getString("application_name"),sdf.format(rs.getTimestamp("time_stamp")),rs.getString("version"), rs.getInt("alarm_id"),rs.getString("entry_type"),rs.getString("message"),rs.getString("context_information"),rs.getString("stack_trace"))
		        ).forEach(applog -> list.add(applog));
		return list;
	}
	public List<ApplogPojo> findDataFromDev2(String  column,String value) {
		List<ApplogPojo> list = new ArrayList<>();
		jdbcTemplateDev2.query("select * from APPLICATION_LOG where "+column+" like '%"+value+"%' order by TIME_STAMP desc",(rs, rowNum) -> new ApplogPojo(rs.getString("host_name"),rs.getString("application_name"),sdf.format(rs.getTimestamp("time_stamp")),rs.getString("version"), rs.getInt("alarm_id"),rs.getString("entry_type"),rs.getString("message"),rs.getString("context_information"),rs.getString("stack_trace"))
		        ).forEach(applog -> list.add(applog));
		return list;
	}
	public List<ApplogPojo> findAllFromTest1() {
		List<ApplogPojo> list = new ArrayList<>();
		jdbcTemplateTest1.query("select * from (select * from APPLICATION_LOG order by TIME_STAMP desc) where rownum between 1 and 1000",(rs, rowNum) -> new ApplogPojo(rs.getString("host_name"),rs.getString("application_name"),sdf.format(rs.getTimestamp("time_stamp")),rs.getString("version"), rs.getInt("alarm_id"),rs.getString("entry_type"),rs.getString("message"),rs.getString("context_information"),rs.getString("stack_trace"))
		        ).forEach(applog -> list.add(applog));
		return list;
	}
	public List<ApplogPojo> findDataFromTest1(String  column,String value) {
		List<ApplogPojo> list = new ArrayList<>();
		jdbcTemplateTest1.query("select * from APPLICATION_LOG where "+column+" like '%"+value+"%' order by TIME_STAMP desc",(rs, rowNum) -> new ApplogPojo(rs.getString("host_name"),rs.getString("application_name"),sdf.format(rs.getTimestamp("time_stamp")),rs.getString("version"), rs.getInt("alarm_id"),rs.getString("entry_type"),rs.getString("message"),rs.getString("context_information"),rs.getString("stack_trace"))
		        ).forEach(applog -> list.add(applog));
		return list;
	}
	public List<ApplogPojo> findAllFromTest2() {
		List<ApplogPojo> list = new ArrayList<>();
		jdbcTemplateTest2.query("select * from (select * from APPLICATION_LOG order by TIME_STAMP desc) where rownum between 1 and 1000",(rs, rowNum) -> new ApplogPojo(rs.getString("host_name"),rs.getString("application_name"),sdf.format(rs.getTimestamp("time_stamp")),rs.getString("version"), rs.getInt("alarm_id"),rs.getString("entry_type"),rs.getString("message"),rs.getString("context_information"),rs.getString("stack_trace"))
		        ).forEach(applog -> list.add(applog));
		return list;
	}
	public List<ApplogPojo> findDataFromTest2(String  column,String value) {
		List<ApplogPojo> list = new ArrayList<>();
		jdbcTemplateTest2.query("select * from APPLICATION_LOG where "+column+" like '%"+value+"%' order by TIME_STAMP desc",(rs, rowNum) -> new ApplogPojo(rs.getString("host_name"),rs.getString("application_name"),sdf.format(rs.getTimestamp("time_stamp")),rs.getString("version"), rs.getInt("alarm_id"),rs.getString("entry_type"),rs.getString("message"),rs.getString("context_information"),rs.getString("stack_trace"))
		        ).forEach(applog -> list.add(applog));
		return list;
	}
	public List<ApplogPojo> findAllFromTest3() {
		List<ApplogPojo> list = new ArrayList<>();
		jdbcTemplateTest3.query("select * from (select * from APPLICATION_LOG order by TIME_STAMP desc) where rownum between 1 and 1000",(rs, rowNum) -> new ApplogPojo(rs.getString("host_name"),rs.getString("application_name"),sdf.format(rs.getTimestamp("time_stamp")),rs.getString("version"), rs.getInt("alarm_id"),rs.getString("entry_type"),rs.getString("message"),rs.getString("context_information"),rs.getString("stack_trace"))
		        ).forEach(applog -> list.add(applog));
		return list;
	}
	public List<ApplogPojo> findDataFromTest3(String  column,String value) {
		List<ApplogPojo> list = new ArrayList<>();
		jdbcTemplateTest3.query("select * from APPLICATION_LOG where "+column+" like '%"+value+"%' order by TIME_STAMP desc",(rs, rowNum) -> new ApplogPojo(rs.getString("host_name"),rs.getString("application_name"),sdf.format(rs.getTimestamp("time_stamp")),rs.getString("version"), rs.getInt("alarm_id"),rs.getString("entry_type"),rs.getString("message"),rs.getString("context_information"),rs.getString("stack_trace"))
		        ).forEach(applog -> list.add(applog));
		return list;
	}
	public List<ApplogPojo> findAllFromTest4() {
		List<ApplogPojo> list = new ArrayList<>();
		jdbcTemplateTest4.query("select * from (select * from APPLICATION_LOG order by TIME_STAMP desc) where rownum between 1 and 1000 ",(rs, rowNum) -> new ApplogPojo(rs.getString("host_name"),rs.getString("application_name"),sdf.format(rs.getTimestamp("time_stamp")),rs.getString("version"), rs.getInt("alarm_id"),rs.getString("entry_type"),rs.getString("message"),rs.getString("context_information"),rs.getString("stack_trace"))
		        ).forEach(applog -> list.add(applog));
		return list;
	}
	public List<ApplogPojo> findDataFromTest4(String  column,String value) {
		List<ApplogPojo> list = new ArrayList<>();
		jdbcTemplateTest4.query("select * from APPLICATION_LOG where "+column+" like '%"+value+"%' order by TIME_STAMP desc",(rs, rowNum) -> new ApplogPojo(rs.getString("host_name"),rs.getString("application_name"),sdf.format(rs.getTimestamp("time_stamp")),rs.getString("version"), rs.getInt("alarm_id"),rs.getString("entry_type"),rs.getString("message"),rs.getString("context_information"),rs.getString("stack_trace"))
		        ).forEach(applog -> list.add(applog));
		return list;
	}
	public List<ApplogPojo> findAllFromProd() {
		List<ApplogPojo> list = new ArrayList<>();
		jdbcTemplateProd.query("select * from (select * from APPLICATION_LOG order by TIME_STAMP desc) where rownum between 1 and 1000",(rs, rowNum) -> new ApplogPojo(rs.getString("host_name"),rs.getString("application_name"),sdf.format(rs.getTimestamp("time_stamp")),rs.getString("version"), rs.getInt("alarm_id"),rs.getString("entry_type"),rs.getString("message"),rs.getString("context_information"),rs.getString("stack_trace"))
		        ).forEach(applog -> list.add(applog));
		return list;
	}
	public List<ApplogPojo> findDataFromProd(String  column,String value) {
		List<ApplogPojo> list = new ArrayList<>();
		jdbcTemplateProd.query("select * from APPLICATION_LOG where "+column+" like '%"+value+"%' order by TIME_STAMP desc",(rs, rowNum) -> new ApplogPojo(rs.getString("host_name"),rs.getString("application_name"),sdf.format(rs.getTimestamp("time_stamp")),rs.getString("version"), rs.getInt("alarm_id"),rs.getString("entry_type"),rs.getString("message"),rs.getString("context_information"),rs.getString("stack_trace"))
		        ).forEach(applog -> list.add(applog));
		return list;
	}

}
