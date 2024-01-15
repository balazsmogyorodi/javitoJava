package bicikli;

import bicikli.Main.LampaAllapotok;

public class Lampa {

    private LampaAllapotok lampa;
    private int allapot;

    public LampaAllapotok getLampa() {
        return lampa;
    }

    private void setLampa(LampaAllapotok lampa) {
        this.lampa = lampa;
    }

    public void allapotValtas() {
        allapot += 1;
     

    }

    public Lampa() {
        this.lampa = lampa.Sötét;
        allapot = 0;
    }

}
