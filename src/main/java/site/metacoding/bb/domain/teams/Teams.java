package site.metacoding.bb.domain.teams;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Teams {
	private Integer id;
	private String teamName;
	private Integer stadiumsId;
	private Timestamp createdAt;
}
