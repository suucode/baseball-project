package site.metacoding.bb.domain.outers;

import java.util.List;

public interface OutersDao {
	public void insert(Outers outers);
	public List<Outers> findAll();
	public void deleteById(Integer id);
	
//	public Outers findById(Integer id);
//	public void update(Outers outers);
}
