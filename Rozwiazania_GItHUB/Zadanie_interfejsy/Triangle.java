package pl.samouczek.zbior_zadan;

public class Triangle implements Figure {
    double sideA;
    double sideB;
    double sideC;

    public Triangle( double sideA, double sideB){
        this.sideA=sideA;
        this.sideB=sideB;
    }

    public double getPerimeter(){

        sideC=Math.sqrt((Math.pow(sideA,2))+(Math.pow(sideB,2)));

        return sideC+sideB+sideA;
    }

    public double getArea(){
        return 0.5*(sideA*sideB);
    }

}

