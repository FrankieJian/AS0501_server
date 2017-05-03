package com.example.g572_528r.as_0501;

import java.util.List;

/**
 * Created by g572-528r on 2017/5/3.
 */

public class AllImgListBean {

    private List<ImgListBean> imgList;

    public List<ImgListBean> getImgList() {
        return imgList;
    }

    public void setImgList(List<ImgListBean> imgList) {
        this.imgList = imgList;
    }

    public static class ImgListBean {
        private int id;
        private String img;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }
    }
}
