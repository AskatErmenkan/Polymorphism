//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//    Todo Animal деген класс туз жана бир метод кош. Анын 3 наследнигин туз. Акула деген класска чабуул(),
//     Черепаха деген класска сузуу() жана Орел деген класска учуу() методдорун туз. Animal тибин колдонуп
//     массив туз жана ал жакка анын наследниктерин кош. экземплярOf жана getClass()-ты колдонуп
//     Массив животных жаныбарлардын оздорун методундорун чыгар. Ар бир объект учун оз-озунчо массив тузуп,
//     Animal массивиндеги жаныбарларды болуп оз озунун массивине сал.

        Animal[] animals = new Animal[3];
        animals[0] = new Shark();
        animals[1] = new Turtle();
        animals[2] = new Eagle();

        for (Animal animal : animals){
            if (animal instanceof Shark){
                ((Shark) animal).attack();
            } else if (animal instanceof Turtle) {
                ((Turtle) animal).swim();
            } else if (animal instanceof Eagle) {
                ((Eagle) animal).fly();}}

        Shark[] sharks = new Shark[1];
        Turtle[] turtles = new Turtle[1];
        Eagle[] eagles = new Eagle[1];

        int sharkIndex = 0, turtleIndex = 0, eagleIndex = 0;

        for (Animal animal : animals){
            if (animal instanceof Shark) {
                sharks[sharkIndex ++] = (Shark) animal;
            }else if (animal instanceof Turtle){
                turtles[turtleIndex ++] = (Turtle) animal;
            } else if (animal instanceof Eagle) {
                eagles [eagleIndex ++] = (Eagle) animal;}}}}