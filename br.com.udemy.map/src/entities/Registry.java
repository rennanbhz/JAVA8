package entities;

public class Registry
{
    private String name;
    private int qntVotes;
    
    public Registry(String name, int qntVotes)
    {
        this.name = name;
        this.qntVotes = qntVotes;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getQntVotes()
    {
        return qntVotes;
    }
    
    public void setQntVotes(int qntVotes)
    {
        this.qntVotes = qntVotes;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + qntVotes;
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Registry other = (Registry) obj;
        if (name == null)
        {
            if (other.name != null) return false;
        }
        else if (!name.equals(other.name)) return false;
        if (qntVotes != other.qntVotes) return false;
        return true;
    }
}
