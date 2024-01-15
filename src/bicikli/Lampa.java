package bicikli;

import bicikli.Main.LampaAllapotok;

public class Lampa {
    

    private LampaAllapotok lampa;
    private int allapot, maximum_beallitas = 5;

    public LampaAllapotok getLampa() {
        return lampa;
    }

    private void setLampa(LampaAllapotok lampa) {
        this.lampa = lampa;
    }

    public void allapotValtas() {
        allapot += 1;
        if (allapot > maximum_beallitas) {
            allapot = 0;
        }
        fokozatok();
    }

    private void fokozatok() {
        switch (allapot) {
            case 0:
                setLampa(lampa.Sötét);
                break;
            case 1:
                setLampa(lampa.Fényes);
                break;
            case 2:
                setLampa(lampa.Erősebb);
                break;
            case 3:
                setLampa(lampa.Vilogó);
                break;
            case 4:
                setLampa(lampa.Erősebb_Vilogó);
                break;
            case 5:
                setLampa(lampa.Szin_jelző_fény);
                break;
        }
    }

    public Lampa() {
        this.lampa = lampa.Sötét;
        allapot = 0;
    }

}
