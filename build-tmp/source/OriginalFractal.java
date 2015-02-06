import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

public void setup(){
	size(900,600);
	noLoop();

}
public void draw(){
	background(255);
	/*
	stroke(0);
	strokeWeight(5);
	point(width/2, height/2);
	line(0,height/2,width,height/2);
	line(2,0,2,height);
	line(width-3,0,width-3,height);
	*/
	loopT(800,50,800);
	//line(250, 250-15, 250, 250+15);
 	//line(250-10, 250-10, 250+10, 250-10);
}

public void loopT(int centerX, int centerY, int tall)
{
	//each t is an square of ()
	if(tall <= 50)
	{
		line(centerX, centerY-15, centerX, centerY+15);
		line(centerX-10, centerY-10, centerX+10, centerY-10);

	}
	else 
	{
	  loopT(centerX, centerY, tall/2);
	  loopT(centerX-tall/2, centerY, tall/2);
	  loopT(centerX-tall/2, centerY+tall/3, tall/2);
	  loopT(centerX-tall/2, centerY+tall/3, tall/2);	
	}
	

}
	
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
