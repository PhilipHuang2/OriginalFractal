void setup(){
	size(500,500);
	noLoop();

}
void draw(){
	background(255);
	stroke(0);
	strokeWeight(5);
	point(width/2, height/2);
	line(0,height/2,width,height/2);
	line(2,0,2,height);
	line(width-3,0,width-3,height);
}

