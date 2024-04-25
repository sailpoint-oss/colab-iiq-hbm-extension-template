package developer.days.sailpoint.object;

import sailpoint.object.SailpointObject;
import sailpoint.object.Identity;

public class Location extends SailpointObject {
    private String street;
    private String country;
    private String state;
    private String zip;
    private Identity janitor;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Identity getJanitor() {
        return janitor;
    }

    public void setJanitor(Identity janitor) {
        this.janitor = janitor;
    }
}