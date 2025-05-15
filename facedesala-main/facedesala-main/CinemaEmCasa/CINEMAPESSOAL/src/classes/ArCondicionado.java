package classes;
public class ArCondicionado {
    int tempAumentar, tempDiminuir;

    public ArCondicionado(int tempAumentar, int tempDiminuir) {
        this.tempAumentar = tempAumentar;
        this.tempDiminuir = tempDiminuir;
    }

    public void aumentarTemp() {
        int i;

        for (i = 0; i < this.tempAumentar; i++) {
            System.out.println("A temperatura será aumentada em " + i + "..");
            System.out.println("Temperatura aumentada !!!");
        }
    }

    public void diminuirTemp() {
        int i;

        for (i = 0; i < this.tempDiminuir; i++) {
            System.out.println("A temperatura será diminuída em " + i + "..");
            System.out.println("Temperatura diminuída !!!");
        }
    }
}