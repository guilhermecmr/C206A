import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Variáveis globais
        Computador [] computadores = new Computador[50];
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        // Cliente
        Cliente jorge = new Cliente();
        jorge.nome = "Jorge Lafond";
        jorge.cpf = 585499929;

        // Hardware
        HardwareBasico i3 = new HardwareBasico();
        i3.nome = "Pentium Core i3";
        i3.capacidade = 2200;

        HardwareBasico ram8 = new HardwareBasico();
        ram8.nome = "RAM";
        ram8.capacidade = 8;

        HardwareBasico hdd500 = new HardwareBasico();
        hdd500.nome = "HD";
        hdd500.capacidade = 500;

        HardwareBasico i5 = new HardwareBasico();
        i5.nome = "Pentium Core i5";
        i5.capacidade = 3370;

        HardwareBasico ram16 = new HardwareBasico();
        ram16.nome = "RAM";
        ram16.capacidade = 16;

        HardwareBasico hdd1tb = new HardwareBasico();
        hdd1tb.nome = "HD";
        hdd1tb.capacidade = 1000;

        HardwareBasico i7 = new HardwareBasico();
        i7.nome = "Pentium Core i7";
        i7.capacidade = 4500;

        HardwareBasico ram32 = new HardwareBasico();
        ram32.nome = "RAM";
        ram32.capacidade = 32;

        HardwareBasico hdd2tb = new HardwareBasico();
        hdd2tb.nome = "HD";
        hdd2tb.capacidade = 2000;

        //OS
        SistemaOperacional ubuntu = new SistemaOperacional();
        ubuntu.nome = "Linux Ubuntu";
        ubuntu.tipo = 32;

        SistemaOperacional windows8 = new SistemaOperacional();
        windows8.nome = "Windows 8";
        windows8.tipo = 64;

        SistemaOperacional windows10 = new SistemaOperacional();
        windows10.nome = "Windows 10";
        windows10.tipo = 64;

        //Memorias USB
        MemoriaUSB pendrive16 = new MemoriaUSB();
        pendrive16.nome = "Pendrive";
        pendrive16.capacidade = 16;

        MemoriaUSB pendrive32 = new MemoriaUSB();
        pendrive32.nome = "Pendrive";
        pendrive32.capacidade = 32;

        MemoriaUSB hdExterno = new MemoriaUSB();
        hdExterno.nome = "HD externo";
        hdExterno.capacidade = 1000;

        //PCs
        Computador pcPositivo = new Computador();
        pcPositivo.marca = "Positivo";
        pcPositivo.preco = 2300;
        pcPositivo.processador = i3;
        pcPositivo.ram = ram8;
        pcPositivo.hdd = hdd500;
        pcPositivo.sistema = ubuntu;
        pcPositivo.addMemoriaUSB(pendrive16);

        Computador pcAcer = new Computador();
        pcAcer.marca = "Acer";
        pcAcer.preco = 5800;
        pcAcer.processador = i5;
        pcAcer.ram = ram16;
        pcAcer.hdd = hdd1tb;
        pcAcer.sistema = windows8;
        pcAcer.addMemoriaUSB(pendrive32);

        Computador pcVaio = new Computador();
        pcVaio.marca = "Vaio";
        pcVaio.preco = 1800;
        pcVaio.processador = i7;
        pcVaio.ram = ram32;
        pcVaio.hdd = hdd2tb;
        pcVaio.sistema = windows10;
        pcVaio.addMemoriaUSB(hdExterno);

        while (opcao != 0) {
            System.out.println("");
            System.out.println("Digite 1 para comprar PC da promoção 1.");
            System.out.println("Digite 2 para comprar PC da promoção 2.");
            System.out.println("Digite 3 para comprar PC da promoção 3.");
            System.out.println("Digite 0 para sair.");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            System.out.println("");

            switch (opcao){
                case 1:
                    for(int i = 0; i < computadores.length; i++) {
                        if(jorge.computadores[i] == null){
                            jorge.computadores[i] = pcPositivo;
                            break;
                        }
                    }
                    break;

                case 2:
                    for(int i = 0; i < computadores.length; i++) {
                        if(jorge.computadores[i] == null){
                            jorge.computadores[i] = pcAcer;
                            break;
                        }
                    }
                    break;

                case 3:
                    for(int i = 0; i < computadores.length; i++) {
                        if(jorge.computadores[i] == null){
                            jorge.computadores[i] = pcVaio;
                            break;
                        }
                    }
                    break;

                case 0:
                    System.out.println("Nome do cliente: " + jorge.nome);
                    System.out.println("CPF do cliente: " + jorge.cpf);
                    System.out.println("");
                    for(int i = 0; i < jorge.computadores.length; i++){
                        if(jorge.computadores[i] != null){
                            jorge.computadores[i].mostraPCConfigs();
                            System.out.println("");
                        }
                    }
                    System.out.println("Total da compra: " + jorge.calculaTotalCompra());
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }
    }
}
