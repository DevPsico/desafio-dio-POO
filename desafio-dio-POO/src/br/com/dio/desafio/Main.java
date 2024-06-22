package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso = new Curso();
		Curso curso2 = new Curso();
		Mentoria mentoria = new Mentoria();
		
		
		curso.setTitulo("Curso JAVA");
		curso.setDescricao("Descri��o curso JAVA");
		curso.setCargaHoraria(8);
		
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("descri��o curso JS");
		curso2.setCargaHoraria(4);
		
		mentoria.setTitulo("Mentoria JAVA");
		mentoria.setDescricao("descri��o mentoria JAVA");
		mentoria.setData(LocalDate.now());
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		
		Dev devEricson = new Dev();
		devEricson.setNome("Ericson");
		devEricson.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos inscritos Ericson " + devEricson.getConteudosInscritos());
		devEricson.progredir();
		System.out.println("Xp Ericson: " + devEricson.calcularXp());
		
		System.out.println("Conte�dos conclu�dos Ericson " + devEricson.getConteudosConcluidos());
		System.out.println("Conte�dos inscritos Ericson " + devEricson.getConteudosInscritos());
		
		Dev devJoao = new Dev();
		devJoao.inscreverBootcamp(bootcamp);
		devJoao.setNome("Jo�o");
		System.out.println("Conte�dos inscritos Jo�o " + devJoao.getConteudosInscritos());
		System.out.println("Conte�dos conclu�dos Jo�o " + devJoao.getConteudosConcluidos());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
