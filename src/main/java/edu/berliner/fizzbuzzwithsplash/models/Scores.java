package edu.berliner.fizzbuzzwithsplash.models;


import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Scores
{
    @Id
    @GeneratedValue
    private long id;

    @NotEmpty
    private String user;
    @Range(min=10, max = 100)
    private int numberSelected;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getUser()
    {
        return user;
    }

    public void setUser(String user)
    {
        this.user = user;
    }

    public int getNumberSelected()
    {
        return numberSelected;
    }

    public void setNumberSelected(int numberSelected)
    {
        this.numberSelected = numberSelected;
    }
}
