package trabalho2s.atividade; 

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sala {
    
    private String nome;
    private Set<Materia> materiasDaSala=  new HashSet<>();

    public Sala (String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

	public void addmateriasDaSala(Materia materia) {
        materiasDaSala.add(materia);
        materia.setSala(this);
    }
    
    public List<Materia> getMateriasDaSala() {
        return new ArrayList<>(materiasDaSala);
    }

}

