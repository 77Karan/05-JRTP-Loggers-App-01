package in.ashokit.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService 
{
	Logger logger = LoggerFactory.getLogger(UserService.class);
	
	public void saveUser()
	{
		logger.info("***saveUser() --> statred");
		System.out.println("User saving opetion Logic");
		logger.info("***saveUser() --> ended");

	}
	

}
