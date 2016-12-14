


 public class Cervantes_2D_arraygame {

   public static void main(String []args) {

     char [][] landscape= new char[10][10];

     landscape[1][3] = 'D';
     landscape[7][8] = '2';
     for (int i = 0; i <= landscape[0].length - 1; i++) {

       for (int j = 0; j <= landscape[1].length - 2; j++) {
         if (landscape[i][j] == 0 ) {
           System.out.print("."); }
         else {
           System.out.print(landscape[i][j]);
              }
            }
        System.out.println("|");
        }
      }

      static class Hero{
        //sets values for coordinates in the char
        int s;
        int e;
        int w;
        int n;
        int se;
        int sw;
        int ne;
        int nw;
        int health;

        public Hero(int a, int b, int c, int d, int e, int f, int g,int h, int i){
          s = a;
          e = b;
          w = c;
          n = d;
          se = e;
          sw = f;
          ne = g;
          nw = h;
          health = i;
        }

        //controls north
        void setN(int a){
          this.n= a;
        }
        int getN(){
          return this.n;
        }

        //controls south
        void setS(int a){
          this.s= a;
        }
        int getS(){
          return this.s;
        }

        //controls west
        void setW(int a){
          this.w= a;
        }
        int getW(){
          return this.w;
        }

        //controls east
        void setE(int a){
          this.e= a;
        }
        int getE(){
          return this.e;
        }

        //controls northeast
        void setNE(int a){
          this.ne= a;
        }
        int getNE(){
          return this.ne;
        }

        //controls northwest
        void setNW(int a){
          this.nw = a;
        }
        int getNW(){
          return this.nw;
        }

        //controls southeast
        void setSE(int a){
          this.se = a;
        }
        int getSE(){
          return this.se;
        }

        //controls southwest
        void setSW(int a){
          this.sw= a;
        }
        int getSW(){
          return this.sw;
        }

      }
    }

/*
Beginning with this file
1. Name the file correctly
2. Create a hero/player class --- like student, teacher, hedgehog, or fox
3. Create code to display and move the hero
4. Create an adversary class --- like student, teacher, hedgehog, or fox
5. Create code to display and move the adversary
6. Create hidden 'traps' - use "if, else" to check if the hero intersects a trap
7. READ THE RUBRIC FOR WHAT SHOULD BE ADDED [Don't worry about controlling the character with the keyboard, yet - we'll talk about that on Wednesday]


*/
