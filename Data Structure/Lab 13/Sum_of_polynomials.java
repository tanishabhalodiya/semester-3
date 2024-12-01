import java.util.*;

class Polynomial{
    class Node{
        int coefc;
        int power;
        Node link;

        public Node(int coefc,int power){
            this.coefc=coefc;
            this.power=power;
            this.link=null;
        }
    }

    //insert first polynomial
    Node first1;
    public void insert1(int coefc,int power){
        Node n1=new Node(coefc,power);
        if(first1==null){
            first1=n1;
            return;
        }
        n1.link=first1;
        first1=n1;

    }

    //insert second polynomial
    Node first2;
    public void insert2(int coefc,int power){
        Node n1=new Node(coefc,power);
        if(first2==null){
            first2=n1;
            return;
        }
        n1.link=first2;
        first2=n1;
    }

    //display the first polynomial
    public void display1(){
        Node temp=first1;
        while(temp!=null){
            System.out.print(temp.coefc+" x^"+temp.power+" + ");
            temp=temp.link;
        }
    }

    //display seocnd polynomial
    public void display2(){
        Node temp=first2;
        while(temp!=null){
            System.out.print(temp.coefc+" x^"+temp.power+" + ");
            temp=temp.link;
        }
    }

    //add two polinomials
    public void sum_polynomial(){
        Node save1=first1;
        Node save2=first2;
        int coefc1=0;
        while(save1!=null && save2!=null){
            if(save1.power==save2.power){
                coefc1=save1.coefc+save2.coefc;
                System.out.print(coefc1+" x^"+save1.power+" + ");
                save1=save1.link;
                save2=save2.link;
            }
            // System.out.print(" ");
            if(save1 != null && save2!=null){
                //if save1 power is big then we have to print it first
                if(save1.power>save2.power){
                    coefc1=save1.coefc;
                    System.out.print(coefc1 + " x^" +save1.power +" + ");
                    save1=save1.link;
                }
                //if save2 power is big then we have to print it first
                else if(save1.power<save2.power){
                    coefc1=save2.coefc;
                    System.out.print(coefc1 + " x^" +save2.power +" + ");
                    save2=save2.link;
                }
                // System.out.print(" ");
            } 
        }

        //if save1 is not null and save 2 is  null then above while loop is over 
        //we have to take this case in condition

        if(save1 != null){
            coefc1=save1.coefc;
            System.out.println(coefc1 + "x^" +save1.power);
            save1=save1.link;
        }
        else if(save2 != null){
            coefc1=save2.coefc;
            System.out.println(coefc1 + "x^" +save2.power);
            save2=save2.link;
        }
}
}
public class Sum_of_polynomials {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Polynomial p1=new Polynomial();
        int power = 0;
        int coefc = 0;
        while (true) {
            System.out.println("press:--- 1 : enter first polinomial ||  2 : Enter Second polynomial || 3 : calculate sum || 4 : exit");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.print("enter cofficient : ");
                    coefc = sc.nextInt();
                    System.out.print("enter power : ");
                    power = sc.nextInt();
                    p1.insert1(coefc, power);
                    break;
                case 2:
                    System.out.print("enter cofficient : ");
                    coefc = sc.nextInt();
                    System.out.print("enter power : ");
                    power = sc.nextInt();
                    p1.insert2(coefc, power);
                    break;
                case 3:
                    System.out.println("Your first polynomial is : ");
                    p1.display1();
                    System.out.println();
                    System.out.println("Your second polinomail is : ");
                    p1.display2();
                    System.out.println();
                    System.out.println("sum of polynomial is : ");
                    p1.sum_polynomial();
                    System.out.println();
                    break;
                case 4:
                    System.exit(0);
            }
        }


        // System.out.println("Enter polynomial - 1 : ");
        // p1.insert1(1,0);
        // p1.insert1(2,1);
        // p1.insert1(3,2);
        
        
        // p1.display1();
        // System.out.println();
        // System.out.println("Enter polynomial - 2 : ");
        // // p2.insert2(3,3);
        // p1.insert2(3,0);
        // p1.insert2(3,1);
        // p1.insert2(3,2);
        
        
        // p1.display2();

        // p1.sum_polynomial();
    }
}
