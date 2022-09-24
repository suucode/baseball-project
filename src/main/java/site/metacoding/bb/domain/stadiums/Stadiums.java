package site.metacoding.bb.domain.stadiums;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Stadiums {
	private Integer id;
	private String stadiumName;
	private Timestamp createdAt;
	
	public Stadiums(String stadiumName) {
		this.stadiumName = stadiumName;
	}
	
	
}
