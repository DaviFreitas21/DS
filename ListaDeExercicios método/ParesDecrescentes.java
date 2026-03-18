package listaMetodos;

public class ParesDecrescentes {
    public static void main(String[] args) {
        paresDecrescente();
    }
    public static void paresDecrescente() {
        for (int i= 100; i >= 0; i = i -2) {
            System.out.print(i+" ");
        }
    }
}
