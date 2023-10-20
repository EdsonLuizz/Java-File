public class ProfessoreS {
    private String nome;
    private String especialidade;
    private SeminarioS[] seminarios;

    public ProfessoreS(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void print(){
        System.out.println("--------Relatorio do professor--------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("Especialidade do palestrante:  ");
        for (SeminarioS sem: seminarios){
            System.out.println(sem.getTitulo());
        }

    }


    public SeminarioS[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(SeminarioS[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
