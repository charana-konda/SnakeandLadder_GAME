package packa;
import player.play;
import coordinates.coordi;

import java.util.HashMap;

import board.brd;
public class game {
    public static void main(String args[]){
//    play p = new play();
//    p.setdetails("charana","charanak@gmail.com","7032179270");
//    p.getdetails();
//    coordi c = new coordi(5,1);
//    System.out.println(c.getrow());
//   brd b = new brd(10);
//      b.printboard();
  HashMap<String,jumpr> map = new HashMap<>();
          map.put("27",new jumpr(new coordi(8,0),new coordi(5,9)));
          map.put("2",new jumpr(new coordi(9,9),new coordi(5,9)));
          map.put("97",new jumpr(new coordi(1,2),new coordi(0,4)));
          map.put("27",new jumpr(new coordi(8,0),new coordi(5,9)));
          map.put("27",new jumpr(new coordi(8,0),new coordi(5,9)));
          map.put("27",new jumpr(new coordi(8,0),new coordi(5,9)));
}
}
