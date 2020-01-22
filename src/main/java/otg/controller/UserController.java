package otg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import otg.service.BaseService;
import otg.service.OtgUserService;


@Controller
@RequestMapping(value="/user_operation")
public class UserController {
	
	@Autowired
	@Qualifier("otgUserService")
	private OtgUserService otgUserService;
	
	public UserController() {	
	}
	
	@RequestMapping(value="/logon",produces="application/json;charset=UTF-8")
	@ResponseBody
	public String userLogon() {
		otgUserService.logon();
		
		return "";
	}
	
	@RequestMapping(value="/logout",produces="application/json;charset=UTF-8")
	@ResponseBody
	public String userLogout() {
		otgUserService.logout();
		
		return "";
	}
	

}
