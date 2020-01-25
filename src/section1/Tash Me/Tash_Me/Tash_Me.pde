PImage mustache;
PImage friend;
void setup() {
  friend = loadImage("friend.jpg");
  mustache = loadImage("download.png");
size(800, 500);
friend.resize(width,height);
mustache.resize(width/10,height/10);
}

void draw() {
background(friend); 

if (mouseButton == RIGHT){
  image(mustache, mouseX-135,mouseY);
image(mustache, mouseX+45,mouseY);
}
else {
  background(friend); 
}
}
