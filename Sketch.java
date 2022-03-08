import processing.core.PApplet;
import java.util.Random;
public class Sketch extends PApplet {
  Random r = new Random();
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
  size(400, 400);

}

/** 
 * Called once at the beginning of execution.  Add initial set up
 * values here i.e background, stroke, fill etc.
 */
public void setup() {
  noLoop();
  background(34, 206, 245);
}

/**
 * Called repeatedly, anything drawn to the screen goes here
 */
public void draw() {
  
  int scaledwidth = width/400;
  int scaledheight = height/400;

// sun
float sunX = r.nextInt(400);
float sunY = r.nextInt(250);

if (sunX <= 200) {
  stroke(0);
  fill(255, 0, 0);
} 
else {
  stroke(0);
  fill(250, 225, 0);
}

if (sunY >= 175 && sunY <= 250) {
  background(145, 94, 255);
}
else {
  background(34, 206, 245);
}

ellipse(sunX * scaledwidth, sunY * scaledheight, 100 * scaledwidth, 100 * scaledheight);

// ground color (foreground)
  stroke(74, 50, 1);
  fill(74, 50, 1);
  rect(0 * scaledwidth, 325 * scaledheight, 400 * scaledwidth, 100 * scaledheight);

// lawn (foreground)
  stroke(0);
  fill(22, 181, 72);
  rect(75 * scaledwidth, 325 * scaledheight, 275 * scaledwidth, 250 * scaledheight);
  //rect(600, 650, 250, 50);

// pathway (foreground)
  stroke(0);
  fill(130, 148, 148);
  rect(195 * scaledwidth, 325 * scaledheight, 40 * scaledwidth, 100 * scaledheight);    
  
// house shape
  stroke(0);
  fill(247, 186, 62);
  rect(125 * scaledwidth, 150 * scaledheight, 175 * scaledwidth, 175 * scaledheight);

// roof
  stroke(0);
  fill(153, 99, 0);
  triangle(75 * scaledwidth, 150 * scaledheight, 212 * scaledwidth , 50 * scaledheight, 350 * scaledwidth, 150 * scaledheight);
  
//door
  stroke(0);
  fill(74, 50, 1);
  rect(195 * scaledwidth, 275 * scaledheight, 40 * scaledwidth, 50 * scaledheight);
  ellipse(230 * scaledwidth, 305 * scaledheight, 7 * scaledwidth, 7 * scaledheight);

// window
  stroke(0);
  fill(185, 250, 249);
  rect(195 * scaledwidth , 175 * scaledheight, 40 * scaledwidth, 40 * scaledheight);
  
  // line(390, 390, 470, 390);
  line(195 * scaledwidth, 195 * scaledheight, 235 * scaledwidth, 195 * scaledheight);
  line(215 * scaledwidth, 175 * scaledheight, 215 * scaledwidth, 215* scaledheight);
  
  

  int d = day();    // Values from 1 - 31
  int m = month();  // Values from 1 - 12
  int y = year();   // 2003, 2004, 2005, etc.
  
  String s = String.valueOf(d);
  fill(117, 0, 0);
  textSize(30);
  text(month() + "-" + day() + "-" + year(), 0, 25);

// define other methods down here.
  }
}