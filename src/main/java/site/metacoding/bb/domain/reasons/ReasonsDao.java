package site.metacoding.bb.domain.reasons;

import java.util.List;

public interface ReasonsDao {
	public void insert(Reasons reasons);
	public List<Reasons> findAll();
	public void deleteById(Integer id);
	
//	public Reasons findById(Integer id);
//	public void update(Reasons reasons);
}