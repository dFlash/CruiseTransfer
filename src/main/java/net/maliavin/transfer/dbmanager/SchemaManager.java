package net.maliavin.transfer.dbmanager;

import net.maliavin.transfer.config.FkConstraint;

public interface SchemaManager
{
    public void addFkConstraint(FkConstraint constraint);

    public void dropFkConstraint(FkConstraint constraint);

    public void dropData(String tableName);
}
