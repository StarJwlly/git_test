public class Empregado1 extends Empregado {
    @Override
    public double calcularSalarioTotal() {
        return super.salario + super.salario * super.comissao;
    }
}
