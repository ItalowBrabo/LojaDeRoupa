public class produto {
    private int codigo;
    private String descricao;
    private double preco;

    public produto(int codigo, String descricao, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    //----------------------------------------------

    public int getcodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
       this.codigo = codigo;
    }

    //----------------------------------------------

    public String getdescricao(){
        return descricao;
    }
    public void setdescricao(String descricao){
        this.descricao = descricao;
    }

    //----------------------------------------------

    public double getpreco(){
        return preco;
    }
    public void setpreco(double preco){
        this.preco = preco;
    }

    //----------------------------------------------

    @Override
    public String toString(){
        return "produto [codigo= " + codigo + ",descricao= " + descricao + ", preco= " + preco + "]";
    }
}