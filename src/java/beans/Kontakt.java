package beans;

/**
 *
 * @author Stefan
 */
public class Kontakt implements Comparable<Kontakt> {
    
    private String ime;
    private String prezime;
    private String email;
    private String telefon;
    
    public Kontakt() {
        
    }
    
    public Kontakt(String ime, String prezime, String email, String telefon) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.telefon = telefon;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    
    @Override
    public int compareTo(Kontakt o) {
        return 1;
    }
    
}
