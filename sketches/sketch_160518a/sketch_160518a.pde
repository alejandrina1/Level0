import ddf.minim.*; 
AudioSample sound;
PImage pepperoni;      
void setup (){
  Minim minim= new Minim(this);
  sound =minim.loadSample("cat-lazer.wav");
  pepperoni =loadImage("pepperoni.gif");
  size (800, 800);
  fill(204, 153,119);
  ellipse(400,400,500,500);
  fill(255,000,000);
  ellipse(400,400,400,400);
  fill(238,221,000);
  ellipse(400,400,300,300);
  image(pepperoni, 350,450);
  image(pepperoni, 250,350);
  pepperoni.resize(10,10);
  image(pepperoni, 350,250);
}
void draw(){
  if(mousePressed){
    image(pepperoni, mouseX, mouseY);
    sound.trigger();
  }

}


