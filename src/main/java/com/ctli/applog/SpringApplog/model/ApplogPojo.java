package com.ctli.applog.SpringApplog.model;

public class ApplogPojo {
	private String hostName;
	private String appName;
	private String timeStamp;
	private String version;
	private int alarmId;
	private String entryType;
	private String message;
	private String contextInfo;
	private String stackTrace;
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public int getAlarmId() {
		return alarmId;
	}
	public void setAlarmId(int alarmId) {
		this.alarmId = alarmId;
	}
	public String getEntryType() {
		return entryType;
	}
	public void setEntryType(String entryType) {
		this.entryType = entryType;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getContextInfo() {
		return contextInfo;
	}
	public void setContextInfo(String contextInfo) {
		this.contextInfo = contextInfo;
	}
	public String getStackTrace() {
		return stackTrace;
	}
	public void setStackTrace(String stackTrace) {
		this.stackTrace = stackTrace;
	}
	public ApplogPojo(String hostName, String appName, String timeStamp, String version, int alarmId,
			String entryType, String message, String contextInfo, String stackTrace) {
		super();
		this.hostName = hostName;
		this.appName = appName;
		this.timeStamp = timeStamp;
		this.version = version;
		this.alarmId = alarmId;
		this.entryType = entryType;
		this.message = message;
		this.contextInfo = contextInfo;
		this.stackTrace = stackTrace;
	}
	
}
