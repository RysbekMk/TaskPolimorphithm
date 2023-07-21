public class Main {
    public static void main(String[] args) {

        Animal shark = new Shark();
        Animal turtle = new Turtle();
        Animal eagle = new Eagle();
        Animal shark1 = new Shark();
        Animal turtle1 = new Turtle();
        Animal eagle1 = new Eagle();
        Animal[] animals = {shark, turtle, eagle,shark1,turtle1,eagle1};
        for (Animal animals1 : animals
        ) {
            if (animals1 instanceof Shark) {
                ((Shark) animals1).attack();
            } else if (animals1 instanceof Turtle) {
                ((Turtle) animals1).swimm();
            } else if (animals1 instanceof Eagle){
                ((Eagle) animals1).fly();
            }
        }Animal[] sharks ={shark,shark1};
        Animal[] turtls = {turtle,turtle1};
        Animal[] eagles = {eagle,eagle1};
    }
}
