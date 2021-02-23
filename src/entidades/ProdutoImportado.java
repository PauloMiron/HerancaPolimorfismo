package entidades;

public class ProdutoImportado extends Produto{

    private Double taxa;

    public ProdutoImportado(){
        super();
    }

    public ProdutoImportado(Double taxa,String name,Double preco){
        super(name,preco);
        this.taxa = taxa;
    }

    public Double getTaxa(){
        return taxa;
    }

    public void setTaxa(Double taxa){
        this.taxa = taxa;
    }

    @Override
    public String mostrarPreco(){
        return getNome() + " " + precoTotal() + "(Taxa: $" + taxa + ")";
    }

    public Double precoTotal(){
        return getPreco() + taxa;
    }
}
