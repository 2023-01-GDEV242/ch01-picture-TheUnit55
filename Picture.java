/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture 
{
    private Circle sun;
    private Circle sun2;
    private Square base1;
    private Square base2;
    private Square base3;
    private Square base4;
    private Square base5;
    private Square arm1;
    private Square arm2;
    private Square arm3;
    private Square arm4;
    private Triangle corner1;
    private Triangle corner2;
    private Person man;
    private boolean drawn;
    
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sun = new Circle();
        sun2 = new Circle();
        base1 = new Square();
        base2 = new Square();
        base3 = new Square();
        base4 = new Square();
        base5 = new Square();
        arm1 = new Square();
        arm2 = new Square();
        arm3 = new Square();
        arm4 = new Square();
        corner1 = new Triangle();
        corner2 = new Triangle();
        man = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sun2.changeColor("blue");
            sun2.moveHorizontal(-120);
            sun2.moveVertical(-50);
            sun2.changeSize(240);
            sun2.makeVisible();
            
            sun.changeColor("magenta");
            sun.moveHorizontal(-90);
            sun.moveVertical(-33);
            sun.changeSize(180);
            sun.makeVisible();
            
            base1.moveHorizontal(-100);
            base1.moveVertical(100);
            base1.changeSize(40);
            base1.makeVisible();
            base1.changeColor("black");
            
            base2.moveHorizontal(-100);
            base2.moveVertical(60);
            base2.changeSize(40);
            base2.makeVisible();
            base2.changeColor("black");
            
            base3.moveHorizontal(-100);
            base3.moveVertical(20);
            base3.changeSize(40);
            base3.makeVisible();
            base3.changeColor("black");
            
            base4.moveHorizontal(-100);
            base4.moveVertical(-20);
            base4.changeSize(40);
            base4.makeVisible();
            base4.changeColor("black");
            
            base5.moveHorizontal(-100);
            base5.moveVertical(-60);
            base5.changeSize(40);
            base5.makeVisible();
            base5.changeColor("black");
            
            arm1.moveHorizontal(-60);
            arm1.moveVertical(10);
            arm1.changeSize(40);
            arm1.makeVisible();
            arm1.changeColor("black");
            
            arm2.moveHorizontal(-80);
            arm2.moveVertical(10);
            arm2.changeSize(40);
            arm2.makeVisible();
            arm2.changeColor("black");
            
            arm3.moveHorizontal(-120);
            arm3.moveVertical(10);
            arm3.changeSize(40);
            arm3.makeVisible();
            arm3.changeColor("black");
            
            arm4.moveHorizontal(-140);
            arm4.moveVertical(10);
            arm4.changeSize(40);
            arm4.makeVisible();
            arm4.changeColor("black");
    
            corner1.changeSize(20, 100);
            corner1.moveHorizontal(0);
            corner1.moveVertical(100);
            corner1.makeVisible();
            corner1.changeColor("black");
    
            corner2.changeSize(20, 100);
            corner2.moveHorizontal(30);
            corner2.moveVertical(100);
            corner2.makeVisible();
            corner2.changeColor("black");
            
            man.moveHorizontal(-140);
            man.moveVertical(10);
            man.makeVisible();
            man.changeColor("black");
    
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sun.changeColor("black");
        base1.changeColor("white");
        base2.changeColor("white");
        base3.changeColor("white");
        corner1.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sun.changeColor("yellow");
        base1.changeColor("black");
        base2.changeColor("black");
        base3.changeColor("black");
        corner1.changeColor("green");
    }
}
