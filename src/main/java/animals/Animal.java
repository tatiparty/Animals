package animals;


public abstract class Animal {

    protected String name;
    protected int age;
    protected int weight;
    protected String color;

    public Animal() {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() { return weight; }

    public void setWeight(int weight) { this.weight = weight; }

    public void say(){
        System.out.println("Я говорю");
    };

    public static void go() {
        System.out.println("Я иду");
    }

    public static void drink() {
        System.out.println("Я пью");
    }

    public static void eat() {
        System.out.println("Я ем");
    }

    @Override
    public String toString() {
        String str = Integer.toString(age);

        if( age == 11){
            return "Привет! меня зовут " + name + ", мне " + age + " лет, я вешу "
                    + weight + " кг, мой цвет - " + color;
        } else if ( age == 1 || str.endsWith("1")) {
            return "Привет! меня зовут " + name + ", мне " + age + " год, я вешу "
                    + weight + " кг, мой цвет - " + color;
        } else if ( age == 2 || age == 3 || age == 4){
            return "Привет! меня зовут " + name + ", мне " + age + " года, я вешу "
                    + weight + " кг, мой цвет - " + color;
        } else {
            return "Привет! меня зовут " + name + ", мне " + age + " лет, я вешу "
                    + weight + " кг, мой цвет - " + color;
        }

    }

}
