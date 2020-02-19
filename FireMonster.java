

public class FireMonster extends Monster{

    public  FireMonster( ){
        super("Fire");
        this.setName("FireMonster");
    }

    public  FireMonster( String name ){
        super("Fire");
        this.setName(name);

        this.seteffectFire(1);
        this.seteffectWater(2);
    }

}
