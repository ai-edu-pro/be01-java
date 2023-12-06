package quiz.mapEx03;

import java.util.Date;

public class Video {  // model
	private String title;// 중복된 비디오가 여러 개 있을 수 있음
	private String category;
	private boolean lend;
	private String lendName;
	private Date lendDate;
	private final int id;// 바꿀수 없음
	private static int count = 0;

	// 새 비디오를 추가.
	public Video(String title, String category) {
		this.title = title;
		this.category = category;
		this.lend = false;
		this.lendName = null;
		this.lendDate = null;
		this.id = ++count;
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

	public int getId() {
		return id;
	}
}
