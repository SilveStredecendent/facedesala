public class FacedeSala {
    boolean verdadeiro;
    BlueRay b;
    Projetor o;
    Cadeiras c;
    Pipoqueira p;
    HomeTheater h;
    Iluminacao i;
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
            i.trocarCor();
            a.aumentarTemp();
            a.diminuirTemp();

        }

    }

    public void aventura() {
        int ;
        int ameno = 22;
        int angulo = 110;
        int ;
        int ;
        int ;
        int ;
        int ;

        i = new Iluminacao();
        a = new ArCondicionado(ameno);
        c = new Cadeiras(angulo);
        p = new Pipoqueira();
        h = new HomeTheater();
        o = new Projetor();
        b = new BlueRay();
    }

    public void romantico() {
        int ;
        int quente = 25;
        int angulo = 110;
        int ;
        int ;
        int ;

        i = new Iluminacao();
        a = new ArCondicionado(quente);
        c = new Cadeiras(angulo);
        o = new Projetor();
        b = new BlueRay();
    }

    public void comedia() {
        int ;
        int quente = 25;
        int angulo = 110;
        int ;
        int ;
        int ;


        i = new Iluminacao();
        a = new ArCondicionado(quente);
        c = new Cadeiras(angulo);
        p = new Pipoqueira();
        o = new Projetor();
        b = new BlueRay();
    }

    public void acao() {
        int ;
        int quente = 25;
        int angulo = 110;
        int ;
        int ;
        int ;
        int ;

        i = new Iluminacao();
        a = new ArCondicionado(quente);
        c = new Cadeiras(angulo);
        p = new Pipoqueira();
        h = new HomeTheater();
        o = new Projetor();
        b = new BlueRay();
    }

    public void novela() {
        int ;
        int angulo = 110;
        int ;
        int ;

        i = new Iluminacao();
        c = new Cadeiras(angulo);
        o = new Projetor();
        b = new BlueRay();
    }

    public void esportes() {
        int ;
        int angulo = 110;
        int ;
        int ;
        int ;

        i = new Iluminacao();
        c = new Cadeiras(angulo);
        h = new HomeTheater();
        o = new Projetor();
        b = new BlueRay();
    }

    public void show() {
        int ;
        int angulo = 110;
        int frio = 16;
        int quente = 16;
        int alto = 70;
        int ;
        int ;

        i = new Iluminacao();
        c = new Cadeiras(angulo);
        a = new ArCondicionado(frio);
        h = new HomeTheater(alto);
        o = new Projetor();
        b = new BlueRay();
    }

}
