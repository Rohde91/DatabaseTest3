package FilEksempler;

public class OutputSkaerm {

    public void udskrivStud(Studerende s){
        System.out.format("\n%d %s %s %s %s %s %s",s.getStdnr(),s.getFnavn(),s.getEnavn(),
                s.getAdresse(),s.getPostnr(),s.getMobil(),s.getKlasse());

    }

}
