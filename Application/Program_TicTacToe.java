package Application;
import java.util.Random;
import java.util.Scanner;

public class Program_TicTacToe {
    
    public static void main(String[] args) throws InterruptedException {
        // TIC TAC TOE = Jogo da velha
        Scanner inn = new Scanner (System.in);
        String [][] game = new String[3][3];
        game[0][0] = "   "; game[0][1] = "   "; game[0][2] = "   ";
        game[1][0] = "   "; game[1][1] = "   "; game[1][2] = "   ";
        game[2][0] = "   "; game[2][1] = "   "; game[2][2] = "   ";
        String [][] modelo = new String[3][3];
        modelo [0][0] = "A 1"; modelo [0][1] = "B 1"; modelo [0][2] = "C 1";
        modelo [1][0] = "A 2"; modelo [1][1] = "B 2"; modelo [1][2] = "C 2";
        modelo [2][0] = "A 3"; modelo [2][1] = "B 3"; modelo [2][2] = "C 3";
        Random sorteio = new Random();
        String player_1 = "";
        String player_2 = "";
        String name="";
        String player1_move = "   ";
        String player2_move = "   ";
        Boolean player1_on = true;
        int move = 0;
        int human = -1;
        int num=-1;
        String pc = "   ";
        int op;
        boolean on = true;
        @SuppressWarnings("unused")
        String wait = "";
        boolean gameover = false;
        boolean gameover_1 = false;
        boolean gameover_2 = false;
        @SuppressWarnings("unused")
        boolean menu = true;
        int jogadas = 0;
        int cont = 0;
        boolean end_game = false;
        // MENU BEGIN
        while (menu = true){

            // = OPENGAME > INTRO
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
                                  
            System.out.println("\n\n============================================");
            System.out.print(   "|                   MENU                   |\n"+
                                "============================================\n\n"+
                                "\t    Digite uma opção:\n\n"+
                                "\t[1] Ler as regras do jogo\n"+
                                "\t[2] Jogador vs Jogador\n"+
                                "\t[3] Jogador vs Computador\n"+
                                "\t[4] Encerrar o jogo\n\n"+
                                "\t> ");
            op = inn.nextInt(); inn.nextLine();
            if (op == 4){
                menu = false;
                System.out.println( "\n============================================\n");    
                break;
            }
            // GAME INTRO
            if (op  == 1){

                // GAMEINTRO > INTRO
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
            
            System.out.print("Pressione qualquer tecla para continuar...\n"+
            "> ");
            wait = inn.nextLine();
            continue;
            }

            // GAME BEGIN
            switch (op) {
                case 2:


                    /*
                     * =================================================
                     * ================================================
                     *               JOGADOR VS JOGADOR
                     *                  SINGLE PLAYER
                     * ================================================
                     * =================================================
                     */



                    jogadas = 0;
                    on = true;
                    player1_on = true;
                    System.out.println("\n============================================\n");
                    System.out.println(    "\t  Você está no MODO VS\n\n"+
                                            "          Jogador\n"+ 
                                            "                 CONTRA\n"+ 
                                            "                       Jogador");
                    System.out.println("\n============================================\n");

                    
                    System.out.print("Digite o nome do PLAYER 1: ");
                    player_1 = inn.nextLine().toUpperCase();
                    System.out.print("\nDigite o nome do PLAYER 2: ");
                    player_2 = inn.nextLine().toUpperCase();
                    op = 0;
                    System.out.println("\n============================================\n");
                    System.out.print(      player_1 + " escolha o ÍCONE para suas jogadas:\n\n"+
                                          "\t[1] X           [2] O \n"+
                                          "\n> ");
                    op = inn.nextInt(); inn.nextLine();
                    System.out.println("\n============================================\n");
                    if (op == 1){
                        player1_move = " X ";
                        player2_move = " O ";
                    } else {
                        player1_move = " O ";
                        player2_move = " X ";
                    }
                    System.out.println("Player 1: " + player_1  + " => " + player1_move);
                    System.out.println("\nPlayer 2: " + player_2  + " => " + player2_move);
                    System.out.println("\n============================================\n");
                    System.out.print("Pressione qualquer tecla para continuar...\n"+
                    "> ");
                    wait = inn.nextLine();

                    System.out.println("\n============================================");
                    System.out.println( "       #  #  #  VAMOS JOGAR   #   #  #      ");
                    System.out.println( "============================================\n\n");
                    
                    while (on){
                        
                        if (player1_on == true){
                            System.out.printf("%s, faça sua jogada!%n",player_1);
                            name = player_1;
                            
                        } else {
                            System.out.printf("%s, faça sua jogada!%n",player_2);
                            name = player_2;
                        }
                        
                        System.out.print("\n\t      ==============\n"+ 
                                         "\t      MENU DE JOGADA\n"+
                                         "\t      ==============\n"+
                                         "\nEscolha o número equivalente à jogada \n"+
                                         "que deseja fazer:\n\n");
                        cont = 0;
                        for (int i = 0; i < game.length; i++){
            
                            if (i == 1 || i == 2){
                                System.out.println("   ---------------------------------------");
                            }
                            System.out.print("    ");
                            for (int j = 0; j < game[i].length; j++){
                                if (j == 1 || j == 2){
                                    System.out.print("|");
                                }
                                if (game[i][j] == "   "){
                                    System.out.print(" [" + (cont + 1) + "]  " + modelo[i][j] + "   ");
                                } else {
                                    System.out.print(" [" + (cont + 1) + "]  " + game[i][j] + "   ");
                                }
                                cont++;
                            } System.out.println();
                        }
                        System.out.print("\n> ");
                        move = inn.nextInt(); inn.nextLine();
                        while (move <= 0 || move > 9){
                            System.out.print(
                                "\n===============================\n"+
                                "   #  #  #  ATENÇÃO  #  #  #   \n"+
                                "\n===============================\n"+
                                "Esse número não equivale à uma\n"+
                                "posição no tabuleiro, por favor,\n"+
                                "tente novamente um número entre \n"+
                                "[1] e [9]: \n"+
                                "> ");
                            move = inn.nextInt(); inn.nextLine();
                        }
                        switch (move) {
                            case 1:
                                if (player1_on == true){
                                    game[0][0] = player1_move;
                                    player1_on = false;
                                    
                                } else {
                                    game[0][0] = player2_move;
                                    player1_on = true;
                                    
                                }
                                break;
                            
                            case 2:
                                if (player1_on == true){
                                    game[0][1] = player1_move;
                                    player1_on = false;
                                    
                                } else {
                                    game[0][1] = player2_move;
                                    player1_on = true;
                                }
                                break;

                            case 3:
                                if (player1_on == true){
                                    game[0][2] = player1_move;
                                    player1_on = false;
                                } else {
                                    game[0][2] = player2_move;
                                    player1_on = true;
                                }
                                break;

                            case 4:
                                if (player1_on == true){
                                    game[1][0] = player1_move;
                                    player1_on = false;
                                } else {
                                    game[1][0] = player2_move;
                                    player1_on = true;
                                }
                                break;

                            case 5:
                                if (player1_on == true){
                                    game[1][1] = player1_move;
                                    player1_on = false;
                                } else {
                                    game[1][1] = player2_move;
                                    player1_on = true;
                                }
                                break;

                            case 6:
                                if (player1_on == true){
                                    game[1][2] = player1_move;
                                    player1_on = false;
                                } else {
                                    game[1][2] = player2_move;
                                    player1_on = true;
                                }
                                break;

                            case 7:
                                if (player1_on == true){
                                    game[2][0] = player1_move;
                                    player1_on = false;
                                } else {
                                    game[2][0] = player2_move;
                                    player1_on = true;
                                }
                                break;

                            case 8:
                                if (player1_on == true){
                                    game[2][1] = player1_move;
                                    player1_on = false;
                                } else {
                                    game[2][1] = player2_move;
                                    player1_on = true;
                                }
                                break;

                            case 9:
                                if (player1_on == true){
                                    game[2][2] = player1_move;
                                    player1_on = false;
                                } else {
                                    game[2][2] = player2_move;
                                    player1_on = true;
                                }
                                break;
                        }
                        
                        System.out.println("\n\n============================================");
                        System.out.println(    "    "+ name + ",");
                        System.out.println(    "    essa foi a sua jogada!");
                        System.out.println(  "============================================\n");
                        cont = 0;
                        for (int i = 0; i < game.length; i++){
                            if (i == 1 || i == 2){
                                System.out.println("          ----------------------- ");
                            }
                            System.out.print("          ");
                            for (int j = 0; j < game[i].length; j++){
                                // JOGADAS END GAME
                                if(game[0][0] == " X " && game[0][1] == " X " && game[0][2] == " X "){
                                    on = false;
                                    gameover = true;
                                } else if (game[0][0] == " O " && game[0][1] == " O " && game[0][2] == " O "){
                                    on = false;
                                    gameover = true;
                                } else if (game[1][0] == " X " && game[1][1] == " X " && game[1][2] == " X "){
                                    on = false;
                                    gameover = true;
                                } else if (game[1][0] == " O " && game[1][1] == " O " && game[1][2] == " O "){
                                    on = false;
                                    gameover = true;
                                } else if (game[2][0] == " X " && game[2][1] == " X " && game[2][2] == " X "){
                                    on = false;
                                    gameover = true;
                                } else if (game[2][0] == " O " && game[2][1] == " O " && game[2][2] == " O "){
                                    on = false;
                                    gameover = true;
                                } else if (game[0][0] == " X " && game[1][0] == " X " && game[2][0] == " X "){
                                    on = false;
                                    gameover = true;
                                } else if (game[0][0] == " O " && game[1][0] == " O " && game[2][0] == " O "){
                                    on = false;
                                    gameover = true;
                                } else if (game[0][1] == " X " && game[1][1] == " X " && game[2][1] == " X "){
                                    on = false;
                                    gameover = true;
                                } else if (game[0][1] == " O " && game[1][1] == " O " && game[2][1] == " O "){
                                    on = false;
                                    gameover = true;
                                } else if (game[0][2] == " X " && game[1][2] == " X " && game[2][2] == " X "){
                                    on = false;
                                    gameover = true;
                                } else if (game[0][2] == " O " && game[1][2] == " O " && game[2][2] == " O "){
                                    on = false;
                                    gameover = true;
                                } else if (game[0][0] == " X " && game[1][1] == " X " && game[2][2] == " X "){
                                    on = false;
                                    gameover = true;
                                } else if (game[0][0] == " O " && game[1][1] == " O " && game[2][2] == " O "){
                                    on = false;
                                    gameover = true;
                                } else if (game[0][2] == " X " && game[1][1] == " X " && game[2][0] == " X "){
                                    on = false;
                                    gameover = true;
                                } else if (game[0][2] == " O " && game[1][1] == " O " && game[2][0] == " O "){
                                    on = false;
                                    gameover = true;
                                }
                                // TIC TAC TOE DESIGN
                                if (j == 1 || j == 2){
                                    System.out.print("|");
                                }
                                System.out.print("  " + game[i][j] + "  ");
                            } System.out.println();
                        }
                        jogadas += 1;
                        if (jogadas == 9){
                            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");    
                            System.out.println("\t   Ahhh... que pena!\n" +
                                            "\t Não houve um vencedor.\n" +
                                            "\tO jogo terminou EMPATADO!\n\n"+
                                            "\t >>> TENTE NOVAMENTE <<<" );
                            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                            on = false;
                        }
                        System.out.println("\n============================================");
                        System.out.print(    "Pressione qualquer tecla para continuar...\n"+
                        "> ");
                        wait = inn.nextLine();
                        System.out.println("============================================\n");
                        
                        
                    }
                    if (gameover == true){
                        System.out.println("\n\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                        System.out.print(    "     PARABÉNS, " + name +"!\n" +
                                             "            Você conquistou o objetivo!\n");
                        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n\n");
                        for (int i = 0; i < game.length; i++){
                            if (i == 1 || i == 2){
                                System.out.println("          ----------------------- ");
                            }
                            System.out.print("          ");
                            for (int j = 0; j < game[i].length; j++){
                                if (j == 1 || j == 2){
                                    System.out.print("|");
                                }
                                System.out.print("  " + game[i][j] + "  ");                        
                            } System.out.println();
                        }
                        
                    }
                    
                    System.out.println("\n\n\n\t      =============");
                    System.out.println("\t      > GAME OVER <");
                    System.out.println("\t      =============\n");
                    System.out.println("\n\n============================================");
                    System.out.print(    "Pressione qualquer tecla para continuar...\n"+
                    "> ");
                    wait = inn.nextLine();
                    System.out.println("============================================\n");
                    if (on == false){
                        for (int i = 0; i < game.length; i++){
                            for (int j = 0; j < game[i].length; j++){
                                game[i][j] = "   ";
                            }
                        }
                    }
                    break;

                    /*
                     * =================================================
                     * 
                     * ================================================
                     *               JOGADOR VS MACHINE
                     * 
                     * ================================================
                     * 
                     * =================================================
                     */



                case 3:
                    // JOGADOR VS MACHINE
                    jogadas = 0;
                    player_1 = "";
                    on = true;
                    end_game = false;
                    gameover_1 = false;
                    gameover_2 = false;
                    System.out.println("\n============================================\n");
                    System.out.println(    "           Você escolheu o modo\n"+
                                        "               Single Player\n"+
                                        "\n         Jogador \n"+
                                        "                contra\n"+
                                        "                      Computador");
                    System.out.println("\n============================================\n");
                    System.out.print("Digite o nome do Jogador: ");
                    player_1 = inn.nextLine().toUpperCase();
                    player_2 = "COMPUTADOR";
                    op = 0;
                    System.out.println("\n============================================\n");
                    System.out.print(      "Escolha o ÍCONE das jogadas para o Jogador:\n\n"+
                                        "[1] X \n"+
                                        "[2] O \n"+
                                        "\n> ");
                    op = inn.nextInt(); inn.nextLine();
                    System.out.println("\n============================================\n");
                    if (op == 1){
                        player1_move = " X ";
                        pc = " O ";
                    } else {
                        player1_move = " O ";
                        pc = " X ";
                    }
                    System.out.println("Jogador => " + player1_move);
                    System.out.println("Computador => " + pc);
                    System.out.println("\n============================================\n");
                    System.out.print("Pressione qualquer tecla para continuar...\n"+
                    "> ");
                    wait = inn.nextLine();
                                 
                    System.out.println("\n============================================");
                    System.out.println( "       #  #  #  VAMOS JOGAR   #   #  #      ");
                    System.out.println( "============================================\n\n");
                    
                    
                    while (on){
                        
                        //==========================
                        //     PLAYER'S TURN
                        //==========================

                        if (gameover_2 == false){

                            System.out.printf("%s, faça sua jogada!%n", player_1);

                            System.out.print("\n\t      ==============\n"+ 
                                         "\t      MENU DE JOGADA\n"+
                                         "\t      ==============\n"+
                                         "\nEscolha o número equivalente à jogada \n"+
                                         "que deseja fazer:\n\n");
                            cont = 0;
                            for (int i = 0; i < game.length; i++){
            
                                if (i == 1 || i == 2){
                                    System.out.println("   ---------------------------------------");
                                }
                                System.out.print("    ");
                                for (int j = 0; j < game[i].length; j++){
                                    if (j == 1 || j == 2){
                                        System.out.print("|");
                                    }
                                    if (game[i][j] == "   "){
                                        System.out.print(" [" + (cont + 1) + "]  " + modelo[i][j] + "   ");
                                    } else {
                                        System.out.print(" [" + (cont + 1) + "]  " + game[i][j] + "   ");
                                    }
                                    cont++;
                                } System.out.println();
                            }
                            System.out.print("\n> ");
                            move = inn.nextInt(); inn.nextLine();
                            while (move <= 0 || move > 9){
                                System.out.print(
                                    "\n===============================\n"+
                                    "   #  #  #  ATENÇÃO  #  #  #   \n"+
                                    "\n===============================\n"+
                                    "Esse número não equivale à uma\n"+
                                    "posição no tabuleiro, por favor,\n"+
                                    "tente novamente um número entre \n"+
                                    "[1] e [9]: \n"+
                                    "> ");
                                move = inn.nextInt(); inn.nextLine();
                            }
                            switch (move) {
                                case 1:
                                    game[0][0] = player1_move;
                                    human = 1;
                                    break;
                                
                                case 2:
                                    game[0][1] = player1_move;
                                    human = 2;
                                    break;

                                case 3:
                                    game[0][2] = player1_move;
                                    human = 3;
                                    break;

                                case 4:
                                    game[1][0] = player1_move;
                                    human = 4;
                                    break;

                                case 5:
                                    game[1][1] = player1_move;
                                    human = 5;
                                    break;

                                case 6:
                                    game[1][2] = player1_move;
                                    human = 6;
                                    break;

                                case 7:
                                    game[2][0] = player1_move;
                                    human = 7;
                                    break;

                                case 8:
                                    game[2][1] = player1_move;
                                    human = 8;
                                    break;

                                case 9:
                                    game[2][2] = player1_move;
                                    human = 9;
                                    break;
                            }
                            
                            System.out.println("\n\n============================================");
                            System.out.println(    "    "+ player_1 + ",");
                            System.out.println(    "    essa foi a sua jogada!");
                            System.out.println(  "============================================\n");
                            cont = 0;
                            for (int i = 0; i < game.length; i++){
                                if (i == 1 || i == 2){
                                    System.out.println("          ----------------------- ");
                                }
                                System.out.print("          ");
                                for (int j = 0; j < game[i].length; j++){
                                    // JOGADAS END GAME
                                    if(game[0][0] == " X " && game[0][1] == " X " && game[0][2] == " X "){
                                        on = false;
                                        gameover_1 = true;
                                        end_game = true;
                                    } else if (game[0][0] == " O " && game[0][1] == " O " && game[0][2] == " O "){
                                        on = false;
                                        gameover_1 = true;
                                        end_game = true;
                                    } else if (game[1][0] == " X " && game[1][1] == " X " && game[1][2] == " X "){
                                        on = false;
                                        gameover_1 = true;
                                        end_game = true;
                                    } else if (game[1][0] == " O " && game[1][1] == " O " && game[1][2] == " O "){
                                        on = false;
                                        gameover_1 = true;
                                        end_game = true;
                                    } else if (game[2][0] == " X " && game[2][1] == " X " && game[2][2] == " X "){
                                        on = false;
                                        gameover_1 = true;
                                        end_game = true;
                                    } else if (game[2][0] == " O " && game[2][1] == " O " && game[2][2] == " O "){
                                        on = false;
                                        gameover_1 = true;
                                        end_game = true;
                                    } else if (game[0][0] == " X " && game[1][0] == " X " && game[2][0] == " X "){
                                        on = false;
                                        gameover_1 = true;
                                        end_game = true;
                                    } else if (game[0][0] == " O " && game[1][0] == " O " && game[2][0] == " O "){
                                        on = false;
                                        gameover_1 = true;
                                        end_game = true;
                                    } else if (game[0][1] == " X " && game[1][1] == " X " && game[2][1] == " X "){
                                        on = false;
                                        gameover_1 = true;
                                        end_game = true;
                                    } else if (game[0][1] == " O " && game[1][1] == " O " && game[2][1] == " O "){
                                        on = false;
                                        gameover_1 = true;
                                        end_game = true;
                                    } else if (game[0][2] == " X " && game[1][2] == " X " && game[2][2] == " X "){
                                        on = false;
                                        gameover_1 = true;
                                        end_game = true;
                                    } else if (game[0][2] == " O " && game[1][2] == " O " && game[2][2] == " O "){
                                        on = false;
                                        gameover_1 = true;
                                        end_game = true;
                                    } else if (game[0][0] == " X " && game[1][1] == " X " && game[2][2] == " X "){
                                        on = false;
                                        gameover_1 = true;
                                        end_game = true;
                                    } else if (game[0][0] == " O " && game[1][1] == " O " && game[2][2] == " O "){
                                        on = false;
                                        gameover_1 = true;
                                        end_game = true;
                                    } else if (game[0][2] == " X " && game[1][1] == " X " && game[2][0] == " X "){
                                        on = false;
                                        gameover_1 = true;
                                        end_game = true;
                                    } else if (game[0][2] == " O " && game[1][1] == " O " && game[2][0] == " O "){
                                        on = false;
                                        gameover_1 = true;
                                        end_game = true;
                                    }
                                    // TIC TAC TOE DESIGN
                                    if (j == 1 || j == 2){
                                        System.out.print("|");
                                    }
                                    System.out.print("  " + game[i][j] + "  ");
                                } System.out.println();
                            }
                            jogadas += 1;
                            if (jogadas == 9){
                                end_game = true;
                            }
                            System.out.println("\n============================================");
                            System.out.print(    "Pressione qualquer tecla para continuar...\n"+
                            "> ");
                            wait = inn.nextLine();
                            System.out.println("============================================\n");
                        }

                        //==========================
                        //     MACHINE'S TURN
                        //==========================

                        if (gameover_1 == false && end_game == false){

                            System.out.println("O COMPUTADOR irá fazer a jogada!");
                            boolean pc_on = true;

                            // Delay time
                            System.out.println("\n============================================\n");
                            System.out.print("O computador está pensando");
                            Thread.sleep(1000);
                            System.out.print(".");
                            Thread.sleep(1000);
                            System.out.print(".");
                            Thread.sleep(1000);
                            System.out.print(".");


                            // Machine Algorithm

                            switch (human) {
                                case 1:
                                    if(game[0][1] == player1_move && game[0][2] == "   "){
                                        game[0][2] = pc;
                                        // 1-2-3
                                    } else if ( game[1][0] == player1_move && game[2][0] == "   "){
                                        game[2][0] = pc;
                                        // 1-4-7
                                    } else if ( game[1][1] == player1_move && game[2][2] == "   "){
                                        game[2][2] = pc;
                                        // 1-5-9
                                    } else if ( game[0][2] == player1_move && game[0][1] == "   " ){
                                        game[0][1] = pc;
                                        // 1*2*3
                                    } else if ( game[2][2] == player1_move && game[1][1] == "   " ){
                                        game[1][1] = pc;
                                        // 1*5*9
                                    } else if ( game[2][0] == player1_move && game[1][0] == "   " ){
                                        game[1][0] = pc;
                                        // 1*4*7
                                    } else {
                                        pc_on = true;
                                        while (pc_on == true){
                                            for (int s = 0; s < 3; s++){
                                                num = sorteio.nextInt(0,16);
                                            }
                                            if (num == 4 && game[0][1] == "   "){
                                                game[0][1] = pc;
                                                pc_on = false;
                                            } else if (num == 8 && game[1][0] == "   "){
                                                game[1][0] = pc;
                                                pc_on = false;
                                            } else if (num == 12 && game[1][1] == "   "){
                                                game[1][1] = pc;
                                                pc_on = false;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    if(game[0][0] == player1_move&& game[0][2] == "   "){
                                        game[0][2] = pc;
                                        // 2-1-3
                                    } else if ( game[1][1] == player1_move && game[2][1] == "   "){
                                        game[2][1] = pc;
                                        // 2-5-8
                                    } else if ( game[0][2] == player1_move && game[0][0] == "   "){
                                        game[0][0] = pc;
                                        // 2-3-1
                                    } else if ( game[2][1] == player1_move && game[1][1] == "   " ){
                                        game[1][1] = pc;
                                        // 2*5*8
                                    } else {
                                        pc_on = true;
                                        while (pc_on == true){
                                            for (int s = 0; s < 3; s++){
                                                num = sorteio.nextInt(0,16);
                                            }
                                            if (num == 4 && game[0][0] == "   "){
                                                game[0][0] = pc;
                                                pc_on = false;
                                            } else if (num == 8 && game[0][2] == "   "){
                                                game[0][2] = pc;
                                                pc_on = false;
                                            } else if (num == 12 && game[1][1] == "   "){
                                                game[1][1] = pc;
                                                pc_on = false;
                                            }
                                        }
                                    } 
                                    break;
                                case 3:
                                    if(game[0][1] == player1_move && game[0][0] == "   "){
                                        game[0][0] = pc;
                                        // 3-2-1
                                    } else if ( game[1][1] == player1_move && game[2][0] == "   " ){
                                        game[2][0] = pc;
                                        // 3-5-7
                                    } else if ( game[1][2] == player1_move && game[2][2] == "   "){
                                        game[2][2] = pc;
                                        // 3-6-9
                                    } else if ( game[0][0] == player1_move && game[0][1] == "   " ){
                                        game[0][1] = pc;
                                        // 3*2*1
                                    } else if ( game[2][0] == player1_move && game[1][1] == "   " ){
                                        game[1][1] = pc;
                                        // 3*5*7
                                    } else if ( game[2][2] == player1_move && game[1][2] == "   " ){
                                        game[1][2] = pc;
                                        // 3*6*9
                                    } else {
                                        pc_on = true;
                                        while (pc_on == true){
                                            for (int s = 0; s < 3; s++){
                                                num = sorteio.nextInt(0,16);
                                            }
                                            if (num == 4 && game[0][1] == "   "){
                                                game[0][1] = pc;
                                                pc_on = false;
                                            } else if (num == 8 && game[1][2] == "   "){
                                                game[1][2] = pc;
                                                pc_on = false;
                                            } else if (num == 12 && game[1][1] == "   "){
                                                game[1][1] = pc;
                                                pc_on = false;
                                            }
                                        }
                                    }
                                    break;
                                case 4:
                                    if (game[0][0] == player1_move && game[2][0] == "   "){
                                        game[2][0] = pc;
                                        // 4-1-7
                                    } else if ( game[1][1] == player1_move && game[1][2] == "   "){
                                        game[1][2] = pc;
                                        // 4-5-6
                                    } else if ( game[2][0] == player1_move && game[0][0] == "   "){
                                        game[0][0] = pc;
                                        // 4-7-1
                                    } else if ( game[1][2] == player1_move && game[1][1] == "   " ){
                                        game[1][1] = pc;
                                        // 4*5*6
                                    } else {
                                        pc_on = true;
                                        while (pc_on == true){
                                            for (int s = 0; s < 3; s++){
                                                num = sorteio.nextInt(0,16);
                                            }
                                            if (num == 4 && game[0][0] == "   "){
                                                game[0][0] = pc;
                                                pc_on = false;
                                            } else if (num == 8 && game[2][0] == "   "){
                                                game[2][0] = pc;
                                                pc_on = false;
                                            } else if (num == 12 && game[1][1] == "   "){
                                                game[1][1] = pc;
                                                pc_on = false;
                                            }
                                        }
                                    }
                                    break;
                                case 5:
                                    if (game[0][1] == player1_move && game[2][1] == "   "){
                                        game[2][1] = pc;
                                        // 5-2-8
                                    } else if ( game[2][1] == player1_move && game[0][1] == "   "){
                                        game[0][1] = pc;
                                        // 5-8-2
                                    } else if ( game[0][2] == player1_move && game[2][0] == "   "){
                                        game[2][0] = pc;
                                        // 5-3-7
                                    } else if ( game[2][0] == player1_move && game[0][2] == "   "){
                                        game[0][2] = pc;
                                        // 5-7-3
                                    } else if ( game[0][0] == player1_move && game[2][2] == "   "){
                                        game[2][2] = pc;
                                        // 5-1-9
                                    } else if ( game[2][2] == player1_move && game[0][0] == "   "){
                                        game[0][0] = pc;
                                        // 5-9-1
                                    } else if ( game[1][0] == player1_move && game[1][2] == "   " ){
                                        game[1][2] = pc;
                                        // 5-4-6
                                    } else if ( game[1][2] == player1_move && game[1][0] == "   " ){
                                        game[1][0] = pc;
                                        // 5*4*6
                                    } else {
                                        pc_on = true;
                                        while (pc_on == true){
                                            for (int s = 0; s < 3; s++){
                                                num = sorteio.nextInt(0,46);
                                            }
                                            if (num == 4 && game[0][1] == "   "){
                                                game[0][1] = pc;
                                                pc_on = false;
                                            } else if (num == 8 && game[1][0] == "   "){
                                                game[1][0] = pc;
                                                pc_on = false;
                                            } else if (num == 12 && game[1][1] == "   "){
                                                game[1][1] = pc;
                                                pc_on = false;
                                            } else if (num == 18 && game[0][2] == "   "){
                                                game[0][2] = pc;
                                                pc_on = false;
                                            } else if (num == 24 && game[1][2] == "   "){
                                                game[1][2] = pc;
                                                pc_on = false;
                                            } else if (num == 30 && game[2][0] == "   "){
                                                game[2][0] = pc;
                                                pc_on = false;
                                            } else if (num == 36 && game[2][1] == "   "){
                                                game[2][1] = pc;
                                                pc_on = false;
                                            } else if (num == 42 && game[2][2] == "   "){
                                                game[2][2] = pc;
                                                pc_on = false;
                                            }
                                        }
                                    }
                                    break;
                                case 6:
                                    if (game[0][2] == player1_move && game[2][2] == "   "){
                                        game[2][2] = pc;
                                        // 6-3-9
                                    } else if ( game[2][2] == player1_move && game[0][2] == "   "){
                                        game[0][2] = pc;
                                        // 6-9-3
                                    } else if ( game[1][1] == player1_move && game[1][0] == "   "){
                                        game[1][0] = pc;
                                        // 6-5-4
                                    } else if ( game[1][0] == player1_move && game[1][1] == "   " ){
                                        game[1][1] = pc;
                                        // 6*5*4
                                    } else {
                                        pc_on = true;
                                        while (pc_on == true){
                                            for (int s = 0; s < 3; s++){
                                                num = sorteio.nextInt(0,16);
                                            }
                                            if (num == 4 && game[0][2] == "   "){
                                                game[0][2] = pc;
                                                pc_on = false;
                                            } else if (num == 8 && game[2][2] == "   "){
                                                game[2][2] = pc;
                                                pc_on = false;
                                            } else if (num == 12 && game[1][1] == "   "){
                                                game[1][1] = pc;
                                                pc_on = false;
                                            }
                                        }
                                    }
                                    break;
                                case 7:
                                    if (game[1][1] == player1_move && game[0][2] == "   "){
                                        game[0][2] = pc;
                                        // 7-5-3
                                    } else if ( game[2][1] == player1_move && game[2][2] == "   "){
                                        game[2][2] = pc;
                                        // 7-8-9
                                    } else if ( game[1][0] == player1_move && game[0][0] == "   "){
                                        game[0][0] = pc;
                                        // 7-4-1
                                    } else if ( game[0][0] == player1_move && game[1][0] == "   " ){
                                        game[1][0] = pc;
                                        // 7*4*1
                                    } else if ( game[0][2] == player1_move && game[1][1] == "   " ){
                                        game[1][1] = pc;
                                        // 7*5*3
                                    } else if ( game[2][2] == player1_move && game[2][1] == "   " ){
                                        game[2][1] = pc;
                                        // 7*8*9
                                    } else {
                                        pc_on = true;
                                        while (pc_on == true){
                                            for (int s = 0; s < 3; s++){
                                                num = sorteio.nextInt(0,16);
                                            }
                                            if (num == 4 && game[2][1] == "   "){
                                                game[2][1] = pc;
                                                pc_on = false;
                                            } else if (num == 8 && game[1][0] == "   "){
                                                game[1][0] = pc;
                                                pc_on = false;
                                            } else if (num == 12 && game[1][1] == "   "){
                                                game[1][1] = pc;
                                                pc_on = false;
                                            }
                                        }
                                    }
                                    break;
                                case 8:
                                    if (game[1][1] == player1_move && game[0][1] == "   "){
                                        game[0][1] = pc;
                                        // 8-5-2
                                    } else if ( game[2][2] == player1_move && game[2][0] == "   "){
                                        game[2][0] = pc;
                                        // 8-9-7
                                    } else if ( game[2][0] == player1_move && game[2][2] == "   "){
                                        game[2][2] = pc;
                                        // 8-7-9
                                    } else if ( game[0][1] == player1_move && game[1][1] == "   " ){
                                        game[1][1] = pc;
                                        // 8*5*2
                                    } else {
                                        pc_on = true;
                                        while (pc_on == true){
                                            for (int s = 0; s < 3; s++){
                                                num = sorteio.nextInt(0,16);
                                            }
                                            if (num == 4 && game[2][0] == "   "){
                                                game[2][0] = pc;
                                                pc_on = false;
                                            } else if (num == 8 && game[2][2] == "   "){
                                                game[2][2] = pc;
                                                pc_on = false;
                                            } else if (num == 12 && game[1][1] == "   "){
                                                game[1][1] = pc;
                                                pc_on = false;
                                            }
                                        }
                                    }
                                    break;
                                case 9:
                                    if (game[1][2] == player1_move && game[0][2] == "   "){
                                        game[0][2] = pc;
                                        // 9-6-3
                                    } else if ( game[1][1] == player1_move && game[0][0] == "   "){
                                        game[0][0] = pc;
                                        // 9-5-1
                                    } else if ( game[2][1] == player1_move && game[2][0] == "   "){
                                        game[2][0] = pc;
                                        // 9-8-7
                                    } else if ( game[0][2] == player1_move && game[1][2] == "   " ){
                                        game[1][2] = pc;
                                        // 9*6*3
                                    } else if ( game[2][0] == player1_move && game[2][1] == "   " ){
                                        game[2][1] = pc;
                                        // 9*8*7
                                    } else if ( game[0][0] == player1_move && game[1][1] == "   " ){
                                        game[1][1] = pc;
                                        // 9*5*1
                                    } else {
                                        pc_on = true;
                                        while (pc_on == true){
                                            for (int s = 0; s < 3; s++){
                                                num = sorteio.nextInt(0,16);
                                            }
                                            if (num == 4 && game[2][1] == "   "){
                                                game[2][1] = pc;
                                                pc_on = false;
                                            } else if (num == 8 && game[1][2] == "   "){
                                                game[1][2] = pc;
                                                pc_on = false;
                                            } else if (num == 12 && game[1][1] == "   "){
                                                game[1][1] = pc;
                                                pc_on = false;
                                            }
                                        }
                                    }    
                                    break;
                            }
                            System.out.println("\n\n============================================");
                            System.out.println(  "    Essa foi a jogada do COMPUTADOR!");
                            System.out.println(  "============================================\n");
                           
                            cont = 0;
                            for (int i = 0; i < game.length; i++){
                                if (i == 1 || i == 2){
                                    System.out.println("          ----------------------- ");
                                }
                                System.out.print("          ");
                                for (int j = 0; j < game[i].length; j++){
                                    // JOGADAS END GAME
                                    if(game[0][0] == " X " && game[0][1] == " X " && game[0][2] == " X "){
                                        on = false;
                                        gameover_2 = true;
                                    } else if (game[0][0] == " O " && game[0][1] == " O " && game[0][2] == " O "){
                                        on = false;
                                        gameover_2 = true;
                                    } else if (game[1][0] == " X " && game[1][1] == " X " && game[1][2] == " X "){
                                        on = false;
                                        gameover_2 = true;
                                    } else if (game[1][0] == " O " && game[1][1] == " O " && game[1][2] == " O "){
                                        on = false;
                                        gameover_2 = true;
                                    } else if (game[2][0] == " X " && game[2][1] == " X " && game[2][2] == " X "){
                                        on = false;
                                        gameover_2 = true;
                                    } else if (game[2][0] == " O " && game[2][1] == " O " && game[2][2] == " O "){
                                        on = false;
                                        gameover_2 = true;
                                    } else if (game[0][0] == " X " && game[1][0] == " X " && game[2][0] == " X "){
                                        on = false;
                                        gameover_2 = true;
                                    } else if (game[0][0] == " O " && game[1][0] == " O " && game[2][0] == " O "){
                                        on = false;
                                        gameover_2 = true;
                                    } else if (game[0][1] == " X " && game[1][1] == " X " && game[2][1] == " X "){
                                        on = false;
                                        gameover_2 = true;
                                    } else if (game[0][1] == " O " && game[1][1] == " O " && game[2][1] == " O "){
                                        on = false;
                                        gameover_2 = true;
                                    } else if (game[0][2] == " X " && game[1][2] == " X " && game[2][2] == " X "){
                                        on = false;
                                        gameover_2 = true;
                                    } else if (game[0][2] == " O " && game[1][2] == " O " && game[2][2] == " O "){
                                        on = false;
                                        gameover_2 = true;
                                    } else if (game[0][0] == " X " && game[1][1] == " X " && game[2][2] == " X "){
                                        on = false;
                                        gameover_2 = true;
                                    } else if (game[0][0] == " O " && game[1][1] == " O " && game[2][2] == " O "){
                                        on = false;
                                        gameover_2 = true;
                                    } else if (game[0][2] == " X " && game[1][1] == " X " && game[2][0] == " X "){
                                        on = false;
                                        gameover_2 = true;
                                    } else if (game[0][2] == " O " && game[1][1] == " O " && game[2][0] == " O "){
                                        on = false;
                                        gameover_2 = true;
                                    }
                                    // TIC TAC TOE DESIGN
                                    if (j == 1 || j == 2){
                                        System.out.print("|");
                                    }
                                    System.out.print("  " + game[i][j] + "  ");
                                } System.out.println();
                            }
                            jogadas += 1;
                            System.out.println("\n============================================");
                            System.out.print(    "Pressione qualquer tecla para continuar...\n"+
                            "> ");
                            wait = inn.nextLine();
                            System.out.println("============================================\n");

                        }
                        
                        if (jogadas == 9 && on == true){
                            System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");    
                            System.out.println("\t   Ahhh... que pena!\n" +
                                               "\t Não houve um vencedor.\n" +
                                               "\tO jogo terminou EMPATADO!\n\n"+
                                               "\t >>> TENTE NOVAMENTE <<<" );
                            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                            end_game = true;
                            on = false;
                            for (int i = 0; i < game.length; i++){
                                for (int j = 0; j < game[i].length; j++){
                                    game[i][j] = "   ";
                                }
                            }
                        }
                        
                    }

                    if (gameover_1 == true){
                        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                        System.out.print("\tPARABÉNS, " + player_1 + "!\n" + 
                                         "\tVocê conquistou o objetivo!");
                        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
                        for (int i = 0; i < game.length; i++){
                            if (i == 1 || i == 2){
                                System.out.println("          ----------------------- ");
                            }
                            System.out.print("          ");
                            for (int j = 0; j < game[i].length; j++){
                                if (j == 1 || j == 2){
                                    System.out.print("|");
                                }
                                System.out.print("  " + game[i][j] + "  ");                        
                            } System.out.println();
                        }
                        gameover_1 = false;
                        jogadas = 0;
                        on = true;
                        for (int i = 0; i < game.length; i++){
                            for (int j = 0; j < game[i].length; j++){
                                game[i][j] = "   ";
                            }
                        }
                    }

                    if (gameover_2 == true){
                        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                        System.out.print("\tVOCÊ PERDEU, " + player_1 + "!\n" +
                                            "\n\tO COMPUTADOR\n"+ 
                                            "\t      conquistou \n"+
                                            "\t           o objetivo!\n");
                        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                        for (int i = 0; i < game.length; i++){
                            if (i == 1 || i == 2){
                                System.out.println("          ----------------------- ");
                            }
                            System.out.print("          ");
                            for (int j = 0; j < game[i].length; j++){
                                if (j == 1 || j == 2){
                                    System.out.print("|");
                                }
                                System.out.print("  " + game[i][j] + "  ");                        
                            } System.out.println();
                        }
                        gameover_2 = false;
                        jogadas = 0;
                        on = true;
                        for (int i = 0; i < game.length; i++){
                            for (int j = 0; j < game[i].length; j++){
                                game[i][j] = "   ";
                            }
                        }
                    }
                    
                    System.out.println("\n\n\n\t      =============");
                    System.out.println("\t      > GAME OVER <");
                    System.out.println("\t      =============\n");
                    System.out.println("\n\n============================================");
                    System.out.print(    "Pressione qualquer tecla para continuar...\n"+
                    "> ");
                    wait = inn.nextLine();
                    System.out.println("============================================\n");
                    break;
        


                case 4:

                    /*
                     * =================================================
                     * 
                     * ================================================
                     * 
                     *                  ENCERRAMENTO 
                     * 
                     * ================================================
                     * 
                     * =================================================
                     */

                    // END GAME

                    menu = false;
                    break;
            }
        }
        
        
        System.out.println("\n\n\t   §§§§§§§§§§§§§§§§§§§");
        System.out.println("\t                    ");
        System.out.println("\t   >>>   THE END   <<<");
        System.out.println("\t                       ");
        System.out.println("\t   §§§§§§§§§§§§§§§§§§§");
        System.out.println("\n\n");

        inn.close();
    }
}
