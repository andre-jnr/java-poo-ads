public class Main {
    public static void main(String[] args) throws Exception {
        Gerente obj1 = new Gerente("Andre", 6500.00);
        Programador obj2 = new Programador("Renato", 5500);

        System.out.println("Nome: " + obj1.nome + "\nSalario: " + obj1.salario + "\nBonus: " + obj1.calcularBonus());

        System.out.println("\n");

        System.out.println("Nome: " + obj2.nome + "\nSalario: " + obj2.salario + "\nBonus: " + obj2.calcularBonus());
    }
}
