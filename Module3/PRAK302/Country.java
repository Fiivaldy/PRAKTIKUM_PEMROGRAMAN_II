package Module3.PRAK302;

import java.util.HashMap;
import java.util.Locale;

public class Country {
    private String countryName;
    private String leadershipType;
    private String leaderName;
    private int independenceYear;
    private int independenceDate;
    private int independenceMonth;

    public Country(String countryName, String leadershipType, String leaderName, int independenceYear, int independenceMonth, int independenceDate) {
        this.countryName = countryName;
        this.leadershipType = leadershipType;
        this.leaderName = leaderName;
        this.independenceYear = independenceYear;
        this.independenceDate = independenceDate;
        this.independenceMonth = independenceMonth;
    }

    public Country(String countryName, String leaderName, String leadershipType) {
        this.countryName = countryName;
        this.leadershipType = leadershipType;
        this.leaderName = leaderName;
    }

    public int printInfo() {
        HashMap<Integer, String> independenceMonth = new HashMap<Integer, String>();
        independenceMonth.put(1, "Januari");
        independenceMonth.put(2, "Febuari");
        independenceMonth.put(3, "Maret");
        independenceMonth.put(4, "April");
        independenceMonth.put(5, "Mei");
        independenceMonth.put(6, "Juni");
        independenceMonth.put(7, "Juli");
        independenceMonth.put(8, "Agustus");
        independenceMonth.put(9, "September");
        independenceMonth.put(10, "Oktober");
        independenceMonth.put(11, "November");
        independenceMonth.put(12, "Desember");

        String leaderTittle;
        boolean isLeaderTittleMonarchy = false;
        if (leadershipType.equalsIgnoreCase("monarki")){
            leaderTittle = "Raja";
            isLeaderTittleMonarchy = true;
        }
        else if (leadershipType.equalsIgnoreCase("presiden")){
            leaderTittle = "Presiden";
        }
        else if (leadershipType.equalsIgnoreCase("perdana menteri")) {
            leaderTittle = "Perdana Menteri";
        }
        else leaderTittle = "Apa aja";
        System.out.println("Negara " + this.countryName + " mempunyai " + leaderTittle + " bernama " + this.leaderName);


        if (!isLeaderTittleMonarchy){
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + this.independenceDate + " " + independenceMonth.get(this.independenceMonth) + " " + this.independenceYear);
        }
        return 0;
    }
}