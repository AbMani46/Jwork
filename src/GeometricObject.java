/**
 * No.32
 */

import java.util.Date;

public class GeometricObject {
    private Date dateCreated;
     String color;
     boolean filled;

    public GeometricObject(){
        dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled){
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "GeometricObject [dateCreated=" + dateCreated + ", color=" + color + ", filled=" + filled + "]";
    }
    
}
