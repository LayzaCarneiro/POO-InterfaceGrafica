package entidades;

/**
 *
 * @author Layza
 */
public class Carrinho {
    private String nome;
    private int quantidade;
    private double preço;
    private double valorFinal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public double getValorFinal() {
        valorFinal = (this.getPreço() * this.getQuantidade());
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
    
    
    
}
