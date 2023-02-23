public abstract class Empregado{
    protected String name;
    protected int age;
    protected double salario, comissao, bonus;

    public abstract double calcularSalarioTotal();

    public String getName() {return name;}
    public void setName(String name) {this.name = name;};

    public int getAge() {return age;};
    public void setAge(int age) {this.age = age;};

    public void setSalario(double salario) {this.salario = salario;}
    public void setBonus(double bonus) {this.bonus = bonus;}
    public void setComissao(double comissao) {this.comissao = comissao;}

}