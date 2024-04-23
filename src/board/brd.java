package board;

    public class brd {
        String[][] bd;
        int size;
        public brd(int size) {
            this.size=size;
            int c =1;
            bd = new String[size][size];
            for(int i =size-1;i>=0;i--) {
                if(i%2!=0) {
                    for(int j =0;j<size;j++) {
                        bd[i][j]=Integer.toString(c);
                        c++;
                    }
                    
                }else {
                    for(int j =size-1;j>=0;j--) {
                        bd[i][j]=Integer.toString(c);
                        c++;
                }
            }
        }
        }
        public void printboard() {
            for(int i =0;i<size;i++) {
                for(int j =0;j<size;j++) {
                    System.out.print(bd[i][j]+" ");
                }
                System.out.println();
            }
    }
        public  int getsize() {
            return this.size;
        }
        
        
    
    }
    

