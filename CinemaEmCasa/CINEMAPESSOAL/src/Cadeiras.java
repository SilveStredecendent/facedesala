public class Cadeiras{
    int angu;

    public Cadeiras(int angu){
        this.angu = angu;
    }

    public void inclinar () {
        int i;

        for(i = 0; i < this.angu; i++){
            System.out.print("Cadeira inclinará em " + i + "...");
            System.out.print("Cadeira no angula correto !!!");
        }
    }
}