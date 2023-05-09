public class Main {
    public static void main(String[] args) {
        Man man=new Man("Peter","Nelson",65,new Woman("Nelly","Nelson"));
        Woman woman=new Woman("Nelly","Nelson",61,new Man("Peter","Popuk"));
        System.out.println(man.getFirstName());
        System.out.println(woman.getLastName());
        woman.deregisterPartnership(false);
        System.out.println(man.getFirstName());
        System.out.println(woman.getLastName());
        woman.deregisterPartnership(true);
        System.out.println(man.getFirstName());
        System.out.println(woman.getLastName());

    }
}