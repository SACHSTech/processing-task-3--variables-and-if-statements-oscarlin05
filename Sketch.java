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
  
  int scaledWidth = width/400;
  int scaledHeight = height/400;

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

ellipse(sunX * scaledWidth, sunY * scaledHeight, 100 * scaledWidth, 100 * scaledHeight);

// ground color (foreground)
  stroke(74, 50, 1);
  fill(74, 50, 1);
  rect(0 * scaledWidth, 325 * scaledHeight, 400 * scaledWidth, 100 * scaledHeight);

// lawn (foreground)
  stroke(0);
  fill(22, 181, 72);
  rect(75 * scaledWidth, 325 * scaledHeight, 275 * scaledWidth, 250 * scaledHeight);
  //rect(600, 650, 250, 50);

// pathway (foreground)
  stroke(0);
  fill(130, 148, 148);
  rect(195 * scaledWidth, 325 * scaledHeight, 40 * scaledWidth, 100 * scaledHeight);    
  
// house shape
  stroke(0);
  fill(247, 186, 62);
  rect(125 * scaledWidth, 150 * scaledHeight, 175 * scaledWidth, 175 * scaledHeight);

// roof
  stroke(0);
  fill(153, 99, 0);
  triangle(75 * scaledWidth, 150 * scaledHeight, 212 * scaledWidth , 50 * scaledHeight, 350 * scaledWidth, 150 * scaledHeight);
  
//door
  stroke(0);
  fill(74, 50, 1);
  rect(195 * scaledWidth, 275 * scaledHeight, 40 * scaledWidth, 50 * scaledHeight);
  ellipse(230 * scaledWidth, 305 * scaledHeight, 7 * scaledWidth, 7 * scaledHeight);

// window
  stroke(0);
  fill(185, 250, 249);
  rect(195 * scaledWidth , 175 * scaledHeight, 40 * scaledWidth, 40 * scaledHeight);
  
  // line(390, 390, 470, 390);
  line(195 * scaledWidth, 195 * scaledHeight, 235 * scaledWidth, 195 * scaledHeight);
  line(215 * scaledWidth, 175 * scaledHeight, 215 * scaledWidth, 215* scaledHeight);
  
  

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