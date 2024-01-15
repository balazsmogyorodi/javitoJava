package bicikli;

import bicikli.Main.LampaAllapotok;

public class Main {
    
    enum LampaAllapotok {
        Sötét, Fény, Erősebb, Vilogó, Erősebb_Vilogó, Szin_jelző_fény
    };

    public static void main(String[] args) {
        Lampa l = new Lampa();
        kiiras(l);
        
    }
    
    
    
    
    
    public static void kiiras(Lampa lampa) {
        System.out.println("A bicikli lámpájának az állapota jelenleg: " + lampa.getLampa());
        
    }
    
}
