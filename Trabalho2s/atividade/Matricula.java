package pootrabalho2.trabalho2s.atividade; 

import java.util.ArrayList;
import java.util.List; 
import javax.swing.JOptionPane;


public class Matricula {    
  public static void  main(String[] args) {
    List<Aluno> Aluno = new ArrayList<>();
    
      Aluno novoAluno = new Aluno("Maria Luiza", "2 ano"); 
      Endereço endereçoInformado = new Endereço("Paraná","Maringa", "Rua Paulista", "15"); 
      Aluno.add(novoAluno);
      System.out.println(novoAluno.toString());
      
      } 
   
} 