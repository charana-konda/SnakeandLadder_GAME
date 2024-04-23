package gam;



    
import board.brd;
import coordinates.coordi;
import dice.diee;
import player.play;

public class gam {
	play[] players;
	coordi[] places;
	brd bd;
	diee dc;
	boolean[] isallow;
	public gam(brd bd,play[] players,	diee dc) {
		this.bd=bd;
		this.dc=dc;
		this.players=players;
	      turn =0;
		isallow=new boolean[players.length];
		places=new coordi[players.length];
		for(int i =0;i<players.length;i++) places[i]=new coordi(bd.getsize()-1,0);
	}
	void play(){
		while(true){
			int n = dc.diceroll();
			System.out.println(players[turn].getname()+"rolled num"+n+places[turn]);
			if(!isallow[turn]){
				if(n!=1){
					turn=1-turn;
					continue;
				}else{
					isallow[turn]=true;
				}

			}
			coordi co = new getcoordi(places[turn], num);

		}
	}
	private coordi getcoordi(coordi old,int num){
		int row = old.getrow();
		int col=old.getcol();
		while(num>0){
			if(row%2!=0){
				if(col==brd.getsize()-1){
					row--;
				} 
				else{
					col--;
				}
			}else{
				if(col==0) row--;
				else col--;

			}
			num--;
		}
       if(row < 0){
		retunn new coordi(row,col);
	   }
	   if(checkifjumprexirs(row,col)){
		jumpr jp= brd.jumpr.get(brd.brd[row][col]);
		return jp.end;
	   }
	   return  new coordi(row,col);
	}
	private boolean checkifjumprexirs(int row, int col){
		return brd.jumpr.containsKey(board.brd[row][col]);
	}

}

}
