import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
 public static void main(String[] args) {
  Curso curso1 = new Curso();
  curso1.setTitulo("curso java");
  curso1.setDescricao("descricao curso java");
  curso1.setCargaHoraria(8);

  Curso curso2 = new Curso();
  curso2.setTitulo("curso python");
  curso2.setDescricao("descricao curso python");
  curso2.setCargaHoraria(8);

  Mentoria mentoria1 = new Mentoria();
  mentoria1.setTitulo("mentoria de java");
  mentoria1.setDescricao("descricao mentoria java");
  mentoria1.setData(LocalDate.now());

  // System.out.println(curso1);
  // System.out.println(curso2);
  // System.out.println(mentoria1);

  Bootcamp bootcamp = new Bootcamp();
  bootcamp.setNome("bootcamp java");
  bootcamp.setDescricao("descricao bootcamp java");
  bootcamp.getConteudos().add(curso1);
  bootcamp.getConteudos().add(curso2);
  bootcamp.getConteudos().add(mentoria1);
  

  Dev dev = new Dev();
  dev.setNome("joao");
  dev.inscreverBootcamp(bootcamp);
  System.out.println("Joao Conteudos inscritos: " + dev.getConteudosInscritos());
  dev.progredir();
  System.out.println("Joao Conteudos concluidos: " + dev.getConteudosConcluidos());
  System.out.println("Joao XP: " + dev.calcularTotalXp());


  System.out.println("------------------------------------------------------------------------------------------------------");

  Dev dev2 = new Dev();
  dev2.setNome("maria");
  dev2.inscreverBootcamp(bootcamp);
  System.out.println("Maria Conteudos inscritos: " + dev2.getConteudosInscritos());
  System.out.println("Maria Conteudos concluidos: " + dev2.getConteudosConcluidos());
  System.out.println("Maria XP: " + dev2.calcularTotalXp());


 }
}
