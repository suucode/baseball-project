package site.metacoding.bb.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.bb.domain.stadiums.Stadiums;
import site.metacoding.bb.service.StadiumsService;
import site.metacoding.bb.web.dto.request.stadiums.SaveDto;

@RequiredArgsConstructor
@RestController
public class StadiumsController {
	private final HttpSession session;
	private final StadiumsService stadiumsService;
	
	@PostMapping("/api/stadium/save")
	public String save(SaveDto saveDto) {
		stadiumsService.경기장등록(saveDto);
		return "경기장 등록 완료";
	}
	
	@GetMapping("/api/stadium")
	public List<Stadiums> stadiumsList() {
		List<Stadiums> stadiumsList = stadiumsService.경기장목록보기();
		return stadiumsList;
	}
	
	@DeleteMapping("/api/stadium/delete/{id}")
	public String deleteById(@PathVariable Integer id) {
		stadiumsService.경기장삭제(id);
		return "경기장 삭제 완료";
	}
}
