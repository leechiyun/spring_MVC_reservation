package kr.or.connect.reservation.controller.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.or.connect.reservation.dto.Category;
import kr.or.connect.reservation.service.CategoryService;

@RestController
@ResponseBody
@RequestMapping(path = "/api/categories")
public class ReservationApiController {

	@Autowired
	CategoryService categoryService;
	
	@GetMapping
	Map<String, Object> list(){
		List<Category> getCategories = categoryService.getCategory();
		int size = categoryService.getCount();
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("size", size);
		map.put("items", getCategories);
		
		return map;
	}
	
}
