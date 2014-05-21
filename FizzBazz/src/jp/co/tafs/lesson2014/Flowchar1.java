package jp.co.tafs.lesson2014;




class FizzBazz{
	
	
	public void calc(){
		for(int i=1;i<=100;i++){
			if(i%3==0&&i%5==0){
				System.out.println("Fizzbazz");
			}
			else if(i%3==0){
				System.out.println("Fizz");
			}
			else if(i%5==0){
				System.out.println("bazz");
			}
			else{
				System.out.println(i);
			}
		}
		
	}
}
public class Flowchar1 {

	public static void main(String[] args) {
		FizzBazz nabeatu=new FizzBazz();
		nabeatu.calc();
	}
	
}
