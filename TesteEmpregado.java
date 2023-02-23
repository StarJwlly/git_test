public class TesteEmpregado {
    public static void main(String... args){
        Empregado e1 = new Empregado();
        Empregado e2 = new Empregado();
        Empregado e3 = new Empregado();

        e1.setTipo(0);
        e1.setSalario(1);
        e1.setComissao(1);
        e1.setBonus(1);
        
        System.out.println(String.valueOf(e1.calcularSalarioTotal()));
    }
}
