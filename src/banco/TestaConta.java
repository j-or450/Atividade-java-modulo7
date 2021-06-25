package banco;

import java.util.Scanner;

public class TestaConta {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MetodoConta menu = new MetodoConta();

        //Construtor da conta corrente.
        ContaCorrente contCorrente = new ContaCorrente(11111, 41, 100, 500);

        //Construtor da conta poupaça.
        ContaPoupanca contPoupanca = new ContaPoupanca(33333, 41, 500, 10,  0.05);

        //Construtor da conta salario.
        ContaSalario contSalario = new ContaSalario(55555, 41, 1500, 2);

        //Mostra o primeiro menu.
        menu.primeiroMenu();

        //Capitura a opção digitada.
        menu.opcao = input.nextInt();
        for (;;) {

            //Inico do switch 1.
            switch (menu.opcao) {
                //Esse case entra na conta corrente.
                case 1:
                    System.out.println("=============================");
                    System.out.println("       CONTA CORRENTE");
                    System.out.println(contCorrente);
                    System.out.println("-----------------------------");

                    menu.segundoMenu(); //Mostra o menu sado, sacar e etc.

                    menu.sairDoAplicativo();//Captura a opção escolhida.

                    //Esse switch entra nas funcões conta corrente
                    switch (menu.varOpcoes) {
                        //Entra na fução saldo da conta corrente
                        case 1:
                            System.out.println("======================");
                            System.out.println("SALDO CONTA CORRENTE");
                            System.out.println("Saldo: " + contCorrente.getSaldo());
                            System.out.println("----------------------");
                            menu.chamaMenuPricipal();
                            break;

                        //Entre na fução saque da conta corrente
                        case 2:
                            System.out.println("======================");
                            System.out.println("SAQUE CONTA CORRENTE");
                            System.out.println("----------------------");
                            contCorrente.sacar(350);//Valor que sera sacado
                            System.out.println("----------------------");
                            menu.chamaMenuPricipal();
                            break;

                        //Entra na funcao de deposito da conta corrente.
                        case 3:
                            System.out.println("=======================");
                            System.out.println("DEPOSITO CONTA CORRENTE");
                            System.out.println("-----------------------");
                            contCorrente.depositar(250);//Valor que sera depositado
                            System.out.println("-----------------------");
                            menu.chamaMenuPricipal();
                            break;
                    }//Fim do switch da conta corrente
                    break; //Do switch 1.


                //Case do switch 1.
                //Esse case entra na conta poupaça.
                case 2:
                    System.out.println("=============================");
                    System.out.println("        CONTA POUPAÇA");
                    System.out.println(contPoupanca);
                    System.out.println("-----------------------------");

                    menu.segundoMenu(); //Mostra o menu sado, sacar e etc.

                    //Captura a opção escolhida.
                    menu.sairDoAplicativo();

                    //Esse switch entra nas fuções da conta poupaça
                    switch (menu.varOpcoes) {
                        //Entra na fução saldo da conta poupaça
                        case 1:
                            System.out.println("==============================");
                            System.out.println("SALDO CONTA POUPANÇA");
                            System.out.println("------------------------------");
                            System.out.println("Dia do aniversario da conta: "+contPoupanca.getDiaAniversario());
                            System.out.printf("Saldo: %.2f\n", contPoupanca.getSaldo());
                            System.out.println("------------------------------");
                            menu.chamaMenuPricipal();
                            break;

                        //Entre na fução saque da conta poupaça
                        case 2:
                            System.out.println("==============================");
                            System.out.println("SAQUE CONTA POUPANÇA");
                            System.out.println("------------------------------");
                            contPoupanca.sacar(350);//Valor que sera sacado
                            System.out.println("------------------------------");
                            menu.chamaMenuPricipal();
                            break;

                        //Entra na funcao de deposito da conta poupaça.
                        case 3:
                            System.out.println("=======================");
                            System.out.println("DEPOSITO CONTA POUPANÇA");
                            System.out.println("-----------------------");
                            contPoupanca.depositar(250);//Valor que sera depositado
                            System.out.println("-----------------------");
                            menu.chamaMenuPricipal();
                            break;
                    }//Fim do switch da conta poupaça
                    break; //Do switch 1


                //Case do switch 1.
                //Entra na conta salario
                case 3:
                    System.out.println("=============================");
                    System.out.println("         CONTA SALARIO");
                    System.out.println(contSalario);
                    System.out.println("-----------------------------");

                    menu.segundoMenu(); //Mostra o menu sado, sacar e etc.

                    //Captura a opção escolhida.
                    menu.sairDoAplicativo();

                    //Esse switch entra nas funcões conta salario
                    switch (menu.varOpcoes) {
                        //Entra na fução saldo da conta salario
                        case 1:
                            System.out.println("======================");
                            System.out.println("SALDO DA CONTA SALARIO");
                            System.out.println("Saldo: " + contSalario.getSaldo());
                            System.out.println("----------------------");
                            menu.chamaMenuPricipal();
                            break;

                        //Entre na fução saque da conta salario
                        case 2:
                            System.out.println("======================");
                            System.out.println("SAQUE CONTA SALARIO");
                            System.out.println("----------------------");
                            //System.out.println("Valor do saque:");
                            contSalario.sacar(350);//Valor que sera sacado
                            System.out.println("----------------------");
                            menu.chamaMenuPricipal();
                            break;

                        //Entra na funcao de deposito da conta salario.
                        case 3:
                            System.out.println("======================");
                            System.out.println("DEPOSITO CONTA SALARIO");
                            System.out.println("----------------------");
                            contSalario.depositar();
                            System.out.println("----------------------");
                            menu.chamaMenuPricipal();

                            break;
                    }
                    //Fim do switch 4.

                    break; //Do switch 1.

                //Case do switch 1.
                case 4: //Cai no menu pricipal que é o primeiro menu.
                    menu.primeiroMenu(); //Menu principal.
                    menu.opcao = input.nextInt();
                    break; //Do suitch 1.

            }// Fim do switch 1.

            if(menu.opcao == 9)break; //Finaliza o loop do for.
        }
        System.out.println("------------------------------");
        System.out.println("==============================");
        System.out.println("Obrigado por usar nosso banco!");
        System.out.println("==============================");
    }
}

