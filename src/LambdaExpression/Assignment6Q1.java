package LambdaExpression;
interface additionOp
{
    public double addition(int num1,int num2);
}
interface subtractionOp
{
    public double subtraction(int num1,int num2);
}
interface multiplicationOp
{
    public double multiplication(int num1,int num2);
}
interface divisionOp
{
    public double division(int num1,int num2);
}
public class Assignment6Q1 implements additionOp,subtractionOp,multiplicationOp,divisionOp {
    public double addition(int num1,int num2){
        additionOp addObj=(n1,n2)->n1+n2;
        int result = (int) addObj.addition(num1,num2);
        return result;
    }
    public double subtraction(int num1,int num2){
        subtractionOp subObj=(n1,n2)->n1-n2;
        int result = (int) subObj.subtraction(num1,num2);
        return result;
    }
    public double multiplication(int num1,int num2){
        multiplicationOp mulObj=(n1,n2)->n1*n2;
        int result = (int) mulObj.multiplication(num1,num2);
        return result;
    }
    public double division(int num1,int num2){
        divisionOp divObj=(n1,n2)->(double) n1/(double) n2;
        double result = (double) divObj.division(num1,num2);
        return result;
    }
    public static void main(String[] args) {
        Assignment6Q1 obj=new Assignment6Q1();
        System.out.println(obj.addition(13,5));
        System.out.println(obj.subtraction(13,5));
        System.out.println(obj.multiplication(13,5));
        System.out.println(obj.division(13,5));
    }
}

