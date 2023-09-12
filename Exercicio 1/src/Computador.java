public class Computador {

    String marca;
    float preco;

    MemoriaUSB [] memorias = new MemoriaUSB[50];
    SistemaOperacional sistema = new SistemaOperacional();
    HardwareBasico processador = new HardwareBasico();
    HardwareBasico ram = new HardwareBasico();
    HardwareBasico hdd = new HardwareBasico();

    void mostraPCConfigs(){
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
        System.out.println("Sistema Operacional: " + sistema.nome + " " + sistema.tipo);
        System.out.println("Processador: " + processador.nome + " " + processador.capacidade);
        System.out.println("RAM: " + ram.nome + " " + ram.capacidade);
        System.out.println("HD: " + hdd.nome + " " + hdd.capacidade);
        for (MemoriaUSB m : memorias){
            if(m != null){
                System.out.println("Memórias USB: " + m.nome + " " + m.capacidade);
            }
        }
    }

    void addMemoriaUSB(MemoriaUSB musb){
        for(int i = 0; i < memorias.length; i++){
            if(memorias[i] == null){
                memorias[i] = musb;
                break;
            }
        }
    }

}
