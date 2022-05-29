import ru.gb.java2.lesson1.*;

public class Main {
    public static void main(String[] args) {
        Action[] members = {new Human(3,3), new Robot(10,10), new Cat(1,2)};
        Barrier[] barriers = {new Wall(5), new Treadmill(6), new Wall(8), new Treadmill(1)};

        for (int i=0; i < members.length; i++) {
            for (int g=0; g < barriers.length; g++) {
                if (barriers[g] instanceof Wall) {
                    members[i].jump();
                    if (barriers[g].getHeight() >= members[i].getMaxHeight()) {
                        System.out.println("не прыгнул");
                        break;
                    }
                    else System.out.println("уии пригнул");

                }
                else {
                    members[i].run();
                    if (barriers[g].getLength() >= members[i].getMaxDistance()) {
                        System.out.println("не добежал");
                        break;
                    }
                    else System.out.println("уии добежал");
                }

            }

        }




    }
}