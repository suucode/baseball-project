package site.metacoding.bb.web.dto.request.stadiums;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.bb.domain.stadiums.Stadiums;

@Setter
@Getter
public class SaveDto {
	private String stadiumName;
	
	public Stadiums toEntity() {
		Stadiums stadiums = new Stadiums(this.stadiumName);
		return stadiums;
	}
}
