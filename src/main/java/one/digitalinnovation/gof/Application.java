package one.digitalinnovation.gof;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import one.digitalinnovation.gof.model.ClienteBuilder;
import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.service.ClienteService;

@EnableFeignClients
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(ClienteService clienteService) {
        return args -> {
            // Criamos um endereço básico para o teste
            Endereco endereco = new Endereco();
            endereco.setCep("01001000"); // Exemplo de CEP válido (Praça da Sé, SP)

            // Utilização do Padrão Builder para instanciar o Cliente de forma legível e elegante
            var cliente = new ClienteBuilder()
                    .comNome("Fernando Araújo (Portfólio)")
                    .comEndereco(endereco)
                    .build();

            // Insere o cliente utilizando o serviço existente (que já consulta a API ViaCEP automaticamente)
            clienteService.inserir(cliente);
            System.out.println(">> [EVOLUÇÃO DO DESAFIO] Cliente inserido com sucesso utilizando o Padrão Builder!");
        };
    }
}