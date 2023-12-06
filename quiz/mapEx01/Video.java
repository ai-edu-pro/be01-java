package quiz.mapEx01;

import java.util.Date;

public class Video {  // Model
	private String title;
	private String category;
	private boolean lend;
	private String lendName;
	private Date lendDate;
	
	public Video() {
		this.title = "None title";
		this.category = "None category";
		this.lend = false;
		this.lendName = "None lendName";
		this.lendDate = new Date();
	}
	public Video(String title) {
		super();
		this.title = title;
		this.category = "";
		this.lend = false;
		this.lendName = "";
		this.lendDate = new Date();
	}
	public Video(String title, String category) {
		super();
		this.title = title;
		this.category = category;
		this.lend = false;
		this.lendName = "";
		this.lendDate = new Date();
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public boolean isLend() {
		return lend;
	}
	public void setLend(boolean lend) {
		this.lend = lend;
	}
	public String getLendName() {
		return lendName;
	}
	public void setLendName(String lendName) {
		this.lendName = lendName;
	}
	public Date getLendDate() {
		return lendDate;
	}
	public void setLendDate(Date lendDate) {
		this.lendDate = lendDate;
	}
	
//	@Override
//	public int hashCode() {  // 키값 비교할때 사용하려다가 사용 안함.
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((title == null) ? 0 : title.hashCode());
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {  // 키값 비교할때 사용하려다가 사용 안함.
//		Video other = (Video) obj;
//		if (!title.equals(other.title))
//			return false;
//		return true;
//	}	
}
