public class Projetor {
    int iniciar;

    public Projetor(int iniciar) {
        this.iniciar = iniciar;
    }

    public void ligar() {
        int i;

        for (i = 0; i < this.iniciar; i++) {
            System.out.print("Projetor ligará em " + i + "...");
            System.out.print("Projetor ligado !!!");
        }
    }
}