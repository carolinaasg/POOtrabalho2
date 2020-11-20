package trabalho2s.atividade; 

public class SalaEMateria {
    
    public static void main(String[] args) {
        Sala SalaRotativa = new Sala ("SalaUM");
        

        Materia port = new Materia("Portugues");
        Materia redac = new Materia("Redacao");
        Materia gram = new Materia("Gramatica");

        SalaRotativa.addmateriasDaSala(port);
        SalaRotativa.addmateriasDaSala(redac);
        SalaRotativa.addmateriasDaSala(gram);

        for (Materia aux : SalaRotativa.getMateriasDaSala()) {
            System.out.println(aux.getNome() + "  Sala: " + aux.getSala().getNome() );
        }
    }
    
}


