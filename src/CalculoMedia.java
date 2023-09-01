public class CalculoMedia {

    public static void main(String[] args) {
        double Atividade1 = 9.5;
        double Atividade2 = 8.0;
        double Atividade3 = 6.0;
        double Atividade4 = 5.0;

        double media = (Atividade1 + Atividade2 + Atividade3 + Atividade4) / 4;

        if (media >= 7.0) {
            System.out.println("Você passou");
        } else if (media >= 5.0 && media < 7.0) {
            System.out.println("Você está de recuperação");
        } else {
            System.out.println("Você reprovou");
        }
    }
}

