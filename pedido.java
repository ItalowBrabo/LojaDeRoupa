import java.util.ArrayList;
import java.util.List;

public class pedido {
    private int id;
    private cliente cliente;
    private List<produto> produtos;

    public pedido(int id, cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public cliente getCliente() {
        return cliente;
    }

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }

    public List<produto> getProdutos() {
        return produtos;
    }

    public void addProduto(produto produto) {
        this.produtos.add(produto);
    }

    @Override
    public String toString() {
        return "Pedido [id=" + id + ", cliente=" + cliente + ", produtos=" + produtos + "]";
    }
}
