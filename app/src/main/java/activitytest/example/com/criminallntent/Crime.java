package activitytest.example.com.criminallntent;

import java.util.UUID;
import java.util.Date;

/**
 * Created by Administrator on 2017/6/25 0025.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private String mSuspect;




    public Crime(){
        this(UUID.randomUUID());
        //mId=UUID.randomUUID();//生成唯一id
        //mDate=new Date();
    }
    public Crime(UUID id){
        mId=id;
        mDate=new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }

    public String getPhotoFilename(){
        return "IMG_" +getId().toString()+".jpg";
    }
}
