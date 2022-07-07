package animals;


public class Duck extends Animal implements Flying {

    @Override
    public void say() {
        System.out.println("Я говорю КРЯ");
    }

    public void Fly(){
        System.out.println("Я лечу");
    }

}
