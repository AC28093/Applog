package com.ctli.applog.SpringApplog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctli.applog.SpringApplog.model.ApplogPojo;
import com.ctli.applog.SpringApplog.repo.ApplogDao;
@CrossOrigin
@RestController
@RequestMapping("/api/appLog")
public class ApplogController {

	  @Autowired
	  ApplogDao applogDao;
	  

	/**
	   * Get all list.
	   *
	   * @return the list
	   */
	 @GetMapping("/list/dev1")
	  public List<ApplogPojo> fetchFromDev() {
	    return applogDao.findAllFromDev1();
	  }
	 @GetMapping("/list/dev2")
	  public List<ApplogPojo> fetchFromDev2() {
	    return applogDao.findAllFromDev2();
	  }
	 @GetMapping("/list/test1")
	  public List<ApplogPojo> fetchFromTest1() {
	    return applogDao.findAllFromTest1();
	  }
	 @GetMapping("/list/test2")
	  public List<ApplogPojo> fetchFromTest2() {
	    return applogDao.findAllFromTest2();
	  }
	 @GetMapping("/list/test3")
	  public List<ApplogPojo> fetchFromTest3() {
	    return applogDao.findAllFromTest3();
	  }
	 @GetMapping("/list/test4")
	  public List<ApplogPojo> fetchFromTest4() {
	    return applogDao.findAllFromTest4();
	  }
	 @GetMapping("/list/prod")
	  public List<ApplogPojo> fetchFromProd() {
	    return applogDao.findAllFromProd();
	  }
	 
	  /**
	   * Gets users by id.
	   *
	   * @param userId the user id
	   * @return the users by id
	   * @throws ResourceNotFoundException the resource not found exception
	   */
	    @GetMapping("/list/dev1/{columnName}/{cValue}")
	  public List<ApplogPojo> getApplogByAlarmIdDev1(@PathVariable(value = "columnName") String columnName,@PathVariable(value = "cValue") String cValue){
	    	return applogDao.findDataFromDev1(columnName,cValue);
	  }
	    @GetMapping("/list/dev2/{columnName}/{cValue}")
		  public List<ApplogPojo> getApplogByAlarmIdDev2(@PathVariable(value = "columnName") String columnName,@PathVariable(value = "cValue") String cValue){
		    	return applogDao.findDataFromDev2(columnName,cValue);
		  } @GetMapping("/list/test1/{columnName}/{cValue}")
		  public List<ApplogPojo> getApplogByAlarmIdTest1(@PathVariable(value = "columnName") String columnName,@PathVariable(value = "cValue") String cValue){
		    	return applogDao.findDataFromTest1(columnName,cValue);
		  } @GetMapping("/list/test2/{columnName}/{cValue}")
		  public List<ApplogPojo> getApplogByAlarmIdTest2(@PathVariable(value = "columnName") String columnName,@PathVariable(value = "cValue") String cValue){
		    	return applogDao.findDataFromTest2(columnName,cValue);
		  } @GetMapping("/list/test3/{columnName}/{cValue}")
		  public List<ApplogPojo> getApplogByAlarmIdTest3(@PathVariable(value = "columnName") String columnName,@PathVariable(value = "cValue") String cValue){
		    	return applogDao.findDataFromTest3(columnName,cValue);
		  } @GetMapping("/list/test4/{columnName}/{cValue}")
		  public List<ApplogPojo> getApplogByAlarmIdTest4(@PathVariable(value = "columnName") String columnName,@PathVariable(value = "cValue") String cValue){
		    	return applogDao.findDataFromTest4(columnName,cValue);
		  } @GetMapping("/list/prod/{columnName}/{cValue}")
		  public List<ApplogPojo> getApplogByAlarmIdProd(@PathVariable(value = "columnName") String columnName,@PathVariable(value = "cValue") String cValue){
		    	return applogDao.findDataFromProd(columnName,cValue);
		  } 
}
