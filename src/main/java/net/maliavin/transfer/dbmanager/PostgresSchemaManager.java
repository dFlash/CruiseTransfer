package net.maliavin.transfer.dbmanager;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import net.maliavin.transfer.config.FkConstraint;

@Component("postgresSchemaManager")
public class PostgresSchemaManager implements SchemaManager
{
    private static final String FK_PREFIX = "fk";
    
    private static final String FK_NAME_SEPARATOR = "_";
    
    @Autowired
    @Qualifier("sessionFactoryUa")
    private SessionFactory sessionFactory;

    @Transactional
    public void addFkConstraint(FkConstraint constraint)
    {
        String sqlTemplate = "ALTER TABLE %s ADD CONSTRAINT %s FOREIGN KEY (%s) "
                + "      REFERENCES %s (%s) MATCH SIMPLE %s";
        String sql = String.format(sqlTemplate, constraint.getSourceTable(),
                getFkName(constraint.getSourceTable(),
                        constraint.getTargetTable()),
                constraint.getSourceColumn(), constraint.getTargetTable(),
                constraint.getTargetColumn(), constraint.getCondition());
        Session session = sessionFactory.getCurrentSession();
        SQLQuery sqlQuery = session.createSQLQuery(sql);
        sqlQuery.executeUpdate();
    }

    private String getFkName(String source, String target)
    {
        String fkName = FK_PREFIX + FK_NAME_SEPARATOR + source
                + FK_NAME_SEPARATOR + target;
        return fkName;
    }

}
