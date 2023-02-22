package co.grandcircus.hotel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcircus.hotel.model.Hotel;

import co.grandcircus.hotel.repository.HotelRepository;

@Controller
public class HotelController {
	
	// Autowired tells spring to fill in the repo variable automatically
	// when the application starts.
	@Autowired
	private HotelRepository repo;
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/search-form";
	}
	
	// Each "form" requires 2 controllers
	// One controller to display the form
	@RequestMapping("/search-form")
	public String showSearch() {
		return "search";

	}

	// Another to handle the form submission...and display the results
	@RequestMapping("/search-form-submit") // URL path matches form action
	public String submitSearch(@RequestParam String city,
			Model model) {
		
		List<Hotel> hotels = new ArrayList<>();
		hotels = repo.findByCity(city);
		
		for(Hotel h: hotels) {
			System.out.print(h.getName());
		}

		model.addAttribute("hotels", hotels);
		model.addAttribute("city", city);
		return "search-results";
	}
}

