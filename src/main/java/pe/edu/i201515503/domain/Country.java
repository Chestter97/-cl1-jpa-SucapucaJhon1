package pe.edu.i201515503.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "Code")
    private String code;
    @Column(name = "Name")
    private String name;
    @Enumerated(EnumType.STRING)
    @Column(name = "Continent")
    private Continent continent;
    @Column(name = "Region")
    private String region;
    @Column(name = "SurfaceArea")
    private Double surfaceArea;
    @Column(name = "IndepYear")
    private int indepYear;
    @Column(name = "Population")
    private int population;
    @Column(name = "LifeExpectancy")
    private double lifeExpectancy;
    @Column(name = "GNP")
    private double gnp;
    @Column(name = "GNPOld")
    private double gnpOld;
    @Column(name = "LocalName")
    private String localName;
    @Column(name = "GovernmentForm")
    private String governmentForm;
    @Column(name = "HeadOfState")
    private String headOfState;
    @Column(name = "Capital")
    private int capital;
    @Column(name = "Code2")
    private String code2;


    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private List<City> city;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private List<Countrylanguage> Countrylanguage;

    public Country() {
    }

    public Country(String code) {
        this.code = code;
    }

    public Country(String code, String name, Continent continent, String region, Double surfaceArea, int indepYear, int population, double lifeExpectancy, double gnp, double gnpOld, String localName, String governmentForm, String headOfState, int capital, String code2) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.surfaceArea = surfaceArea;
        this.indepYear = indepYear;
        this.population = population;
        this.lifeExpectancy = lifeExpectancy;
        this.gnp = gnp;
        this.gnpOld = gnpOld;
        this.localName = localName;
        this.governmentForm = governmentForm;
        this.headOfState = headOfState;
        this.capital = capital;
        this.code2 = code2;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(Double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public int getIndepYear() {
        return indepYear;
    }

    public void setIndepYear(int indepYear) {
        this.indepYear = indepYear;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(double lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public double getGnp() {
        return gnp;
    }

    public void setGnp(double gnp) {
        this.gnp = gnp;
    }

    public double getGnpOld() {
        return gnpOld;
    }

    public void setGnpOld(double gnpOld) {
        this.gnpOld = gnpOld;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getGovernmentForm() {
        return governmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code2='" + code2 + '\'' +
                ", capital=" + capital +
                ", headOfState='" + headOfState + '\'' +
                ", governmentForm='" + governmentForm + '\'' +
                ", localName='" + localName + '\'' +
                ", gnpOld=" + gnpOld +
                ", gnp=" + gnp +
                ", lifeExpectancy=" + lifeExpectancy +
                ", population=" + population +
                ", indepYear=" + indepYear +
                ", surfaceArea=" + surfaceArea +
                ", region='" + region + '\'' +
                ", continent=" + continent +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}