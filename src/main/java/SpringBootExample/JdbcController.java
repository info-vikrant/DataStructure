package SpringBootExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.jdbc.core.JdbcTemplate;  
@RestController
public class JdbcController {
	 @Autowired  
	    JdbcTemplate jdbc;    
	    @RequestMapping("/insert")  
	    public String index(){  
	        jdbc.execute("insert into user(name,email)values('javatpoint','java@javatpoint.com')");  
	        return"data inserted Successfully";  
	    }  
}
