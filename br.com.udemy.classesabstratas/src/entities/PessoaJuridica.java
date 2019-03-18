package entities;

public class PessoaJuridica extends Pessoa
{
    private String name;
    private Double rendaAnual;
    private Integer numeroFuncionarios;
    
    public PessoaJuridica(String name, Double rendaAnual, Integer numeroFuncionarios)
    {
        super(name, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Double getRendaAnual()
    {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual)
    {
        this.rendaAnual = rendaAnual;
    }

    public Integer getNumeroFuncionarios()
    {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios)
    {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public Double imposto()
    {
        if(getNumeroFuncionarios() >= 10) 
        {
            return getNumeroFuncionarios() * 1.4;
        }
        else {
            return getNumeroFuncionarios() * 1.6;
        }
        
    }
    
    
    
}
