package br.com.juliogriebeler.moviesearcher.data.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EdiDocumentRowMapper implements RowMapper<EdiDocument> {

	@Override
	public EdiDocument mapRow(ResultSet rs, int rowNum) throws SQLException {
		return null;
	}

}
