void setup(){
size(1000,1000);
}
void draw(){
  int flute = 10;
for(int i=99;i>0;i--){
text(i + "bottles of beer on the wall," + i + "bottles of beer.Take one down and pass it around" + (i-1) + "bottles of beer on the wall.",10,flute);
flute=flute+10;
}
}