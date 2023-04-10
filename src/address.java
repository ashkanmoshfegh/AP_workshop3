
public class  address
{
    private String zipCode;
    private String country;
    private String city;

    public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
}

    public void setCountry(String country) {
    this.country = country;
}

    public void setCity(String city) {
    this.city = city;
}

    public String toString() {
    if (zipCode == null) zipCode = "-";
    if (country == null) country = "-";
    if (city == null) city = "-";
    return zipCode + " - " + country + " - " + city;
}}
