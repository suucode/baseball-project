package site.metacoding.bb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.bb.domain.stadiums.Stadiums;
import site.metacoding.bb.domain.stadiums.StadiumsDao;
import site.metacoding.bb.domain.teams.TeamsDao;
import site.metacoding.bb.web.dto.request.stadiums.SaveDto;

@RequiredArgsConstructor
@Service
public class StadiumsService {
	private final StadiumsDao stadiumsDao;
	
	public void 경기장등록(SaveDto saveDto) {
		Stadiums stadiums = saveDto.toEntity();
		stadiumsDao.save(stadiums);
	}
	
	public List<Stadiums> 경기장목록보기() {
		return stadiumsDao.findAll();
	}
	
	public void 경기장삭제(Integer id) {
		Stadiums stadiumsPS = stadiumsDao.findById(id);
		stadiumsDao.deleteById(id);
	}
}
