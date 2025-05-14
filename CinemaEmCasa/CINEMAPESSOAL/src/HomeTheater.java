public class HomeTheater {
    int volAumentado;
    int volDiminuido;

    public void HomeTheater(int volAumentado, int volDiminuido) {
        this.volAumentado = volAumentado;
        this.volDiminuido = volDiminuido;

    }

    public void aumentarVol() {
        int i;

        for (i = 0; i < this.volAumentado; i++) {
            System.out.println("O volume srá aumentado em " + i + "..");
            System.out.println("Volume no ideal !!!");
        }
    }

    public void diminuirVol() {
        int i;

        for (i = 0; i < this.volDiminuido; i++) {
            System.out.println("O volume srá diminuido em " + i + "..");
            System.out.println("Volume no ideal !!!");
        }
    }
}
