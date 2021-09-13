package impressora;

public class TesteImpressora {
    public static void main(String[] args) {
        //instancia
        Impressora impressora = new Impressora();
        impressora.exibir(1.1f);
        impressora.exibir(1.2f, 1.3f);
        impressora.exibir(1.4f,"n");
        impressora.exibir("m",1.5f);
        impressora.exibir("m","n","o");
        impressora.exibir(1, 2, "o");
    }
}
