package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("process to go home view");
		return "home";
		
	}
	
	@RequestMapping("/search")
	public Object search(@RequestParam("querybox")String query)
	{
		
		String url="https://www.google.com/search?q="+query;
	    
		if(query.isBlank())
		{
			System.out.println("you are not written anything in search box..");
			return "redirect:/home";
		}
		
		
	  RedirectView redirectview  =	new RedirectView();
	  redirectview.setUrl(url);
	  System.out.println("search--"+redirectview);
	 
	  
	return redirectview;
	}
	
	

}


