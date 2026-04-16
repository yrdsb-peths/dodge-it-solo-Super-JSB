import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Hero hero = new Hero();
        addObject(hero, 100, 100);
        Fries fries = new Fries();
        addObject(fries, 600, 100);
        
    }
}
