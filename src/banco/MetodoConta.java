package banco;

import java.util.Scanner;

public class MetodoConta {
    int opcao, varOpcoes, varSair, voltaMenuAnterior;
    Scanner input = new Scanner(System.in);

    public void primeiroMenu() {
        System.out.println("=============================");
        System.out.println("         BANKTORAMA");
        System.out.println("-----------------------------");
        System.out.println("----------------------");
        System.out.println("Escolha uma conta:");
        System.out.println("Conta corrente     [1]");
        System.out.println("Conta poupaça      [2]");
        System.out.println("Conta salario      [3]");
        System.out.println("Sair do apricativo [9]");
        System.out.println("-----------------");
        System.out.println("Digite uma opção:");
        System.out.print("-> ");
    }

    public void segundoMenu() {
        System.out.println("----------------------");
        System.out.println("Para saldo         [1]");
        System.out.println("Para saque         [2]");
        System.out.println("Para deposito      [3]");
        System.out.println("Menu principal     [4]");
        System.out.println("Sair do aplicativo [9]");
        System.out.println("-----------------");
        System.out.println("Digite uma opção:");
        System.out.print("-> ");
    }

    //É usado para sair do apicativo ou ir para o menu principal.
    public void sairDoAplicativo() {
        varOpcoes = input.nextInt();
        if(varOpcoes == 9) { //Sair do aplicativo
            opcao = varOpcoes;
        }else if(varOpcoes == 4){ //Retorna ao menu anterior
            opcao = varOpcoes;
        }
    }

    public void chamaMenuPricipal() {
        System.out.println("Menu anterior      [1]");
        System.out.println("Menu principal     [2]");
        System.out.println("Sair do apricativo [9]");
        System.out.println("-----------------");
        System.out.println("Digite uma opção:");
        System.out.print("-> ");
        varSair = input.nextInt();
        voltaMenuAnterior = varSair;
        if(varSair == 2){ //Vai para o menu pricipal.
            opcao = 4;
        }else if(varSair == 9){ //Sai do aplicativo.
            opcao = 9;
        }
    }
}
