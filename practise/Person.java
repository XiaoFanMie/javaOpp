package practise;

class Person {
    static {
        System.out.println("person static");
    }

    public Person(String str) {
        System.out.println("person " + str);
    }
}
