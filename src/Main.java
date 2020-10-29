import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] diciplinas = new String[2];
        String[] nomes = new String[2];
        // primeiro para disciplinas
        //segundo nomes
        // terceiros para notas
        double[][][] notas = new double[2][2][2];

// disciplinas
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < diciplinas.length; i++) {
            //para a disciplina
            System.out.println("Insert school subject: : " + (i + 1));
            diciplinas[i] = scanner.nextLine();

            for (int j = 0; j < nomes.length; j++) {
                //        o nome :
                System.out.println("Student name: " + (j + 1));
                nomes[j] = scanner.nextLine();

                for (int h = 0; h < notas[i][j].length; h++) {
                    //a nota são:
                    System.out.println("Grade " + (h + 1));
                    notas[i][j][h] = scanner.nextDouble();
                    scanner.nextLine();
                }
            }
        }

        double media = 0;

        for (int i = 0; i < diciplinas.length; i++){
            // disciplinas e nomes iram ser impressos em uma linha só
            for (int j = 0; j < nomes.length; j++){
                System.out.println("For School subject: " + diciplinas[i] + "the student: " + nomes[j] + " the grades are: ");

                for ( int h = 0; h < notas[i][j].length; h++) {
                    System.out.println("Grade: " + (h + 1));

                 }

            }
        }

        //        double media = 0;
//
////        para a disciplina posição 1
//        for (int i = 0; i < diciplinas.length; i++ ){
//            // mostra disciplina
//            System.out.println("School subject: " + diciplinas[i]);
//
//            for (int j = 0; j < nomes.length; i++){
//                // mostra nome
//                System.out.println("Student name: " + nomes[j]);
//
//                for(int h = 0; h < notas1.length; i++){
////                   // mostra a notas  *ver se ja mostra a media tbm
//                    System.out.println("Grade " + (i+1) + ": " + notas1[h]);
//
//                }
//                // fazer uma funcao para media e zerar ela
//            }
//        }

        // refazer o array notas

//        double total = media/notas.length;
//
//        Arrays.sort(notas);
//
//        if (total < 7 ){
//            System.out.println("Need to do another test ;/");
//
//            double min = notas[0];
//
//            System.out.println("You lowest grade is: " + min);
//
//            if (min < 28 ){
//
//                double newTotal =  media - min;
//
//                if (newTotal > 10){
//                    System.out.println("Sorry, but you are reproved! ");
//
//                } else {
//                    double notReproved =  newTotal - 28;
//                    System.out.println("You need take at least: " + notReproved + " to not be reproved");
//
//                }
//
//                System.out.println("You need take it or upper to be aproved: " + newTotal/4 );
//
//            }
//
//        } else {
//            System.out.println(" You are have approved grade ");
//        }
//
//
//
//
//        System.out.println("Mean overall grade point average: " + total);


    }
}

