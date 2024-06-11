import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testListaSomenteComMulheres() {
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

        // Filtrar apenas mulheres
        List<Pessoa> mulheres = pessoas.stream()
                .filter(pessoa -> pessoa.getSexo().equalsIgnoreCase("Feminino"))
                .collect(Collectors.toList());

        // Verificar se a lista contém apenas mulheres
        boolean todasMulheres = mulheres.stream()
                .allMatch(pessoa -> pessoa.getSexo().equalsIgnoreCase("Feminino"));

        assertTrue(todasMulheres);
    }
}

