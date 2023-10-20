public class Funcionario1{
    private String matricula;
    private double salarioBrutoMensal;

    public Funcionario1(String matricula, double salarioBrutoMensal) {
        this.matricula = matricula;
        this.salarioBrutoMensal = salarioBrutoMensal;
    }

    public void print(){
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Salario Bruto: " + this.salarioBrutoMensal);
        System.out.println("Ganho anual: " + this.ganhoAnual());
        System.out.println("Desconto IR: " + this.descontoIR());
        System.out.println("Salario liquido: " + this.salarioLiquido());
    }

    public void aumenta(double percentual){
       double salarioComAumento = salarioBrutoMensal + (salarioBrutoMensal * percentual);
        System.out.println("Salario com aumento: " + salarioComAumento);
    }

    public double ganhoAnual(){
        return  (salarioBrutoMensal * 12) + salarioBrutoMensal + (salarioBrutoMensal / 3);
    }

    public double descontoIR() {
        if (salarioBrutoMensal <= 1500) {
            return 0;
        } else if (salarioBrutoMensal <= 5000){
            return salarioBrutoMensal * 0.15;
        } else{
            return salarioBrutoMensal * 0.25;
        }
    }

    public double salarioLiquido(){
        return salarioBrutoMensal - descontoIR();
    }
}