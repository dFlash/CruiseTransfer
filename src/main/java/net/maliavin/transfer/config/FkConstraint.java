package net.maliavin.transfer.config;

public class FkConstraint
{
    private String sourceTable;

    private String targetTable;

    private String sourceColumn;

    private String targetColumn;

    private String condition;

    public String getSourceTable()
    {
        return sourceTable;
    }

    public void setSourceTable(String sourceTable)
    {
        this.sourceTable = sourceTable;
    }

    public String getTargetTable()
    {
        return targetTable;
    }

    public void setTargetTable(String targetTable)
    {
        this.targetTable = targetTable;
    }

    public String getSourceColumn()
    {
        return sourceColumn;
    }

    public void setSourceColumn(String sourceColumn)
    {
        this.sourceColumn = sourceColumn;
    }

    public String getTargetColumn()
    {
        return targetColumn;
    }

    public void setTargetColumn(String targetColumn)
    {
        this.targetColumn = targetColumn;
    }

    public String getCondition()
    {
        return condition;
    }

    public void setCondition(String condition)
    {
        this.condition = condition;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((condition == null) ? 0 : condition.hashCode());
        result = prime * result
                + ((sourceColumn == null) ? 0 : sourceColumn.hashCode());
        result = prime * result
                + ((sourceTable == null) ? 0 : sourceTable.hashCode());
        result = prime * result
                + ((targetColumn == null) ? 0 : targetColumn.hashCode());
        result = prime * result
                + ((targetTable == null) ? 0 : targetTable.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FkConstraint other = (FkConstraint) obj;
        if (condition == null)
        {
            if (other.condition != null)
                return false;
        }
        else if (!condition.equals(other.condition))
            return false;
        if (sourceColumn == null)
        {
            if (other.sourceColumn != null)
                return false;
        }
        else if (!sourceColumn.equals(other.sourceColumn))
            return false;
        if (sourceTable == null)
        {
            if (other.sourceTable != null)
                return false;
        }
        else if (!sourceTable.equals(other.sourceTable))
            return false;
        if (targetColumn == null)
        {
            if (other.targetColumn != null)
                return false;
        }
        else if (!targetColumn.equals(other.targetColumn))
            return false;
        if (targetTable == null)
        {
            if (other.targetTable != null)
                return false;
        }
        else if (!targetTable.equals(other.targetTable))
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "FkConstraint [sourceTable=" + sourceTable + ", targetTable="
                + targetTable + ", sourceColumn=" + sourceColumn
                + ", targetColumn=" + targetColumn + ", condition=" + condition
                + "]";
    }

}
