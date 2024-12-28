import java.util.ArrayList;
import java.util.Scanner;
public class Contato {
    String nome;
    String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Telefone: " + telefone;
    }
}
