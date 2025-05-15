public class FacedeSala {
    boolean verdadeiro;

    BlueRay b;
    Projetor o;
    Cadeiras c;
    Pipoqueira p;
    HomeTheater h;
    Iluminacao l;
    ArCondicionado a;

    public FacedeSala(int funcao) {
        switch (funcao) {
            case 1:
                aventura();
                break;
            case 2:
                romantico();
                break;
            case 3:
                comedia();
                break;
            case 4:
                acao();
                break;
            case 5:
                novela();
                break;
            case 6:
                esportes();
                break;
            case 7:
                show();
                break;

            default:
                System.out.println("Opção incorreta!!!");
                verdadeiro = false;

        }

        if (verdadeiro) {
            b.ligar();
            o.ligar();
            c.inclinar();
            p.baldes();
            h.aumentarVol();
            h.diminuirVol();
            l.trocarCor();
            a.aumentarTemp();
            a.diminuirTemp();

        }

    }

    public void aventura() {
        int cor = 9; 
        int condi = 22;
        int angulo = 110;
        int baldes = 3;
        int volumeAlto = 80;
        int ligado = 1;
        int play = 1;

        l = new Iluminacao(cor);
        a = new ArCondicionado(condi, condi);
        c = new Cadeiras(angulo);
        p = new Pipoqueira(baldes);
        h = new HomeTheater(volumeAlto, volumeAlto);
        o = new Projetor(ligado);
        b = new BlueRay(play);
    }

    public void romantico() {
        int cor = 8; 
        int condi = 25;
        int angulo = 110;
        int baldes = 3;
        int volumeBaixo = 40;
        int ligado = 1;
        int play = 1;

        l = new Iluminacao(cor);
        a = new ArCondicionado(condi, condi);
        c = new Cadeiras(angulo);
        p = new Pipoqueira(baldes);
        h = new HomeTheater(volumeBaixo, volumeBaixo);
        o = new Projetor(ligado);
        b = new BlueRay(play);
    }

    public void comedia() {
        int cor = 7; 
        int condi = 23;
        int angulo = 110;
        int baldes = 3;
        int volumeBaixo = 50;
        int ligado = 1;
        int play = 1;

        l = new Iluminacao(cor);
        a = new ArCondicionado(condi, condi);
        c = new Cadeiras(angulo);
        p = new Pipoqueira(baldes);
        h = new HomeTheater(volumeBaixo, volumeBaixo);
        o = new Projetor(ligado);
        b = new BlueRay(play);
    }

    public void acao() {
        int cor = 3; 
        int condi = 18;
        int angulo = 120;
        int baldes = 3;
        int volumeAlto = 90;
        int ligado = 1;
        int play = 1;

        l = new Iluminacao(cor);
        a = new ArCondicionado(condi, condi);
        c = new Cadeiras(angulo);
        p = new Pipoqueira(baldes);
        h = new HomeTheater(volumeAlto, volumeAlto);
        o = new Projetor(ligado);
        b = new BlueRay(play);
    }

    public void novela() {
        int cor = 4; 
        int condi = 22;
        int angulo = 100;
        int baldes = 3;
        int volumeBaixo = 40;
        int ligado = 1;
        int play = 1;

        l = new Iluminacao(cor);
        a = new ArCondicionado(condi, condi);
        c = new Cadeiras(angulo);
        p = new Pipoqueira(baldes);
        h = new HomeTheater(volumeBaixo, volumeBaixo);
        o = new Projetor(ligado);
        b = new BlueRay(play);
    }

    public void esportes() {
        int cor = 6; 
        int condi = 20;
        int angulo = 110;
        int baldes = 3;
        int volumeAlto = 75;
        int ligado = 1;
        int play = 1;

        l = new Iluminacao(cor);
        a = new ArCondicionado(condi, condi);
        c = new Cadeiras(angulo);
        p = new Pipoqueira(baldes);
        h = new HomeTheater(volumeAlto, volumeAlto);
        o = new Projetor(ligado);
        b = new BlueRay(play);
    }

    public void show() {
        int cor = 10; 
        int condi = 16;
        int angulo = 120;
        int baldes = 3;
        int volumeAlto = 100;
        int ligado = 1;
        int play = 1;

        l = new Iluminacao(cor);
        a = new ArCondicionado(condi, condi);
        c = new Cadeiras(angulo);
        p = new Pipoqueira(baldes);
        h = new HomeTheater(volumeAlto, volumeAlto);
        o = new Projetor(ligado);
        b = new BlueRay(play);
    } 
    
}