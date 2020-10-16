package ca.sheridancollege.sunichus.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Movie {

	private Long id;
	private String movieName;
	private String streaming;
	private String review;
	private String reviewDateTime;
}
