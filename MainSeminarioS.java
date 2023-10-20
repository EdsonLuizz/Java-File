public class MainSeminarioS {
    public static void main(String[] args) {
        SeminarioS seminario = new SeminarioS("Geografia no Brasil");
        AlunoS aluno = new AlunoS(19, "Edson");
        AlunoS aluno2 = new AlunoS(20, "Ana");
        ProfessoreS professor = new ProfessoreS("Maria", "Geologia");
        LocalS local = new LocalS("Nilopolis", "Manoel Serra");

        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);


        seminario.setProfessor(professor);
        seminario.setLocal(local);
        seminario.setAlunos(new AlunoS[]{aluno, aluno2});

        professor.setSeminarios(new SeminarioS[]{seminario});

        seminario.print();
        professor.print();
    }
}
