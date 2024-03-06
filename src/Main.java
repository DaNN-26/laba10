public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Мясо людское", "Пенза", "Шарик", "Чёрный");
        Cat cat1 = new Cat("Китекэт", "Берлин", "Мурзик", "Мейн-кун");
        Horse horse1 = new Horse("Трава", "Чаадаевка", "Морган", 25);
        Veterinar veterinar = new Veterinar("Дмитрий");

        dog1.makeNoise();
        cat1.sleep();
        horse1.eat();
        horse1.sleep();

        veterinar.treatAnimal(cat1);
        veterinar.treatAnimal(dog1);
    }
}
class Animal {
    public String food;
    public String location;
    Animal(String food, String location)
    {
        this.food = food;
        this.location = location;
    }
    public void makeNoise()
    {
        System.out.println("Такое-то животное издаёт звук.");
    }
    public void sleep()
    {
        System.out.println("Такое-то животное спит.");
    }
    public void eat()
    {
        System.out.println("Такое-то животное ест.");
    }
}
class Dog extends Animal {
    public String name;
    public String color;
    Dog(String food, String location, String name, String color)
    {
        super(food, location);
        this.name = name;
        this.color = color;
    }
    @Override
    public void makeNoise()
    {
        System.out.printf("%s пёс %s издаёт звук.\n", this.color, this.name);
    }
    @Override
    public void sleep()
    {
        System.out.printf("%s пёс %s спит.\n", this.color, this.name);
    }
    @Override
    public void eat()
    {
        System.out.printf("%s пёс %s ест.\n", this.color, this.name);
    }
}
class Cat extends Animal {
    public String name;
    public String breed;
    Cat(String food, String location, String name, String breed)
    {
        super(food, location);
        this.name = name;
        this.breed = breed;
    }
    @Override
    public void makeNoise()
    {
        System.out.printf("Кот %s породы %s издаёт звук.\n", this.name, this.breed);
    }
    @Override
    public void sleep()
    {
        System.out.printf("Кот %s породы %s спит.\n", this.name, this.breed);
    }
    @Override
    public void eat()
    {
        System.out.printf("Кот %s породы %s ест.\n", this.name, this.breed);
    }
}
class Horse extends Animal {
    public String name;
    public int age;
    Horse(String food, String location, String name, int age)
    {
        super(food, location);
        this.name = name;
        this.age = age;
    }
    @Override
    public void makeNoise()
    {
        System.out.printf("Конь %s возрастом %d лет издаёт звук.\n", this.name, this.age);
    }
    @Override
    public void sleep()
    {
        System.out.printf("Конь %s возрастом %d лет спит.\n", this.name, this.age);
    }
    @Override
    public void eat()
    {
        System.out.printf("Конь %s возрастом %d лет ест.\n", this.name, this.age);
    }
}
class Veterinar
{
    public String name;
    public Veterinar (String name){this.name = name;}
    public void treatAnimal(Animal animal)
    {
        System.out.printf("На приём к ветеринару %s пришло животное. \nЛокация: %s\nЕда: %s\n", this.name, animal.location, animal.food);
    }
}