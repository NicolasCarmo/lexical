public class Erro {
    private String tipo;
    private String mensagem;
    private int linha;
    private int coluna;

    public Erro(String tipo, String mensagem, int linha, int coluna) {
        this.tipo = tipo;
        this.mensagem = mensagem;
        this.linha = linha;
        this.coluna = coluna;
    }

    @Override
    public String toString() {
        return "[" + tipo + "] Linha: " + linha + ", Coluna: " + coluna + ": " + mensagem;
    }
}
