void setup(){
  size(500,500);
fill(#2CBFD1);
ellipse(250,250,100,100);
fill(163,14,26);
rect(50,50,100,100);
fill(123,200,134);
triangle(300,400,350,250,500,500);
}
void draw(){
background(mouseX,200,mouseY);
fill(72,mouseY,mouseX);
rect(mouseX,mouseY,50,50);
fill(mouseY,mouseX,128);
ellipse(mouseY,mouseX-10,50,50);
}
