// Anonymous class is nothing but a class without any name.
// They are used to override a class method or interface.
// Anonymous classes in Java help us to write more concise and readable code.
@FunctionalInterface
interface Animal{
    void bark();
}

class AnonDemo{
    public static void main(String[] args) {
        Animal Bruno = new Animal() {
            @Override
            public void bark() {
                System.out.println("Dog barks!");
            }
        };
        Bruno.bark();
    }
}
