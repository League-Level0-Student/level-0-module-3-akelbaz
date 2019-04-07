int x = 200; 
int x2 = 200;
int b =200;
int b2 =800;
void setup(){
size(1000,1000);  
for(int i=0;i<30; i++){
noFill();
ellipse(b,500,x,x);
x=x-15;
noFill();
ellipse(b2,500,x2,x2);
x2=x2-15;
}
}
void draw(){
if(b==200 && b2==800){
b++;
b2--;
}else if(b==500 && b2==500){
b--;
b2++;
}
}