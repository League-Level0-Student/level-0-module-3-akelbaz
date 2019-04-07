int x = 160; 
void setup(){
size(500,500);  
for(int i=0;i<8; i++){
if(i%2==0){
fill(#FF0505);
}else{
fill(#080000);
}
ellipse(250,250,x,x);
x=x-20;
}
}

void draw(){
}  