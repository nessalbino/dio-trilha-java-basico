public class AboutMe {

    public static void main(String[] args) {

        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        // Comando para executar no CMD: java AboutMe Vanessa Albino 42 1.57
        System.out.println("Olá, eu me chamo " + nome + " " + sobrenome);
        System.out.println("Eu tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");

    }
}
