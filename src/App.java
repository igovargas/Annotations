public class App {
    public static void main(String[] args) {
        Class<?> classe = Produto.class;

        if (classe.isAnnotationPresent(Tabela.class)) {
            Tabela anotacao = classe.getAnnotation(Tabela.class);
            String nomeDaTabela = anotacao.valor();
            System.out.println("Nome da tabela: " + nomeDaTabela);
        } else {
            System.out.println("A classe não tem anotação @Tabela");
        }
    }
}
