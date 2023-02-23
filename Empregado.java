public class Empregado{
    int tipo;

    private String name;
    private int age;
    private double salario, comissao, bonus;

    public double calcularSalarioTotal()
    {
        switch(tipo){
            case 0:
                return salario;
            case 1:
                return salario + salario * comissao;
            case 2:
                return salario + bonus;
            default:
                return 0;
        }
    };

    public String getName() {return name;}
    public void setName(String name) {this.name = name;};

    public int getAge() {return age;};
    public void setAge(int age) {this.age = age;};

    public int getTipo() {return tipo;}
    public void setTipo(int tipo) {this.tipo = tipo;}

    public void setSalario(double salario) {this.salario = salario;}
    public void setBonus(double bonus) {this.bonus = bonus;}
    public void setComissao(double comissao) {this.comissao = comissao;}

}