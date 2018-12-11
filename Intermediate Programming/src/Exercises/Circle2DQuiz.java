
public class Circle2DQuiz {

public static void main(String[] args) {
//Complete this main method
Circle2D c1 = new Circle2D(2, 2, 5.5);
Circle2D c2 = new Circle2D(4, 5, 10.5);
Circle2D c3 = new Circle2D(3, 5, 2.3);
System.out.println("Area is " +  c1.getArea());
System.out.println("Perimeter is " + c1.getPerimeter());
System.out.println("c1 contains point (3, 3)? " 
+ c1.contains(3, 3));
System.out.println("c1 contains circle Circle2D(4, 5, 10.5)? " 
+ c1.contains(c2));
System.out.println("c1 overlaps circle Circle2D(3, 5, 2.3)? " 
+ c1.overlaps(c3));


	}

}

class Circle2D
{
private double x, y;
private double radius;

public Circle2D()
{
x = 0;
y = 0; 
radius = 1; 
}

public Circle2D(double x, double y, double radius)
{
this.x = x;
this.y = y;
this.radius = radius; 
}
public double getX() 
{
return x;
}
public void setX(double x)
{
this.x = x;
}

public double getY()
{
return y;
}

public void setY(double y)
{
this.y = y; 
}



public double getRadius()
{
return radius; 
}

public void setRadius(double radius)
{
this.radius = radius; 
}
//Complete this method
public double getArea()
{
return Math.PI * (radius * radius); 
}
//Complete this method
public double getPerimeter()
{
return 2 * (Math.PI * radius);
}

private static double distance(double x1, double y1, double x2, double y2)
{
return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
}

public boolean contains(double x, double y)
{
double d = distance(x,y, this.x, this.y);
return d <= radius; 
}

public boolean contains(Circle2D circle)
{
//Complete this method

	double d = distance(this.x, this.y, circle.x, circle.y);
	return d <= this.radius - circle.radius; 
	} 
	 
public boolean overlaps(Circle2D circle)
{
//two circles overlap if the distance between the two centers
//are less than or equal to this. radius + circle.radius
return distance(this.x, this.y, circle.x, circle.y)
<= (this.radius + circle.radius); 
}

}
