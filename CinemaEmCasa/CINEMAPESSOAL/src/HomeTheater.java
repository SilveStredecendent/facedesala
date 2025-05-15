public class HomeTheater {
    int volAumentado, volDiminuido;

    public HomeTheater(int volAumentado, int volDiminuido) { // Tornar um construtor
        this.volAumentado = volAumentado;
        this.volDiminuido = volDiminuido;
    }

    public void aumentarVol() {
        int i;

        for (i = 0; i < this.volAumentado; i++) {
            System.out.println("O volume será aumentado em " + i + "..");
            System.out.println("Volume no ideal !!!");
        }
    }

    public void diminuirVol() {
        int i;

        for (i = 0; i < this.volDiminuido; i++) {
            System.out.println("O volume será diminuído em " + i + "..");
            System.out.println("Volume no ideal !!!");
        }
    }
}