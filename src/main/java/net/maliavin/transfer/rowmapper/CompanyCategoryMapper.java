package net.maliavin.transfer.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import net.maliavin.transfer.domain.CompanyCategory;

@Component("companyCategoryMapper")
public class CompanyCategoryMapper implements RowMapper<CompanyCategory>
{

    public CompanyCategory mapRow(ResultSet rs, int arg1) throws SQLException
    {
        CompanyCategory companyCategory = new CompanyCategory();
        companyCategory.setCompanyCategoryId(rs.getLong("company_category_id"));
        companyCategory.setName(rs.getString("name"));
        return companyCategory;
    }

}
