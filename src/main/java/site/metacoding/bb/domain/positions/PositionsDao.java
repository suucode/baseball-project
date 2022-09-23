package site.metacoding.bb.domain.positions;

import java.util.List;

public interface PositionsDao {
	public void insert(Positions positions);
	public List<Positions> findAll();
	public void deleteById(Integer id);
	
//	public Positions findById(Integer id);
//	public void update(Positions positions);
}
