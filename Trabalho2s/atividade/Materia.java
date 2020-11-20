package trabalho2s.atividade; 


public class Materia {
    
    private String nome;
    private Sala sala;

	public Materia(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (!(other instanceof Materia)) {
            return false;
        }
        Materia auxOther = (Materia) other;
        if (this.nome.equals(auxOther.nome)) {
            return true;
        }
        return false;
    }

	public Sala getSala() {
		return this.sala;
    }
    public void setSala(Sala sala) {
        this.sala = sala;
    }
}


