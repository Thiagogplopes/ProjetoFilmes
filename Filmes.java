
public class Filmes {

    public static void main(String[] args) {

        System.out.println("Bem vindo, esse é o Screen Match");
        System.out.println("Filme: Vingadores");

        int anoDeLancamento = 2012;
        System.out.println("Ano de lançamento:" + anoDeLancamento);

        Boolean incluidoNoPlano = true;
        Double notaDoFilme = 8.1;

        Double media = (8.1 + 9.8 + 9.9) / 3;
        System.out.println(media);

        String sinopse = """
                Filme de super heroi de ação e aventura
                filme excelente
                ano de lancamento

                """ + anoDeLancamento;
        System.out.println(sinopse);
        int classificacao = (int) (media / 2);
        System.out.println(classificacao);

    }

}
