import java.util.Date;

public class Score {   
	private String firstName;   
	private String lastName;   
	private int score;   
	private Date playDate;   
	public String getFirstName(){    
		return firstName;   
		}   
	public void setFirstName(String firstName){    
		this.firstName = firstName;   
		}   
	public String getLastName(){    
		return lastName;   
		}   
	public void setLastName(String lastName){    
		this.lastName = lastName;   
		}   
	public int getScore(){    
		return score;   
		}   
	public void setScore(int score){    
		this.score=score;   
		}   
	public Date getPlayDate(){    
		return playDate;   
		}   
	public void setPlayDate(Date playDate){
	this.playDate = playDate;   
		} 
	public String toString(){    
		String scoreString = firstName + " " + lastName + " " +  score + " " + playDate + 
				System.getProperty("line.separator");     
		return scoreString;     
	}
}

