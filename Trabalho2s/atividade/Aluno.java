package trabalho2s.atividade; 

public class Aluno {
    private String nome;
    private String ano;

    public Aluno (String nome, String ano) {
        setNome(nome); 
        setAno(ano);
    } 
    public  void setNome(String nome) {
        if ((nome.length()<4) || (nome.length()>30))
            throw new IllegalArgumentException("Digite seu nome completo !");
        else
            this.nome = nome;
    }
    public void setAno(String ano) {
        if ((ano.length()>=1) || (ano.length()<=3))
        throw new IllegalArgumentException("Digite o ano");
    else
        this.ano = ano;
    }
    public String getNome(){
        return this.nome;
    }    
    public String getCpf(){
        return this.ano;
    }
    
    @Override
    public String toString() {
    return nome + ano; 
    }

}