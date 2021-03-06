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
	private Square ground;
    private Square bg;
    private Square wood;
    private Square wood_1;
    private Triangle tree;
    private Triangle tree1;
    private Triangle tree2;
    private Triangle tree3;
    private Triangle tree4;
    private Triangle tree_1;
    private Triangle tree1_1;
    private Triangle tree2_1;
    private Triangle tree3_1;
    private Triangle tree4_1;
    private Person slender;
    private Circle moon;
    private Triangle arm;
    private Triangle arm1;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    //public Picture()
    {
        ground = new Square();
        bg = new Square();
        window = new Square();
        tree = new Triangle();
        tree1 = new Triangle();
        tree2 = new Triangle();
        tree3 = new Triangle();
        tree4 = new Triangle();
        tree_1 = new Triangle();
        tree1_1 = new Triangle();
        tree2_1 = new Triangle();
        tree3_1 = new Triangle();
        tree4_1 = new Triangle();
        wood = new Square();
        wood_1= new Square();
        moon = new Circle();
        slender = new Person();
        arm = new Triangle();
        arm1 = new Triangle();
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
    
    public void draw_Legocki()
    {
        Circle outerBow;
        Circle innerBow;
        Person dude;
        Circle ring1;
        Circle ring2;
        Circle ring3;
        Circle ring4;
        Triangle outerFeet;
        Triangle innerFeet;
        Square tip;
        Square shaft1;
        Square shaft2;
        Square shaft3;
        
        outerBow = new Circle(40,260,180,"red");
        innerBow = new Circle(40,265,178,"white");
        dude = new Person();
        ring1 = new Circle(60,110,150,"magenta");
        ring2 = new Circle(50,115,155,"yellow");
        ring3 = new Circle(30,125,165,"green");
        ring4 = new Circle(10,135,175,"red");
        outerFeet = new Triangle(40,50,140,185,"black");
        innerFeet = new Triangle(60,70,140,200,"white");
        tip = new Square(10,200,180,"black");
        shaft1 = new Square(10,210,180,"red");
        shaft2 = new Square(10,220,180,"red");
        shaft3 = new Square(10,230,180,"red");
        
        outerBow.makeVisible();
        innerBow.makeVisible();
        dude.makeVisible();
        outerFeet.makeVisible();
        innerFeet.makeVisible();
        ring1.makeVisible();
        ring2.makeVisible();
        ring3.makeVisible();
        ring4.makeVisible();
        tip.makeVisible();
        shaft1.makeVisible();
        shaft2.makeVisible();
        shaft3.makeVisible();
    }


    private Square square1;
    private Square square2;
    private Square square3;
    private Square square4;
    private Triangle triangle1;
    private Triangle triangle2;
    private Circle circle;
    private Person person;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        square1 = new Square();
        square2 = new Square();
        square3 = new Square();
        square4 = new Square();
        triangle1 = new Triangle();
        triangle2 = new Triangle();
        circle = new Circle();
        person = new Person();
        drawn = false;
    }

    public void draw_Rodriguez()
    {
        if(!drawn) {
            
            
            bg.moveHorizontal(-400);
            bg.moveVertical(-200);
            bg.changeSize(1500);
            bg.changeColor("grey");
            bg.makeVisible();
            
    
            ground.moveHorizontal(-350);
            ground.moveVertical(115);
            ground.changeSize(1500);
            ground.changeColor("dark_grey");
            ground.makeVisible();
            
            moon.changeColor("silver");
            moon.moveHorizontal(180);
            moon.moveVertical(-70);
            moon.changeSize(45);
            moon.makeVisible();
            
            tree.changeSize(35, 85);
            tree.moveHorizontal(-145);
            tree.moveVertical(-80);
            tree.makeVisible();
            tree.changeColor("black_grey");
            
            tree1.changeSize(35, 85);
            tree1.moveHorizontal(-145);
            tree1.moveVertical(-55);
            tree1.makeVisible();
            tree1.changeColor("black_grey");
            
            tree2.changeSize(35, 85);
            tree2.moveHorizontal(-145);
            tree2.moveVertical(-30);
            tree2.makeVisible();
            tree2.changeColor("black_grey");
            
            tree3.changeSize(35, 85);
            tree3.moveHorizontal(-145);
            tree3.moveVertical(-2);
            tree3.makeVisible();
            tree3.changeColor("black_grey");
            
            tree4.changeSize(35, 85);
            tree4.moveHorizontal(-145);
            tree4.moveVertical(26);
            tree4.makeVisible();
            tree4.changeColor("black_grey");
            
            tree_1.changeSize(35, 85);
            tree_1.moveHorizontal(215);
            tree_1.moveVertical(-80);
            tree_1.makeVisible();
            tree_1.changeColor("black_grey");
            
            tree1_1.changeSize(35, 85);
            tree1_1.moveHorizontal(215);
            tree1_1.moveVertical(-55);
            tree1_1.makeVisible();
            tree1_1.changeColor("black_grey");
            
            tree2_1.changeSize(35, 85);
            tree2_1.moveHorizontal(215);
            tree2_1.moveVertical(-30);
            tree2_1.makeVisible();
            tree2_1.changeColor("black_grey");
            
            tree3_1.changeSize(35, 85);
            tree3_1.moveHorizontal(215);
            tree3_1.moveVertical(-2);
            tree3_1.makeVisible();
            tree3_1.changeColor("black_grey");
            
            tree4_1.changeSize(35, 85);
            tree4_1.moveHorizontal(215);
            tree4_1.moveVertical(26);
            tree4_1.makeVisible();
            tree4_1.changeColor("black_grey");
            
            wood.moveHorizontal(-260);
            wood.moveVertical(81);
            wood.changeSize(35);
            wood.changeColor("black_grey");
            wood.makeVisible();
            
            wood_1.moveHorizontal(100);
            wood_1.moveVertical(81);
            wood_1.changeSize(35);
            wood_1.changeColor("black_grey");
            wood_1.makeVisible();
            
            slender.changeSize(140,20);
            slender.moveVertical(-20);
            slender.changeColor("silver");
            slender.makeVisible();
            
            arm.changeSize(8,40);
            arm.moveHorizontal(70);
            arm.moveVertical(38);
            arm.changeColor("silver");
            arm.makeVisible();
            
            arm1.changeSize(8,40);
            arm1.moveHorizontal(70);
            arm1.moveVertical(46);
            arm1.changeColor("silver");
            arm1.makeVisible();
    
            
            drawn = true;
        }
    }

    /**
     * Draw this picture.
     */
    public void draw_Raymond()
    {
        if(!drawn) {
            square2.changeColor("blue");
            square2.changeSize(2000);
            square2.moveHorizontal(-310);
            square2.moveVertical(-300);
            square2.makeVisible();
            
            square3.changeColor("green");
            square3.changeSize(2000);
            square3.moveHorizontal(-310);
            square3.moveVertical(100);
            square3.makeVisible();
            
            square1.changeColor("brown");
            square1.moveVertical(100);
            square1.moveHorizontal(-115);
            square1.changeSize(30);
            square1.makeVisible();
            
            square4.changeColor("brown");
            square4.moveVertical(70);
            square4.moveHorizontal(-115);
            square4.changeSize(30);
            square4.makeVisible();
            
            triangle1.changeColor("green");
            triangle1.makeVisible();
            
            triangle2.moveVertical(-30);
            triangle2.makeVisible();
            
            circle.changeColor("yellow");
            circle.moveHorizontal(150);
            circle.moveVertical(-50);
            circle.makeVisible();
            
            person.moveVertical(-10);
            person.makeVisible();
            
            drawn = true;
        }
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
