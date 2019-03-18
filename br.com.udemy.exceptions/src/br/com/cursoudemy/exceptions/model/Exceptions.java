package br.com.cursoudemy.exceptions.model;

public class Exceptions extends RuntimeException
{

    private static final long serialVersionUID = 1L;
    
    public  Exceptions (String msg) 
    {
        super(msg);
    }
    
}
