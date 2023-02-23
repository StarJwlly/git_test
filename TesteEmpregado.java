public class TesteEmpregado {
    public static void main(String... args){
        Empregado e0 = new Empregado0();
        Empregado e1 = new Empregado1();
        Empregado e2 = new Empregado2();

        e0.setSalario(1);
        e0.setComissao(1);
        e0.setBonus(1);

        e1.setSalario(1);
        e1.setComissao(1);
        e1.setBonus(1);

        e2.setSalario(1);
        e2.setComissao(1);
        e2.setBonus(1);
        
        System.out.println("salario do empregado0" + String.valueOf(e0.calcularSalarioTotal()));
        System.out.println("salario do empregado1" + String.valueOf(e1.calcularSalarioTotal()));
        System.out.println("salario do empregado2" + String.valueOf(e2.calcularSalarioTotal()));
    }
}
