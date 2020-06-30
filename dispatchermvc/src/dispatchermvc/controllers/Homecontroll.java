package dispatchermvc.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroll{

@RequestMapping("/")
public String home()
{
	return "home";
}

@RequestMapping("/register")
public String register(Model model)
{
	Student student1=new Student();
	model.addAttribute("student",student1);
	return "register";
}

@RequestMapping("/processForm")
public String processform(@ModelAttribute("student") Student student1)
{
	//System.out.println("name is"+ student1.getFirstname() +"lastname"+ student1.getLasttname());
	
	return "studentname";
}
}