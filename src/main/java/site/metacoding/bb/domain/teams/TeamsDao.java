package site.metacoding.bb.domain.teams;

import java.util.List;

public interface TeamsDao {
	public void insert(Teams teams);
	public List<Teams> findAll();
	public void deleteById(Integer id);
	
//	public Teams findById(Integer id);
//	public void update(Teams teams);
}