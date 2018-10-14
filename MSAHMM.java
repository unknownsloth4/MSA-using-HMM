public class MSAHMM {
	
	public static void main(String args[]){  
	
	String car[][] = new String[][] {
					{"A", "C", "S", "A"},
					{"A", "S", "T"},
					{"A", "C", "C", "S", "T"}
					};
					
		for (i=0; i<car.length; i++) {
			if (car[i+1].length == car[i].length) {
				continue;
			} else {
				if (car[i+1].length < car[i].length){
					selisih = car[i].length - car[i+1].length;
					flag = 0;
					
					for (i=0; i<car.length; i++) {
						for (j=0; j<car[0].length; j++) {
							if (car.charAt[i][j] == car.charAt[i+1][j]) {
								continue;
							} else {
								String gap = "-";
								str.insert ([i+1][j], gap);
								flag = flag + 1;
							}
							
							if (flag == selisih) {
								break;
							}
						}
					}
				} else {
					if (car[i+1].length > car[i].length) {
						for (i=0; i<car.length; i++) {
							for (j=0; j<car[0].length; j++) {
								if (car.charAt[i][j] == car.charAt[i+1][j])	{
									continue;
								} else {
									for (i=car[0].length; i<car.length; i--) {
										String gap = "-";
										str.insert ([i-1][j], gap);
										flag = flag + 1;
									}
								}
								
								if (flag == selisih) {
									break;
								}
							}	
						}
					}
				}
			}
		}
	}
					
}