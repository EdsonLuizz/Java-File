public class AlunoS {
    private int idade;
    private String nome;
    private SeminarioS seminario;

    public AlunoS(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public void print(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if(this.seminario != null) {
            System.out.println("Seminario inscrito: " + this.seminario.getTitulo());
        } else{
            System.out.println("O aluno nao inscrito em nenhum seminario");
        }
    }

    public SeminarioS getSeminario() {
        return seminario;
    }

    public void setSeminario(SeminarioS seminario) {
        this.seminario = seminario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
