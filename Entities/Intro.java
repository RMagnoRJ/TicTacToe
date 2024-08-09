package Entities;

import java.util.Scanner;

public class Intro {
    
    public void openGame(){

        System.out.println("\n============================================");
        System.out.println( "       #  #  #  TIC TAC TOE   #   #  #      ");
        System.out.println( "============================================\n\n");
        System.out.println( "         =========================");
        System.out.println( "          #    JOGO DA VELHA    # ");
        System.out.println( "         =========================\n");
            System.out.print( "                                \n"+
                                "                                  \n"+
                                "             X   |       |        \n"+
                                "          ----------------------- \n"+
                                "                 |   X   |        \n"+
                                "          ----------------------- \n"+
                                "                 |       |   X    \n"+
                                "                                  \n");
    }

    public void gameIntro(){
            @SuppressWarnings("resource")
            Scanner inn = new Scanner (System.in);
            @SuppressWarnings("unused")
            String wait = "";
            System.out.println("\n\n\n============================================");
            System.out.println( "       #  #  #  TIC TAC TOE   #  #  #       ");
            System.out.println( "============================================\n\n\n");
            System.out.println("         =========================");
            System.out.println("                  TABULEIRO       ");
            System.out.println("         =========================\n");
            System.out.print(    "             A       B       C    \n"+
                                 "         -------------------------\n"+
                                 "      1  |  A 1  |  B 1  |  C 1  |\n"+
                                 "         -------------------------\n"+
                                 "      2  |  A 2  |  B 2  |  C 2  |\n"+
                                 "         -------------------------\n"+
                                 "      3  |  A 3  |  B 3  |  C 3  |\n"+
                                 "         -------------------------\n");
            System.out.println("\n\n============================================\n");
            System.out.print("Pressione qualquer tecla para continuar...\n"+
            "> ");
            wait = inn.nextLine();
            System.out.println("\n\n============================================");
            System.out.println( "         #  #  #  OBJETIVO  #  #  #         ");
            System.out.println( "============================================\n");
            System.out.println("Fazer uma linha vertical, horizontal ou\n" +
                               "diagonal utilizando o mesmo ÍCONE no \n"+
                               "tabuleiro.\n");
                               
            System.out.println("         =========================");
            System.out.println("                  TABULEIRO       ");
            System.out.println("         =========================\n");
            System.out.print(    "             A       B       C    \n"+
                                 "                                  \n"+
                                 "      1      X   |       |        \n"+
                                 "          ----------------------- \n"+
                                 "      2          |   X   |        \n"+
                                 "          ----------------------- \n"+
                                 "      3          |       |   X    \n"+
                                 "                                  \n");
            System.out.println("\n============================================");
            System.out.print("\nPressione qualquer tecla para continuar...\n"+
            "> ");
            wait = inn.nextLine();
            System.out.println("\n         =========================");
            System.out.println("                  TABULEIRO       ");
            System.out.println("         =========================\n");
            System.out.print(    "             A       B       C    \n"+
                                 "                                  \n"+
                                 "      1          |       |        \n"+
                                 "          ----------------------- \n"+
                                 "      2      O   |   O   |   O    \n"+
                                 "          ----------------------- \n"+
                                 "      3          |       |        \n"+
                                 "                                  \n");
            System.out.println("\n============================================\n");
    }
}
