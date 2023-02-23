public class Empregado{
    int tipo;

    private String name;
    private int age;
    private double salario, comissao, bonus;

    public double calcularSalario(){
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

}