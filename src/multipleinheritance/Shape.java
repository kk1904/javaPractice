package multipleinheritance;
public class Shape implements Rectangle,Triangle{
    @Override
    public void area(float x, float y) {
        System.out.println("area of Rectangle is:="+x*y);
        System.out.println("area of Triangle is:"+x*y/2);
    }
    public static void main(String[] args) {
        Shape shape=new Shape();
        shape.area(10.5f,5.5f);
    }
}
