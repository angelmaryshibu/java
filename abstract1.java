import java.util.*;
abstract class shapes
{
    abstract void sides();
}
class rectangel extends shapes
{
    void sides()
    {
        System.out.println("rectangel has 3 sides");
    }
}
class triangle extends shapes
{
    void sides()
    {
        System.out.println("triangle has 3 sides");
    }
}
class hexagon extends shapes
{
    void sides()
    {
        System.out.print("hexagon has 3 sides");
    }
}
public class abstract1
{
	public static void main(String[] args) 
	{
		rectangel r=new rectangel();
		triangle t=new triangle();
		hexagon h=new hexagon();
		r.sides();
		t.sides();
		h.sides();
	}
}

