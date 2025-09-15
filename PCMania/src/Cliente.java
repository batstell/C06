import br.inatel.poo.computador.Computador;

public class Cliente {
    private String nome;
    private String cpf;
    Computador[] computadores;


    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[10];
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    float calculaTotalCompra(){
        float total = 0;

        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null) {
                total += computadores[i].getPreco();
            }
        }
        return total;
    }
}
