public class AccessDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Alice");
        p1.display(); 
 	Person p2 = new Person("Bob");
        p2.secretMethod();
    }
}

class Person {
    private String name;  
    
    public Person(String name) { 
        this.name = name;
    }
	
    
    public void display() { 
        System.out.println("Name: " + name);
    }
    
    protected void secretMethod() { 
        System.out.println("Shhh! This is protected");
    }
}