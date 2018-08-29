package core.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import core.service.LoginService;

//@Value("${blessing}")
//private String blessing;

@Service("LoginService")
public class LoginServiceImpl implements LoginService{
	
	@Value("${blessing.new.year}")
	private String blessing;
	
	public String getBlessing(){
		return blessing;
	};

}
