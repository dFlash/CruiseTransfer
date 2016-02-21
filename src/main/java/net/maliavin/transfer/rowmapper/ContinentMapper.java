package net.maliavin.transfer.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import net.maliavin.transfer.domain.Continent;

public class ContinentMapper implements RowMapper<Continent>
{

    public Continent mapRow(ResultSet rs, int arg1) throws SQLException
    {
        Continent continent = new Continent();
        continent.setContinentId(rs.getLong("continent_id"));
        continent.setDescription(rs.getString("description"));
        continent.setName(rs.getString("name"));
        continent.setGalleryId(rs.getLong("gallery_id"));
        return continent;
    }

}
