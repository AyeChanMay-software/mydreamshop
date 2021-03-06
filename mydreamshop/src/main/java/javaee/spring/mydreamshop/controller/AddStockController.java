package javaee.spring.mydreamshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javaee.spring.mydreamshop.model.Stock;

@Controller
//@RequestMapping("/addstock")
public class AddStockController {

	@GetMapping("/addstock")
	public String loadStockForm(Model model) {
		//Stock stock = new Stock();
		model.addAttribute("stock", new Stock());
		return "addstockview";
	}
	
	@PostMapping("savestock")
	public String saveStock(@ModelAttribute Stock stock) {
		
		return("showstocklist");
	}
}
