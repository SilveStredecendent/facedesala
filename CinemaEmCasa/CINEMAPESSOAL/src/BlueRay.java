public class BlueRay {
    int play;

    public BlueRay( int play){
        this.play = play;
    }

    public void ligar() {
        int i;

        for (i = 0; i < this.play; i++) {
            System.out.print("O Blue Ray será ligado em " + i + "...");
            System.out.print("Foi dado o play !!!");
        }
    }
}