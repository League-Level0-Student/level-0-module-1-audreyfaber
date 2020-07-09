void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
  
    fill (#FF1742) ;
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill (#55DEA6) ;
    rect(176, 103, 12, 32);
   
    if (mousePressed) {
    fill (200,200,200) ;
    ellipse (78,200,20,20) ;
    }
}
