import java.util.ArrayList;
import java.util.List;

public class ListaErros {
    private static final List<Erro> erros = new ArrayList<>();

    public static void adicionar(String tipo, String mensagem, int linha, int coluna) {
        erros.add(new Erro(tipo, mensagem, linha, coluna));
    }

    public static void exibirErros() {
        if (erros.isEmpty()) {
            System.out.println("Nenhum erro encontrado.");
        } else {
            System.out.println("Erros encontrados:");
            for (Erro erro : erros) {
                System.out.println(erro);
            }
        }
    }

    public static boolean temErros() {
        return !erros.isEmpty();
    }

    public static void limpar() {
        erros.clear();
    }
}

