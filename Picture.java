/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael K�lling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

	private Square sky;
    private Square baseA;
    private Square baseB;
    private Square baseC;
    private Square baseD;
    private Square baseE;
    private Square baseF;
    private Square baseG;
    private Square baseH;
    private Square baseI;
    private Square baseJ;
    private Square baseK;
    private Square baseL;
    private Square baseM;
    private Square building1;
    private Square window; 
    private Square window2; 
    private Square window3;
    private Person person;
    private Person person2;
    private Person person3;
    private Person person4;
    private Triangle hat;
    private Triangle hat2;
    private Triangle hat3;
    private Triangle hat4;
    private Triangle roof;
    private Circle moon;
    private Circle sun;
    private boolean drawn;
/**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sky = new Square();
        baseA = new Square();
        baseB = new Square();
        baseC = new Square();
        baseD = new Square();
        baseE = new Square();
        baseF = new Square();
        baseG = new Square(); 
        baseH = new Square(); 
        baseI = new Square(); 
        baseJ = new Square(); 
        baseK = new Square(); 
        baseL = new Square(); 
        baseM = new Square();
        building1 = new Square(); 
        window = new Square(); 
        window2 = new Square(); 
        window3 = new Square(); 
        person = new Person();
        person2 = new Person();
        person3 = new Person();
        person4 = new Person();
        hat = new Triangle();
        hat2 = new Triangle();
        hat3 = new Triangle();
        hat4 = new Triangle();
        roof = new Triangle();  
        moon = new Circle();
        sun = new Circle();
        drawn = false;
    }
/**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.moveHorizontal(-350);
            sky.moveVertical(-200);
            sky.changeSize(750);
            sky.changeColor("dark blue");
            sky.makeVisible();
            
            baseA.changeColor("green");
            baseA.moveHorizontal(150);
            baseA.moveVertical(140);
            baseA.changeSize(40);
            baseA.makeVisible(); 
            
            baseB.changeColor("green");
            baseB.moveHorizontal(110);
            baseB.moveVertical(140);
            baseB.changeSize(40);
            baseB.makeVisible();
            
            baseC.changeColor("green");
            baseC.moveHorizontal(70);
            baseC.moveVertical(140);
            baseC.changeSize(40);
            baseC.makeVisible();
            
            baseD.changeColor("green");
            baseD.moveHorizontal(30);
            baseD.moveVertical(140);
            baseD.changeSize(40);
            baseD.makeVisible();
            
            baseE.changeColor("green");
            baseE.moveHorizontal(-10);
            baseE.moveVertical(140);
            baseE.changeSize(40);
            baseE.makeVisible();
            
            baseF.changeColor("green");
            baseF.moveHorizontal(-50);
            baseF.moveVertical(140);
            baseF.changeSize(40);
            baseF.makeVisible();
            
            baseG.changeColor("green");
            baseG.moveHorizontal(-90);
            baseG.moveVertical(140);
            baseG.changeSize(40);
            baseG.makeVisible();
            
            baseH.changeColor("green");
            baseH.moveHorizontal(-130);
            baseH.moveVertical(140);
            baseH.changeSize(40);
            baseH.makeVisible();
    
            baseI.changeColor("green");
            baseI.moveHorizontal(-170);
            baseI.moveVertical(140);
            baseI.changeSize(40);
            baseI.makeVisible();
            
            baseJ.changeColor("green");
            baseJ.moveHorizontal(-210);
            baseJ.moveVertical(140);
            baseJ.changeSize(40);
            baseJ.makeVisible();
            
            baseK.changeColor("green");
            baseK.moveHorizontal(-250);
            baseK.moveVertical(140);
            baseK.changeSize(40);
            baseK.makeVisible();
            
            baseL.changeColor("green");
            baseL.moveHorizontal(-290);
            baseL.moveVertical(140);
            baseL.changeSize(40);
            baseL.makeVisible();
            
            baseM.changeColor("green");
            baseM.moveHorizontal(-330);
            baseM.moveVertical(140);
            baseM.changeSize(40);
            baseM.makeVisible();
            
            building1.changeColor("blue");
            building1.moveHorizontal(90);
            building1.moveVertical(50);
            building1.changeSize(100);
            building1.makeVisible();
            
            person.changeColor("pink");
            person.moveHorizontal(-40);
            person.moveVertical(10);
            person.changeSize(100,60);
            person.makeVisible();
            
            hat.changeSize(65, 35);
            hat.changeColor("light blue");
            hat.moveHorizontal(30);
            hat.moveVertical(-25);
            hat.makeVisible();
            
            
            person2.changeColor("purple");
            person2.moveHorizontal(-100);
            person2.moveVertical(0);
            person2.changeSize(120,80);
            person2.makeVisible();
            
            hat2.changeSize(75, 45);
            hat2.changeColor("yellow");
            hat2.moveHorizontal(-30);
            hat2.moveVertical(-45);
            hat2.makeVisible();
            
            person3.changeColor("rose");
            person3.moveHorizontal(-10);
            person3.moveVertical(10);
            person3.changeSize(80,40);
            person3.makeVisible();
            
            hat3.changeSize(40, 30);
            hat3.changeColor("light green");
            hat3.moveHorizontal(60);
            hat3.moveVertical(10);
            hat3.makeVisible();
            
            
            
            person4.changeColor("light blue");
            person4.moveHorizontal(-150);
            person4.moveVertical(0);
            person4.changeSize(110,50);
            person4.makeVisible();
            
            hat4.changeSize(55, 35);
            hat4.changeColor("pink");
            hat4.moveHorizontal(-80);
            hat4.moveVertical(-20);
            hat4.makeVisible();
            
            roof.changeSize(60, 110);
            roof.changeColor("purple");
            roof.moveHorizontal(250);
            roof.moveVertical(-30);
            roof.makeVisible();
            
            window.changeColor("yellow");
            window.moveHorizontal(110);
            window.moveVertical(110);
            window.changeSize(20);
            window.makeVisible(); 
            
            window2.changeColor("yellow");
            window2.moveHorizontal(130);
            window2.moveVertical(90);
            window2.changeSize(20);
            window2.makeVisible(); 
            
            window3.changeColor("yellow");
            window3.moveHorizontal(150);
            window3.moveVertical(70);
            window3.changeSize(20);
            window3.makeVisible(); 
            
            
           
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible(); 
            drawn = true;
            
            moon.changeColor("dark blue");
            moon.moveHorizontal(130);
            moon.moveVertical(-60);
            moon.changeSize(80);
            moon.makeVisible();
            
            
        }
}
}
