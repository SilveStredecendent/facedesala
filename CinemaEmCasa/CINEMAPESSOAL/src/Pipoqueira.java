public class Pipoqueira {
    int qtd;

    public Pipoqueira(int qtd) {
        this.qtd = qtd;
    }

    public void baldes() {
        int i;

        for (i = 0; i < this.qtd; i++) {
            System.out.print("Fazendo a pipoca " + i + "...");
            System.out.print("Os baldes estão prontos !!!");
        }
    }
}