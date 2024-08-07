package com.ednario.value.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {
  
  private Remetente remetente;

  @Override
  public void run(String... args) throws Exception {
    System.out.println(
      "Mensagem enviada por: " + remetente.getNome() 
       + "\nEmail: " + remetente.getEmail() 
       + "\nTelefones: " + remetente.getTelefones());
    System.out.println("Seu cadastro foi realizado com sucesso!");
  }
}
