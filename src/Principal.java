import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtoLista = new ArrayList<>();

        System.out.print("Entre com a quantidade de produtos:  ");
        Integer n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Informações Produto #"+i);
            System.out.print("Produto é : Comum, Usado ou Importado (c/u/i) ");
            char tipo = scanner.next().charAt(0);
            if(tipo == 'c'){
                System.out.print("Nome Produto: ");
                scanner.nextLine();
                String nome = scanner.nextLine();
                System.out.print("Valor: ");
                Double preco = scanner.nextDouble();
                Produto produto = new Produto(nome,preco);
                produtoLista.add(produto);
            } else if(tipo == 'u'){
                System.out.print("Nome Produto: ");
                scanner.nextLine();
                String nome = scanner.nextLine();
                System.out.print("Valor: ");
                Double preco = scanner.nextDouble();
                System.out.print("Informe a data de Fabricação: ");
                Date dataFabricacao = sdf.parse(scanner.next());
                Produto produto = new ProdutoUsado(dataFabricacao,nome,preco);
                produtoLista.add(produto);
            }else {
                System.out.print("Nome Produto: ");
                scanner.nextLine();
                String nome = scanner.nextLine();
                System.out.print("Valor: ");
                Double preco = scanner.nextDouble();
                System.out.print("Taxa:");
                Double taxa = scanner.nextDouble();
                Produto produto = new ProdutoImportado(taxa,nome,preco);
                produtoLista.add(produto);

            }
        }

        System.out.println();
        System.out.println("Valores Produto");
        for(Produto prod : produtoLista){
            System.out.println(prod.mostrarPreco());
        }




        scanner.close();

    }
}
