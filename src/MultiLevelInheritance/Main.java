package MultiLevelInheritance;

public class Main {
    public static void main(String[] args) {

       //Child can access Father's and Grand Father's house
        Child c1=new Child();
        c1.grandFatherHouse();
        c1.fatherHouse();
        c1.childHouse();


        //Father can access Grand Father's house and not child's house
        Father f1=new Father();
        f1.grandFatherHouse();


        //Grand Father can access only his own house and cannot access Farher's/Child's house
        GrandFather gf1=new GrandFather();
        gf1.grandFatherHouse();
    }
}
