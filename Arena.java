
import java.util.Random;



/**
 *  main usw.
 * @author Alf Igel
 */
public class Arena {

    public static final int MonsterGruppe=2;

    Monster[] monsters;

    public static void  statusArena(Monster[] monsters)
    {
        for ( Monster monster : monsters )
        {
            monster.status();
        }
    }




    public static void main(String[] args)
    {

        Monster[] monsters = new Monster[MonsterGruppe];
        monsters[0] = new FireMonster("Robert");
        monsters[1] = new WaterMonster("Sylvia");
        Random randomHit = new Random();

        // effekte modifizieren
        monsters[0].seteffectFire(0.5);
        monsters[0].seteffectWater(0.8);

        monsters[1].seteffectFire(1.5);
        monsters[1].seteffectWater(0.9);

        statusArena(monsters);

        while (!monsters[0].ko() && !monsters[1].ko())
        {
            if (randomHit.nextBoolean())
                monsters[0].getHit(monsters[1]);
            else
                monsters[1].getHit(monsters[0]);

            statusArena(monsters);
        }
    }
}

