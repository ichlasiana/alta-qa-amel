import java.lang.Math;
public class Segitiga { //nama kelas harus dimulai dari uppercase (Segitiga)
        int alas;
        int tinggi;

        public Segitiga(int alas, int tinggi) { //construction
            this.alas = alas;
            this.tinggi = tinggi;
        }

        public int hitungLuas(){ //method
            return (this.alas * this.tinggi)/2;
        }

        public int hitungKeliling(){
            double a = Math.pow(this.alas,2);
            double b = Math.pow(this.tinggi,2);
            double sisi = Math.sqrt(a+b);
            return (int) (alas + tinggi + sisi);
        }
    }
