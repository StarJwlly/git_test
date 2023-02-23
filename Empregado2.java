public class Empregado2 extends Empregado {
    @Override
    public double calcularSalarioTotal() {
        return super.salario + super.bonus;
    }
}
