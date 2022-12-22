import java.lang.Math;

import static java.lang.Math.round;

public class Tabung {
    int r;
    int tinggi;

    public Tabung(int r, int tinggi) {
        this.r = r;
        this.tinggi = tinggi;
    }

    public int volumeTabung(){
        return (int) Math.ceil(Math.PI*r*r*tinggi);
    }
}
