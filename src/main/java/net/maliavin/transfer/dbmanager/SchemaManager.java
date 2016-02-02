package net.maliavin.transfer.dbmanager;

import net.maliavin.transfer.config.FkConstraint;

public interface SchemaManager
{
    public void addFkConstraint(FkConstraint constraint);
}
