package Assingment4;



public class Main {
	public static void main(String[] args) {
		
		Video vObj=new Video(1234, 2, "jebwjb",34, 2013, "bbgjeork", "Adventure");
		vObj.getName();
		vObj.getGenre();
		vObj.getDirector();
		vObj.getYearOfRelease();
		vObj.getId();
		vObj.getCopy();
		vObj.getRunTime();
		
		System.out.println("---------------------------------------------------------");
		
		CD cd = new CD(2365, 3, "ggtrwer", 54, "Shreya Ghoshal", "hgjhng");
		cd.getName();
		cd.getArtist();
		cd.getGenre();
		cd.getRunTime();
		cd.getId();
		cd.getCopy();
	
		System.out.println("--------------------------------------------------------");
		
	Book b=new Book(3490, 4,"bhagvatgeeta ","abc");
		b.getName();
		b.getAuthor();
		b.getId();
		b.getCopy();
		
		
		System.out.println("--------------------------------------------");
		
	
		JournalPaper jp=new JournalPaper(6476, 7,"gjjfmgn","hhhh", 1687);
		jp.getName();
		jp.getAuthor();
		jp.getYearOfPublish();
		jp.getId();

	

}

}
	