package quiz.mapEx03;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class VideoManager {  // contoller
	
	HashMap<Integer, Video> videoMap = new HashMap<>();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH:mm");

	// 시스템에 새 비디오 삽입.
	public void insert(String title, String cat) {
		Video video = new Video(title, cat);
		videoMap.put(video.getId(), video);
	}

	// 시스템에서 비디오 제거
	public boolean delete(int id) {
		if (!videoMap.containsKey(id))
			return false;
		videoMap.remove(id);
		return true;
	}

	// 특정 비디오 상태를 대여로 변경
	public boolean lend(int id, String lendName) {
		if (!videoMap.containsKey(id))
			return false;
		Video video = videoMap.get(id);
		if (video.isLend()) {
			return false;
		}
		video.setLend(true);
		video.setLendName(lendName);
		video.setLendDate(new Date());
		return true;
	}

	// 특정 비디오 이름과 장르를
	public boolean update(int id, String title, String category) {
		if (!videoMap.containsKey(id))
			return false;
		Video video = videoMap.get(id);
		video.setTitle(title);
		video.setCategory(category);
		return true;
	}

	// 특정 비디오를 반납처리
	public boolean receive(int id) {
		if (!videoMap.containsKey(id))
			return false;
		Video video = videoMap.get(id);
		if (!video.isLend()) {
			return false;
		}
		video.setLend(false);
		video.setLendName(null);
		video.setLendDate(null);
		return true;
	}

	public void show() {
		System.out.println(
				"[비디오 목록]------------------------------------------------------------------------------------------------");
		System.out.printf("%5.5s\t%16.16s\t%16.16s\t%8.8s\t%16.16s\t%16.16s\t\n", "ID", "제목", "카테고리", "대여중", "대여자",
				"대여일");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------");
		for (Video video : videoMap.values()) {
			if (video.isLend()) {
				System.out.printf("%5d\t%16.16s\t%16.16s\t%8.8b\t%16.16s\t%16.16s\t\n", video.getId(), video.getTitle(),
						video.getCategory(), video.isLend(), video.getLendName(),
						dateFormat.format(video.getLendDate()));
			} else {
				System.out.printf("%5d\t%16.16s\t%16.16s\t%8.8b\t%16.16s\t%16.16s\t\n", video.getId(), video.getTitle(),
						video.getCategory(), video.isLend(), "", "");
			}
		}
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------");
	}
}
