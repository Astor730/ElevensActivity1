/**
 * Created by Teacher on 1/7/2019.
 */
public class CardTester
{
    public static void main(String[] args)
    {
        Card nine = new Card("Nine", "heart", 9);
        Card Jack2 = new Card("Jack", "spade", 11);
        Card Jack = new Card("Jack", "spade", 11);
        System.out.println(Jack.suit());
        System.out.println(Jack.rank());
        System.out.println(Jack.pointValue());
        System.out.println(Jack.toString());
        System.out.println(Jack.matches(Jack2));
        System.out.println(nine.matches(Jack));
    }
}
