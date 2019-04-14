int b =200;
int b2 =800;
int cheese = 1;
void setup(){
size(1000,1000); 
}
void draw(){
  background(1000,435,556);
    drawRing();
b=b+cheese;
b2=b2-cheese;
if(b==800 && b2==200){
cheese=-cheese; 
}else if(b==200 && b2==800){
cheese=-cheese;
}
}
void drawRing(){
int x = 200; 
int x2 = 200;
  for(int i=0;i<50; i++){
noFill();
ellipse(b,500,x,x);
x=x-15;
noFill();
ellipse(b2,500,x2,x2);
x2=x2-15;
}
}