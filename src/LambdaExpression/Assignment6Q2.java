package LambdaExpression;
import java.util.ArrayList;

public class Assignment6Q2 {

    private int totalPrice;
    private String status;

    public static ArrayList<Assignment6Q2> listOfOrders(ArrayList<Assignment6Q2> orders)
    {
        ArrayList<Assignment6Q2> arrList=new ArrayList<>();
        orders.forEach(order->{
            if(order.totalPrice>1000 && (order.status=="COMPLETED" ||order.status=="ACCEPTED"))
            {
                arrList.add(order);
            }
        });
        return arrList;
    }
    public String toString()
    {
        return "Total Price:"+totalPrice+" Status:"+ status;
    }
    public static void main(String[] args)
    {
        Assignment6Q2 obj =new Assignment6Q2();
        obj.status="COMPLETED";
        obj.totalPrice=999;

        Assignment6Q2 obj1 =new Assignment6Q2();
        obj1.status="COMPLETED";
        obj1.totalPrice=1001;

        Assignment6Q2 obj2 =new Assignment6Q2();
        obj2.status="ACCEPTED";
        obj2.totalPrice=1002;

        ArrayList<Assignment6Q2> alist=new ArrayList<>();
        alist.add(obj);
        alist.add(obj1);
        alist.add(obj2);
        ArrayList<Assignment6Q2> result=obj.listOfOrders(alist);
//        for(Assignment4Q2 order: result)
//        {
//            System.out.println(order);
//        }
        result.forEach(order-> System.out.println("Total Price:"+ order.totalPrice+" Status:"+ order.status));
    }
}

