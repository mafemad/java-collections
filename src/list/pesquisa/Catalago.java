package list.pesquisa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Catalago {

    private List<Livro> livros;

    public Catalago() {
        this.livros = new ArrayList<>();
    }

    public void addLivro(String titulo, String autor, LocalDate data){
        livros.add(new Livro(autor,titulo,data));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosAutor = new ArrayList<>();
        if(!livros.isEmpty()){
            for(Livro l : livros){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosAutor.add(l);
                }
            }
        }
        return livrosAutor;
    }

    public List<Livro> pesquisaPorIntervalo(LocalDate inicio, LocalDate fim){
        List<Livro> livrosAno = new ArrayList<>();
        if(!livros.isEmpty()){
            for(Livro livro : livros){
                if(livro.getDataPublicacao().isEqual(inicio) || livro.getDataPublicacao().isAfter(inicio)
                        && livro.getDataPublicacao().isBefore(fim)){
                    livrosAno.add(livro);
                }
            }
        }
        return  livrosAno;
    }

    public Livro pesquisaPorTitulo(String titulo) {
        Livro mock = null;
        if(!livros.isEmpty()){
            for(Livro livro : livros){
               if(livro.getTitulo().equalsIgnoreCase(titulo)){
                   mock = livro;
                   break;
               }
            }
        }
        return mock;
    }

    public static void main(String[] args) {
        Catalago catalago = new Catalago();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        catalago.addLivro("titulo 1", "autor 1", LocalDate.parse("10/03/2020", formatter));
        catalago.addLivro("titulo 1", "autor 3", LocalDate.parse("15/05/2022", formatter));
        catalago.addLivro("titulo 2", "autor 2", LocalDate.parse("15/05/2021", formatter));
        catalago.addLivro("titulo 3", "autor 2", LocalDate.parse("15/05/2023", formatter));
        catalago.addLivro("titulo 4", "autor 4", LocalDate.parse("15/05/1930", formatter));

        System.out.println(catalago.pesquisarPorAutor("autor 2"));
        System.out.println(catalago.pesquisaPorIntervalo(LocalDate.parse("10/03/2020", formatter),
                LocalDate.parse("10/03/2024", formatter)));
        System.out.println(catalago.pesquisaPorTitulo("titulo 1"));

    }
}


