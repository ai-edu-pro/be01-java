package quiz.mapEx04;

import java.time.LocalDate;
import java.util.Date;

public class Video {   // model
    private String title,category,lender;
    private LocalDate lendDate;
    private boolean lend;

    public Video(String title,String category){
        this.title=title;
        this.category=category;
        this.lend =false;
        this.lendDate = LocalDate.now();  //
    }
    public Video(){

    }
    public String toString(){
        String temp ="";
        temp+=("title: "+this.title);
        temp+=("\ncategory: "+this.category);
        temp+=("\nlend?: "+this.lend);
        if(lend){
           temp+=("\nlender: "+this.lender);
            temp+=("\nlend Date: "+this.lendDate);
        }
        return temp;
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

    public String getLender() {
        return lender;
    }

    public void setLender(String lender) {
        this.lender = lender;
    }


    public boolean isLend() {
        return lend;
    }

    public void setLend(boolean lend) {
        this.lend = lend;
    }
}
