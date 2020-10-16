package ca.sheridancollege.sunichus.database;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import ca.sheridancollege.sunichus.beans.Movie;

@Repository
public class DatabaseAccess {

	@Autowired
	protected NamedParameterJdbcTemplate jdbc;

	public void insertMovie(Movie movie) {

		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		String query = "INSERT INTO movie(movieName, streaming, review, reviewDateTime) VALUES (:movieName, :streaming,"
				+ ":review, :reviewDateTime)";
		namedParameters.addValue("movieName", movie.getMovieName());
		namedParameters.addValue("streaming", movie.getStreaming());
		namedParameters.addValue("review", movie.getReview());
		LocalDateTime currentDateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDateTime = currentDateTime.format(formatter);
		movie.setReviewDateTime(formattedDateTime);
		namedParameters.addValue("reviewDateTime", movie.getReviewDateTime());
		int rowsAffected = jdbc.update(query, namedParameters);
		if (rowsAffected > 0)
			System.out.println("Inserted Movie Review into database");
	}

	public List<Movie> getMovieList() {
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();

		String query = "SELECT * FROM movie";

		return jdbc.query(query, namedParameters, new BeanPropertyRowMapper<Movie>(Movie.class));
	}

}
