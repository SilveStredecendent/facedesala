public class Iluminacao {
    int cor;

    public void Iluminacao(int cor) {
        this.cor = cor;
    }

    public void trocarCor() {
        int i;

        for (i = 0; i < this.cor; i++) {
            System.out.print("A cor será trocada em " + i + "...");
            System.out.print("A cor foi mudada !!!");
        }
    }
}
