//public class Main {
//    public static void main(String[] args){
//        int numbers[] = {1,2,3,4,5,6,7,8};
//
//        for (int num : numbers){
//            System.out.println(num);
//        }
//    }
//}


//public class Pizza {
//
//    private static String cookedCount;
//    private boolean isThinCrust;
//
//    public static class PizzaSalesCounter {
//
//        private static String orderedCount;
//        public static String deliveredCount;
//
//        PizzaSalesCounter() {
//            System.out.println("Static field of enclosing class is "
//                    + Pizza.cookedCount);
//            System.out.println("Non-static field of enclosing class is "
//                    + new Pizza().isThinCrust);
//        }
//    }
//
//    Pizza() {
//        System.out.println("Non private static field of static class is "
//                + PizzaSalesCounter.deliveredCount);
//        System.out.println("Private static field of static class is "
//                + PizzaSalesCounter.orderedCount);
//    }
//
//    public static void main(String[] a) {
//        new Pizza.PizzaSalesCounter();
//    }
//}

class Person {
    final int age;

    Person(int age) {
        this.age = age;
    }
}

class Employee extends Person {
    final String name;

    Employee(String name, int age) {
        if (age < 18 || age > 67)
            throw new IllegalArgumentException("Age must be between 18 and 67");
        super(age); // super() is no longer required as the first statement in Java 25
        this.name = name;
    }

    public static void main(String[] args) {
        var emp = new Employee("Alice", 35);
        System.out.println("Person age set: " + emp.age);
    }
}
