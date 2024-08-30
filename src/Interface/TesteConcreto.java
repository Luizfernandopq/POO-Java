package Interface;

public class TesteConcreto extends TesteAbstrato{
    public void method(){
        System.out.println("Concreto");
        super.method();

    }
    public void newMethod(){
        System.out.println("Polimorfico");
    }
    public static void main(String[] args) {
        TesteAbstrato a = new TesteConcreto2();
        a.newMethod();
    }
}
