/**
 * Created by digibrose on 24/11/2014.
 */
public class IntegerTreeNodeTest {

    IntegerTreeNode RootIntegerTreeNode;

    public static void main (String[] args) {


     IntegerTreeNode IT1 = new IntegerTreeNode(6);
     IT1.add(5);
     IT1.add(8);
     IT1.add(3);
     IT1.add(14);
     IT1.add(2);
     IT1.add(21);
     IT1.add(7);

     System.out.println("Does IT1 contain 6? " + IT1.contains(32));
     System.out.println("The highest value in IT1 is " + IT1.getMax());
     System.out.println("The lowest value in IT1 is " + IT1.getMin());


    }

}
