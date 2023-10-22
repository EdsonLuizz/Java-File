import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Onibus7 {
    private int qntMaxima;
    private double passagem;

    private double faturamentoDiario = 0;

    private int qntAtual;

    public Onibus7(int qntMaxima, double passagem, int qntAtual) {
        this.qntMaxima = qntMaxima;
        this.passagem = passagem;
        this.qntAtual = qntAtual;
    }

    public int entrar(int qtdPassageiros){
        int sobra = qntMaxima - qtdPassageiros;
        if(qntMaxima - qtdPassageiros < 0) {
            System.out.println("Nao foi possível colocar todos os passageiros no onibus, infelizmente " + sobra * -1 + " passageiros ficaram de fora");
            System.out.println("Quantidade atual de passageiros: " + sobra);
            this.qntAtual = this.qntMaxima;
            return qntAtual;
        } else {
            this.qntAtual += this.qntAtual + qtdPassageiros;
            System.out.println("Quantidade atual de passageiros: " + this.qntAtual );
            return qntAtual;
        }
    }

    public boolean sair(int qtdPassageiros){
        if (qntAtual - qtdPassageiros < 0){
            System.out.println("Numero de passsageiros invalido");
            return false;
        } else {
            if (qntAtual - qtdPassageiros >= 0) {
                int sobra = qntAtual - qtdPassageiros;
                qntAtual = sobra;
                System.out.println("" + qtdPassageiros + " passageiros sairam");
                System.out.println("Numero de passageiros restantes: " + this.qntAtual);
            }
            return true;
        }
    }

    public double faturamento(){
        this.faturamentoDiario += this.passagem * qntAtual;
        System.out.println("O valor do faturamento com os passageiros foi de: " + this.faturamentoDiario);
        return this.passagem * qntAtual;
    }

    public double getFaturamentoDiario() {
        return faturamentoDiario;
    }

    public void setFaturamentoDiario(double faturamentoDiario) {
        this.faturamentoDiario = faturamentoDiario;
    }


}
