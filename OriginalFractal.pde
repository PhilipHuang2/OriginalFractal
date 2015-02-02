void setup(){
	size(500,500);
	noLoop();

}
void draw(){
	background(255);
	stroke(0);
	point(width/2, height/2);	
}

void createMaze()
{
	stroke(255*(int)(Math.random()*2)); // line is always randomly white or black
	if( count  == 0)
		//line(x1, y1, x2, y2);
}