import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();


        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


BootCamp bootCamp = new BootCamp();
bootCamp.setNome("BootCamp Java Developer");
bootCamp.setDescricao("Descrição do BootCamp Java Developer");
bootCamp.getConteudos().add(curso1);
bootCamp.getConteudos().add(curso2);
bootCamp.getConteudos().add(mentoria);

    
Dev devOrlando = new Dev();
devOrlando.setNome("Orlando");
devOrlando.inscreverBootCamp(bootCamp);

System.out.println("Conteúdos Inscritos Orlando:" + devOrlando.getConteudosInscritos());
devOrlando.progredir();

System.out.println("Conteúdos Inscritos Orlando:" + devOrlando.getConteudosInscritos());
System.out.println("Conteúdos Concluídos Orlando:" + devOrlando.getConteudosConcluidos());
System.out.println("XP:" + devOrlando.calcularTotalXp());

    }
}
