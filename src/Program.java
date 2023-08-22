import Classes.ShapeObjectFactory;
import Interface.IShape;

public class Program {
    public static void main(String[] args) throws Exception {
        
        ShapeObjectFactory sof = new ShapeObjectFactory();

        IShape shape = sof.GetShape("Rectangle");
        shape.print();
        shape = sof.GetShape("Rectangle");
        shape.print();
        shape = sof.GetShape("Rectangle");
        shape.print();

        shape = sof.GetShape("Circle");
        shape.print();
        shape = sof.GetShape("Circle");
        shape.print();
        shape = sof.GetShape("Circle");
        shape.print();

        int numObjs = sof.getTotalObjectsCreated();
        System.out.println("\nTotal No of Objects created = " + numObjs);
        
    }
}
