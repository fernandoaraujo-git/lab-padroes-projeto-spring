package one.digitalinnovation.gof.model;

/**
 * Implementação do Padrão de Projeto Builder para facilitar
 * e tornar mais legível a criação de instâncias de Cliente.
 * Evolução aplicada para o Desafio de Portfólio.
 */
public class ClienteBuilder {
    
    private String nome;
    private Endereco endereco;

    public ClienteBuilder comNome(String nome) {
        this.nome = nome;
        return this;
    }

    public ClienteBuilder comEndereco(Endereco endereco) {
        this.endereco = endereco;
        return this;
    }

    public Cliente build() {
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setEndereco(endereco);
        return cliente;
    }
}