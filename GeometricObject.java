package Week_5;


import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject(){
        this.color = "white";
        Date now = new Date();
        this.dateCreated = now;
    }

    public GeometricObject(String color, boolean filled)
    {
        Date now = new Date();
        this.dateCreated = now;
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + this.dateCreated.toString() + "\ncolor: " + this.color + " and filled: " + this.filled;
    }
}
