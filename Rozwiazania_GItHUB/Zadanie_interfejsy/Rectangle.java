package pl.samouczek.zbior_zadan;

public class Rectangle implements Figure {

    double sideA;
    double sideB;

    public Rectangle( double sideA, double sideB){
        this.sideA=sideA;
        this.sideB=sideB;
         }

    public double getPerimeter(){
    return 2*(sideB+sideA);
    }

    public double getArea(){
        return sideA*sideB;
    }

}
