package jumpr;

import coordinates.coordi;
   
    public class jmpr {
        coordi start;
        coordi end;
        String name;
        public jmpr(coordi start,coordi  end) {
            this.start=start;
            this.end = end;
            if(start.getcol()>end.getcol())this.name="Ladder";
            else this.name="Snake";
            
        }
        public void getjumprname() {
            System.out.println(this.name);
        }
    
    }

