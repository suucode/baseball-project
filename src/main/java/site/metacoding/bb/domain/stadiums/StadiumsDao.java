package site.metacoding.bb.domain.stadiums;

import java.util.List;

public interface StadiumsDao {
	public void insert(Stadiums stadiums);
	public List<Stadiums> findAll();
	public void deleteById(Integer id);
	
//	public Stadiums findById(Integer id);
//	public void update(Stadiums stadiums);
}