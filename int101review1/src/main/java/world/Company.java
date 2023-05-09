package world;

import human.Person;
import java.util.Objects;


public class Company {
    private String title;
    private String address;
    private double capital;
    private Person owner;

    public Company(String tile, String address, double capital, Person owner) {
        this.title = tile;
        this.address = address;
        this.capital = capital;
        this.owner = owner;
    }

    public String getTitle() {
        return title;
    }

    public void setTile(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Company{" + "tile=" + title + ", address=" + address + ", capital=" + capital + ", owner=" + owner + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Company other = (Company) obj;
        if (Double.doubleToLongBits(this.capital) != Double.doubleToLongBits(other.capital)) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        return Objects.equals(this.owner, other.owner);
    }
    
    public double dividend(double percent){
        percent = capital * (percent/100);
        return percent;
    }
    
}
