import java.util.ArrayList;

public class TesteEmpregado {
    public static void main(String... args){
        Empregado e0 = new Empregado0();
        Empregado e1 = new Empregado1();
        Empregado e2 = new Empregado2();

        e0.setSalario(2);
        e0.setComissao(2);
        e0.setBonus(2);

        e1.setSalario(2);
        e1.setComissao(2);
        e1.setBonus(2);

        e2.setSalario(2);
        e2.setComissao(2);
        e2.setBonus(2);
        
        var empregados = new ArrayList<Empregado>();
        empregados.add(e0);
        empregados.add(e1);
        empregados.add(e2);
        for(int i = 0; i < empregados.size(); i++){
            System.out.println(String.valueOf(empregados.get(i).calcularSalarioTotal()));
        }
    }
}
