package dice;

public class diee {
   
        int min =1;
        int max =6;
        public int diceroll() {
            double ans = Math.random()*(max-min)+min;
            return (int)ans;
        }
    }

