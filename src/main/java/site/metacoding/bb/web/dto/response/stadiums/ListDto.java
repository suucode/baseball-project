package site.metacoding.bb.web.dto.response.stadiums;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class ListDto {
	private Integer id;
	private String stadiumName;
	private String teamname;
	private Timestamp createdAt;
}
