package br.inatel.poo.computador;

public class Computador {

    private String marca;
    private float preco;
    HardwareBasico hardwareBasico;
    SistemaOperacional sistemaOperacional;
    MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, HardwareBasico hardware, SistemaOperacional so, MemoriaUSB usb) {
        this.marca = marca;
        this.preco = preco;
        this.hardwareBasico = hardware;
        this.sistemaOperacional = so;
        this.memoriaUSB = usb;
    }


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void mostrarPCConfigs(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Preço: R$" + this.preco);
        System.out.println(this.hardwareBasico.getNome());

        if(this.hardwareBasico.getCapacidade()==500f)
            System.out.printf("500Gb de HD");
        if(this.hardwareBasico.getCapacidade()==1000f)
            System.out.printf("1Tb de HD");
        if(this.hardwareBasico.getCapacidade()==2000f)
            System.out.printf("2Tb de HD");

        System.out.println("\nSistema Operacional " + this.sistemaOperacional.getNome() + " (" + this.sistemaOperacional.getTipo() + "bits)");

        if(this.memoriaUSB != null){
            System.out.println("Acompanha " + this.memoriaUSB.getNome() + " de " + this.memoriaUSB.getCapacidade() + "Gb");
        }
    }

    public void addMemoriaUSB(MemoriaUSB musb){
        this.memoriaUSB = musb;
    }
}
