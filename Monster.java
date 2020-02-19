/**
 *  Abstrakte Monsterklasse usw.
 */

public abstract class Monster{

    /**
     *  konstanten für Monstertypen
     */
    public static final String Fire="Fire";
    public static final String Water="Water";

    private String name;
    private String type = "Normal";

    private int damage=10;

    private int life=100;

    private double effectWater=1;
    private double effectFire=1;

    public Monster(){

    }

    public Monster(String type) {
        this();
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public double getEffectWater() {
        return effectWater;
    }

    public double getEffectFire() {
        return effectFire;
    }

    public int getLife() {
        return life;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void seteffectWater(double effectWater) {
        this.effectWater = effectWater;
    }

    public void seteffectFire(double effectFire) {
        this.effectFire = effectFire;
    }


    public void getHit( Monster enemy ){

        if ( enemy.getType( ).equals(Fire))
        {
            life -= ( enemy.getDamage( ) * effectFire );
        }

        if ( enemy.getType( ).equals(Water))
        {
            life -= ( enemy.getDamage( ) * effectWater );
        }

        else {
            this.life -= enemy.getDamage( );
        }
    }

    public boolean ko(  ){

        if ( life < 1)
                return true;
            else
                return false;
    }

    public void status ()
    {
        System.out.println( "----------------------------------"+
                            " \n "+ "Name: " + this.getName()+
                            " Type: " + this.getType()+
                            " Life: " + this.getLife()+
                            " EffectFire: " + this.getEffectFire()+
                            " EffectWater: " + this.getEffectWater());
    }
}