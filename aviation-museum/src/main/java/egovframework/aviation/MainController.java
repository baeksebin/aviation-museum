package egovframework.aviation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping(value = "/main.do")
	public String addMetaData() throws Exception {
		return "main/main";
	}

}