import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso React");
        curso3.setDescricao("Descrição curso React");
        curso3.setCargaHoraria(6);

        Curso curso4 = new Curso();
        curso4.setTitulo("Curso Spring");
        curso4.setDescricao("Descrição curso Spring");
        curso4.setCargaHoraria(10);

        Curso curso5 = new Curso();
        curso5.setTitulo("Curso Banco de Dados");
        curso5.setDescricao("Descrição curso BD avançado");
        curso5.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java Avançado");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso4);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

        Dev devClara = new Dev();
        devClara.setNome("Clara");
        devClara.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Clara:" + devClara.getConteudosInscritos());
        devClara.progredir();
        devClara.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Clara:" + devClara.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Clara:" + devClara.getConteudosConcluidos());
        System.out.println("XP:" + devClara.calcularTotalXp());

        Dev devCleython = new Dev();
        devCleython.setNome("Cleython");
        devCleython.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Cleython:" + devCleython.getConteudosInscritos());
        devCleython.progredir();
        devCleython.progredir();
        devCleython.progredir();
        devCleython.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Cleython:" + devCleython.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Cleython:" + devCleython.getConteudosConcluidos());
        System.out.println("XP:" + devCleython.calcularTotalXp());


    }

}
