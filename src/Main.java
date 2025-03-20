import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos alunos serao digitados?");
        int n = sc.nextInt();
        Alunos[] vect = new Alunos[n];

        for (int i = 0; i<n; i++){
            sc.nextLine();
            System.out.println("Digite o nome, primeira e segunda nota do "+ (i+1)+ "o aluno: ");
            String name = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();

            vect[i] = new Alunos(name, nota1, nota2);
        }

        double soma = 0.0;
        double media = 0.0;
        int indice = 0;
        System.out.println("Alunos aprovados: ");
        for (int i = 0; i<n; i++){
          soma = vect[i].getNota1() + vect[i].getNota2();
          media = soma/2;

          if(media >=6.0){
              System.out.println(vect[i].getName());

          }
        }


        sc.close();
    }
}