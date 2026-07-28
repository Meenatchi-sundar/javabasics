class Instancevar{// CLASS LEVEl
    //Instance var means declared inside a class level without static
    String restaurantName;
    int totalTables;

    public static void main(String args[])
    {
        Instancevar branch1 = new Instancevar();
        branch1.restaurantName = "meenax hotel - tnagar";
        branch1.totalTables = 20;

        Instancevar branch2 = new Instancevar();
        branch2.restaurantName = "meenax hotel - ANNAnagar";
        branch2.totalTables = 20;

        System.out.println(branch1.restaurantName +  branch1.totalTables);
        System.out.println(branch2.restaurantName +  branch2.totalTables);
    }
    }
        

