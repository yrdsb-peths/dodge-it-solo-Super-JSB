import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Fries extends Actor
{
    
    public void act()
    {
        move(-3);
        
        if(getX() <= 0){
            resetFries();
        }
        
        if(isTouching(Hero.class))
        {
            Skull skull = new Skull();
            getWorld().addObject(skull, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    public void resetFries()
    {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0)
        {
            setLocation(600, 100);
        } else {
            setLocation(600, 300);
        }
    }
}
