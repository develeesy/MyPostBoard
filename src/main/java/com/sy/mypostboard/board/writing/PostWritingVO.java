package com.sy.mypostboard.board.writing;

import com.sy.mypostboard.common.BaseWritingVO;

public class PostWritingVO extends BaseWritingVO {
    private String userRegDate;
    private int postCount;
    private int commentCount;
    private long readCount;

    public String getUserRegDate() {
        return userRegDate;
    }

    public void setUserRegDate(String userRegDate) {
        this.userRegDate = userRegDate;
    }

    public int getPostCount() {
        return postCount;
    }

    public void setPostCount(int postCount) {
        this.postCount = postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public long getReadCount() {
        return readCount;
    }

    public void setReadCount(long readCount) {
        this.readCount = readCount;
    }

    @Override
    public String toString() {
        return "PostWritingVO{" +
                "userRegDate='" + userRegDate + '\'' +
                ", postCount=" + postCount +
                ", commentCount=" + commentCount +
                ", readCount=" + readCount +
                '}';
    }
}
