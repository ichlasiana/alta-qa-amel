import java.lang.Math;

import static java.lang.Math.pow;

public class Kubus {
    int sisi;

    public Kubus(int sisi) {
        this.sisi = sisi;
    }

    public int volumeKubus(){
        return (int) Math.pow(this.sisi,3);
    }
}
