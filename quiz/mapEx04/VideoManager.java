package quiz.mapEx04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class VideoManager extends Video {  // controller
	
    HashMap<Integer, Video> VideoDB;
    Scanner sc;
    int adminId=201612873;
    int adminPwd = 1234;
    
    public VideoManager(){
        VideoDB = new HashMap<Integer,Video>();
        sc = new Scanner(System.in);
    }
    
    public void addVideo(String title, String category){ // add
        int videoId = title.hashCode();
        Video newVideo  = new Video(title,category);
        VideoDB.put(videoId,newVideo);
    }
    public void delVideo(String title){   // remove
        VideoDB.remove(title.hashCode());
    }

    public void printList(){   // print - get or iterator
    	if( VideoDB.size() == 0 ) {
    		System.out.println(VideoDB.size() + "개 보여줄 비디오가 없습니다.");
    		return; 
    	}
        Iterator it = VideoDB.values().iterator();
    
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
    }

    public void modVideo(String oldTitle){  // set
    	
        if(VideoDB.size()!=0){
            System.out.println("input new title");
            String newTitle = sc.next();
            System.out.println("input new category");
            String newCategory = sc.next();
            VideoDB.remove(oldTitle.hashCode());
            addVideo(newTitle,newCategory);

        }else{
            System.out.println("video가 없습니다");
        }
    }

}
