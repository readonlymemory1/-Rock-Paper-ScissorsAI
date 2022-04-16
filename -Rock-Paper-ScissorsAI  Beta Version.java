import java.util.Scanner;
import java.util.Random;

public class Main{
	public static void main(String args[]){
		while(true) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int s = 0;//가위
		int r = 0;//주먹
		int p = 0;//보
		int w = 0;//반복횟수
		int ran = 0;//ai랜덤
		String a;
		System.out.printf("%d[가위, 바위, 보]중 하나를 적으세요\n>>", r+s+p);
		a = scan.nextLine();
		
		if(a.equals("가위")) {
			s++;
			ran = random.nextInt(2);
			if(ran == 0) {
				System.out.println("가위");
				System.out.println("You draw");
			
			}
			if(ran == 1) {
				System.out.println("바위");
				System.out.println("You lose");
			}
			if(ran == 2) {
				System.out.println("보");
				System.out.println("you win");
			}
		}
		if(a.equals("바위")) {
			r++;
			ran = random.nextInt(2);
			if(ran == 0) {
				System.out.println("가위");
				System.out.println("You win");
			
			}
			if(ran == 1) {
				System.out.println("바위");
				System.out.println("You draw");
			}
			if(ran == 2) {
				System.out.println("보");
				System.out.println("you lose");
			}
		}
		if(a.equals("보")) {
			p++;
			ran = random.nextInt(2);
			if(ran == 0) {
				System.out.println("가위");
				System.out.println("You lose");
			
			}
			if(ran == 1) {
				System.out.println("바위");
				System.out.println("You win");
			}
			if(ran == 2) {
				System.out.println("보");
				System.out.println("you draw");
			}
		}
		if(a.equals("가위")) {
			s++;
			ran = random.nextInt(2);
			if(ran == 0) {
				System.out.println("가위");
				System.out.println("You draw");
			
			}
			if(ran == 1) {
				System.out.println("바위");
				System.out.println("You lose");
			}
			if(ran == 2) {
				System.out.println("qh");
				System.out.println("you win");
			}
		}
		if(a.equals("바위")) {
			r++;
			ran = random.nextInt(2);
			if(ran == 0) {
				System.out.println("가위");
				System.out.println("You win");
			
			}
			if(ran == 1) {
				System.out.println("바위");
				System.out.println("You draw");
			}
			if(ran == 2) {
				System.out.println("보");
				System.out.println("you lose");
			}
		}
		if(a.equals("보")) {
			p++;
			ran = random.nextInt(2);
			if(ran == 0) {
				System.out.println("가위");
				System.out.println("You lose");
			
			}
			if(ran == 1) {
				System.out.println("바위");
				System.out.println("You win");
			}
			if(ran == 2) {
				System.out.println("보");
				System.out.println("you draw");
			}
		}
		
		while(w == 6) {																																																																																																																																																																																																																		
			if(a.equals("가위")) {
				s++;
				
				if(p > s) {
					if(r < s) {
						System.out.println("가위");
						System.out.println("You draw");														
				
					}
				}
				if(s > r) {
					if(p < r) {
						System.out.println("바위");
						System.out.println("You lose");
					}
				}
				if(r > p) {
					if(s < p) {
						System.out.println("보");
						System.out.println("you win");
					}
				}
			}
			if(a.equals("바위")) {
				r++;
				if(p > s) {
					if(r < s) {
						System.out.println("가위");
						System.out.println("You win");														
				
					}
				}
				if(s > r) {
					if(p < r) {
						System.out.println("바위");
						System.out.println("You draw");
					}
				}
				if(r > p) {
					if(s < p) {
						System.out.println("보");
						System.out.println("you lose");
					}
				}
			}
			if(a.equals("보")) {
				p++;
				if(p > s) {
					if(r < s) {
						System.out.println("가위");
						System.out.println("You lose");														
				
					}
				}
				if(s > r) {
					if(p < r) {
						System.out.println("바위");
						System.out.println("You win");
					}
				}
				if(r > p) {
					if(s < p) {
						System.out.println("보");
						System.out.println("you draw");
					}
				}
			}
		}
		
	}
	}
}
