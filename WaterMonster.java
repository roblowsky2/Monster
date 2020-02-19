

public class WaterMonster extends Monster{

    public  WaterMonster( ){
        super("Water");
        this.setName("WaterMonster");
    }

    public  WaterMonster( String name ){
        super("Water");
        this.setName(name);

        this.seteffectFire(0.3);
        this.seteffectWater(0.8);
    }


}
