import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<produto> produtos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Atualizar Produto");
            System.out.println("4. Deletar Produto");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    atualizarProduto();
                    break;
                case 4:
                    deletarProduto();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void adicionarProduto() {
        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Digite a descrição do produto: ");
        String descricao = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.print("Digite o tipo de produto (1 - Camisa, 2 - Calça, 3 - Acessório): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        produto produto = null;
        switch (tipo) {
            case 1:
                produto = new camisa(codigo, descricao, preco);
                break;
            case 2:
                produto = new calca(codigo, descricao, preco);
                break;
            case 3:
                produto = new acessorios(codigo, descricao, preco);
                break;
            default:
                System.out.println("Tipo de produto inválido!");
                return;
        }

        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    private static void listarProdutos() {
        System.out.println("\nLista de Produtos:");
        for (produto produto : produtos) {
            System.out.println(produto);
        }
    }

    private static void atualizarProduto() {
        System.out.print("Digite o código do produto a ser atualizado: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        produto produto = buscarproduto(codigo);
        if (produto == null) {
            System.out.println("Produto não encontrado!");
            return;
        }

        System.out.print("Digite a nova descrição do produto: ");
        String descricao = scanner.nextLine();
        System.out.print("Digite o novo preço do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        produto.setdescricao(descricao);
        produto.setpreco(preco);

        System.out.println("Produto atualizado com sucesso!");
    }
    private static void deletarProduto() {
        System.out.print("Digite o código do produto a ser deletado: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        produto produto = buscarproduto(codigo);
        if (produto == null) {
            System.out.println("Produto não encontrado!");
            return;
        }

        produtos.remove(produto);
        System.out.println("Produto deletado com sucesso!");
    }

    private static produto buscarproduto(int codigo) {
        for (produto produto : produtos) {
            if (produto.getcodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }
}
