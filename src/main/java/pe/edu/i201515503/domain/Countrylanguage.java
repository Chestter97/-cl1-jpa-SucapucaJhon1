package pe.edu.i201515503.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "countrylanguage")
public class Countrylanguage {

    @Id
    private String CountryCode;
    private String Language;
    private IsOfficial IsOfficial;
    private Double Percentage;

    @ManyToOne
    private Country country;

    public Countrylanguage() {
    }

    public Countrylanguage(String countryCode, String language) {
        CountryCode = countryCode;
        Language = language;
    }

    public Countrylanguage(String countryCode, String language, pe.edu.i201515503.domain.IsOfficial isOfficial, Double percentage) {
        CountryCode = countryCode;
        Language = language;
        IsOfficial = isOfficial;
        Percentage = percentage;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public pe.edu.i201515503.domain.IsOfficial getIsOfficial() {
        return IsOfficial;
    }

    public void setIsOfficial(pe.edu.i201515503.domain.IsOfficial isOfficial) {
        IsOfficial = isOfficial;
    }

    public Double getPercentage() {
        return Percentage;
    }

    public void setPercentage(Double percentage) {
        Percentage = percentage;
    }

    @Override
    public String toString() {
        return "Countrylanguage{" +
                "CountryCode='" + CountryCode + '\'' +
                ", Language='" + Language + '\'' +
                ", IsOfficial=" + IsOfficial +
                ", Percentage=" + Percentage +
                ", country=" + country +
                '}';
    }
}
