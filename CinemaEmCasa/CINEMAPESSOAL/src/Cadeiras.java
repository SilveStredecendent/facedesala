public class Cadeiras {
    int angulo;

    public Cadeiras(int angu) {
        this.angulo = angu;
    }

    public void inclinar() {
        int i;

        for (i = 0; i < this.angulo; i++) {
            System.out.print("Cadeira inclinará em " + i + "...");
            System.out.print("Cadeira no angulo correto !!!");
        }
    }
}