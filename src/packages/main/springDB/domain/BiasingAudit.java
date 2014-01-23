package springDB.domain;

import org.joda.time.LocalDateTime;

public class BiasingAudit {
	private String userName="li";
	private LocalDateTime startTime=LocalDateTime.now();
	
	public void print(){
		System.out.println(this.userName + " " + startTime);
	}
	

}
