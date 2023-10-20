public class SeminarioS {
    private String titulo;
    private AlunoS[] alunos;
    private ProfessoreS professor;
    private LocalS local;

    public SeminarioS(String titulo) {
        this.titulo = titulo;
    }

    public void print(){
        System.out.println("--------Relatorio de palestra--------");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Professor palestrante: " + this.professor.getNome());
        System.out.println("Local: " + this.local.getRua() + "; Bairro: " + this.local.getBairro());
        System.out.println("--------Alunos participantes--------");
        for(AlunoS alunos: alunos){
            System.out.println(alunos.getNome());
        }
    }
    public LocalS getLocal() {
        return local;
    }

    public void setLocal(LocalS local) {
        this.local = local;
    }

    public ProfessoreS getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessoreS professor) {
        this.professor = professor;
    }

    public AlunoS[] getAlunos() {
        return alunos;
    }

    public void setAlunos(AlunoS[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
