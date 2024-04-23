package coordinates;


    public class coordi {
	
		int row;
		int col;
		public coordi(int row,int col) {
			this.row=row;
			this.col=col;
		}
			public void printcoordi(){
				StringBuilder sd = new StringBuilder();
				sd.append('[').append(this.row).append(",").append(this.col).append(']');
				System.out.println(sd.toString());
			}
			public int getrow() {
				return this.row;
			}
			public int getcol() {
				return this.col;
			}
		}
	

