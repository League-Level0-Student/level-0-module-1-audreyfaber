PImage pepperoni;
PImage sausage ;
void setup() {
pepperoni= loadImage ("pepperoni.jpeg") ;
pepperoni.resize(70,70);
sausage= loadImage ("sausage.png") ;
sausage.resize(70,70) ;
size(500,500) ;
 fill(#F0E4A2);
ellipse(250,250,400,400) ; 
fill(#DB1414) ;
ellipse(250,250,340,340) ;
fill(#FAED74) ;
ellipse(250,250,300,300) ;
}
void draw() {

image (pepperoni,250,300) ;
image (sausage,240,200) ;
image (pepperoni,167,159) ;
image (sausage,116,239) ;


if (mousePressed && (mouseButton==RIGHT)) {
 image(sausage,mouseX,mouseY) ; 
  
}
  else if (mousePressed) {
  image (pepperoni,mouseX,mouseY) ; 
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
