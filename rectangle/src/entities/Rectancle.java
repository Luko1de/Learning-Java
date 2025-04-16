package entities;

public class Rectancle {
    public Double width;
    public Double height;

    public Double Area(){

        return width*height;

    }
    public Double Perimeter(){

        return ((width*2) + (height*2));

    }
    public Double Diagonal() {
        return (Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)));
    }
}
