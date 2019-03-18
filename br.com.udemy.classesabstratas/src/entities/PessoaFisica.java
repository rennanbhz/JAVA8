package entities;

public class PessoaFisica extends Pessoa
{
    private String nome;
    private Double rendaAnual;
    private Double gastoSaude;

    public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude)
    {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Double getRendaAnual()
    {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual)
    {
        this.rendaAnual = rendaAnual;
    }

    public Double getGastoSaude()
    {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude)
    {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public Double imposto()
    {
        if(getRendaAnual() <= 20000) 
        {
            return getRendaAnual() * 1.5 - getGastoSaude() * 0.5;
        
        }
        else {
            return getRendaAnual() * 2.5 - getGastoSaude() * 0.5;
        }
    }
}
