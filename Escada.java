import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Escada{
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    List<String> niveis = new ArrayList<>();

    System.out.print("Digite a quantidade de vezes: ");
    int quantidade = sc.nextInt();

    for (int i = 0; i < quantidade; i++) {
        niveis.add(" ".repeat(quantidade - i) + "*".repeat(i + 1));
    }

    for (String escada : niveis ) {
        System.out.println(escada);
    }
    }
}
