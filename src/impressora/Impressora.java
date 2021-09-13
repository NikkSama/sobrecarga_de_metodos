package impressora;

public class Impressora {
    public void exibir (float n){
        System.out.println(n);
    }
    public void exibir (float m, float n){
        System.out.println(String.format("%f , %f", m,n));
    }
    public void exibir (float m, String n){
        System.out.println(String.format("%f , %s", m,n));
    }
    public void exibir (String m, float n){
        System.out.println(String.format("%s , %f", m,n));
    }
    public void exibir (String m, String n, String o){
        System.out.println(String.format("%s , %s , %s", m,n,o));
    }
    public void exibir (int m, int n, String o){
        System.out.println(String.format("%d , %d , %s", m,n,o));
    }
}
