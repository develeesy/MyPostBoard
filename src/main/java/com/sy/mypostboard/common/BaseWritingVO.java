package com.sy.mypostboard.common;

public class BaseWritingVO {
    private long id;
    private long userName;
    private String regDate;
    private String editDate;
    private long like;
    private long unlike;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserName() {
        return userName;
    }

    public void setUserName(long userName) {
        this.userName = userName;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getEditDate() {
        return editDate;
    }

    public void setEditDate(String editDate) {
        this.editDate = editDate;
    }

    public long getLike() {
        return like;
    }

    public void setLike(long like) {
        this.like = like;
    }

    public long getUnlike() {
        return unlike;
    }

    public void setUnlike(long unlike) {
        this.unlike = unlike;
    }

    @Override
    public String toString() {
        return "BaseWritingVO{" +
                "id=" + id +
                ", userName=" + userName +
                ", regDate='" + regDate + '\'' +
                ", editDate='" + editDate + '\'' +
                ", like=" + like +
                ", unlike=" + unlike +
                '}';
    }
}
