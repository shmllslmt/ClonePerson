public class Main {
    public static void main (String[] args) throws CloneNotSupportedException {
       Person original = new Person("Sara", 20);
       original.addHobby("Reading");
       original.addHobby("Writing");
       original.addHobby("Drawing");

       Person clone = (Person) original.clone();

       original.removeHobby("Writing");

        System.out.println("Original Person:");
        System.out.println(original.getName() + " "+ original.getAge() + " with the following hobbies: ");
        for (String hobby: original.getHobbies()) {
            System.out.println("   "+hobby);
        }

        System.out.println("\nClone Person:");
        System.out.println(clone.getName() + " "+ clone.getAge() + " with the following hobbies: ");
        for (String hobby: clone.getHobbies()) {
            System.out.println("   "+hobby);
        }
    }
}