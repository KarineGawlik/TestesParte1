import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Karine", "Feminino"),
                new Pessoa("Maycon", "Masculino"),
                new Pessoa("Lucille", "Feminino"),
                new Pessoa("Ravenna", "Feminino"),
                new Pessoa("Marcos", "Masculino"),
                new Pessoa("João", "Masculino"),
                new Pessoa("Leandro", "Masculino"),
                new Pessoa("Luiza", "Feminino"),
                new Pessoa("Bela", "Feminino"),
                new Pessoa("Cintia", "Feminino")
        );

        // Lista completa
        List<Pessoa> listaCompleta = pessoas.stream()
                .collect(Collectors.toList());
        System.out.print("LISTA COMPLETA: \n");
        listaCompleta.forEach(System.out::println);

        // Quantidade de pessoas na lista
        long quantidadeDePessoas = pessoas.stream()
                .map(Pessoa::getNome)
                .count();
        System.out.println("\nQuantidade de pessoas na lista: " + quantidadeDePessoas + "\n\n");

        // Filtrar apenas mulheres
        List<Pessoa> mulheres = pessoas.stream()
                .filter(pessoa -> pessoa.getSexo().equalsIgnoreCase("Feminino"))
                .collect(Collectors.toList());
        System.out.println("LISTA DE MULHERES: ");
        mulheres.forEach(System.out::println);

        // Filtrar apenas homens
        List<Pessoa> homens = pessoas.stream()
                .filter(pessoa -> pessoa.getSexo().equalsIgnoreCase("Masculino"))
                .collect(Collectors.toList());
        System.out.println("\n\nLISTA DE HOMENS: ");
        homens.forEach(System.out::println);
    }
}
