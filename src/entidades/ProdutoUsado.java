package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado  extends  Produto{

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date dataFabricacao;

    public ProdutoUsado(){
    }

    public ProdutoUsado(Date dataFabricacao,String nome,Double preco){
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public Date getDataFabricacao(){
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String mostrarPreco(){
        return getNome() + "(usado)" + " $ " + getPreco() + " " +
                "(Data de fabricação: " + sdf.format(dataFabricacao) + ")";
    }
}
