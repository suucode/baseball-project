package site.metacoding.bb.domain.stadiums;

import java.util.List;

import site.metacoding.bb.web.dto.response.stadiums.ListDto;

public interface StadiumsDao {
	public void save(Stadiums stadiums);
	public List<ListDto> findAll(String teamname);
	public void deleteById(Integer id);
	public Stadiums findById(Integer id);
	
//	public void update(Stadiums stadiums);
}