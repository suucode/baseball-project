package site.metacoding.bb.domain.players;

import java.util.List;

public interface PlayersDao {
	public void insert(Players players);
	public List<Players> findAll();
	public void deleteById(Integer id);
	
//	public Players findById(Integer id);
//	public void update(Players players);
}
