import java.lang.Math.*;
class FunctionOverloading{
    void area(double r){
        System.out.println("the area of the circle is:"+Math.PI*r*r+"sq.units");
    }
    void area(float l,float b){
        System.out.println("the area of the rectangle is:"+l*b+"sq.units");
    }
    void area(double h, double r){
        System.out.println("the area of the cylinder is:"+2*Math.PI*r*(h+r)+"sq.units");
    }
}
class Area{
    public static void main(String args[]){
        FunctionOverloading ob=new FunctionOverloading();
        ob.area(4.5);
        ob.area(10,5);
        ob.area(5.2,2.5);
    }
}