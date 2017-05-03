package com.example.g572_528r.as_0501;

import java.util.List;

/**
 * Created by g572-528r on 2017/5/3.
 */

public class AllStudentListBean {
    /**
     * id : 1
     * name : q
     * age : 1
     * sex : q
     * headimg : http://http://192.168.139.96:8080/Student/img/a.jpg
     */

    private List<StuListBean> stuList;

    public List<StuListBean> getStuList() {
        return stuList;
    }

    public void setStuList(List<StuListBean> stuList) {
        this.stuList = stuList;
    }

    public static class StuListBean {
        private int id;
        private String name;
        private int age;
        private String sex;
        private String headimg;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getHeadimg() {
            return headimg;
        }

        public void setHeadimg(String headimg) {
            this.headimg = headimg;
        }
    }
//    private List<StuListBean> stuList;
//
//    public List<StuListBean> getStuList() {
//        return stuList;
//    }
//
//    public void setStuList(List<StuListBean> stuList) {
//        this.stuList = stuList;
//    }
//
//    public static class StuListBean {
//        private int id;
//        private String name;
//        private int age;
//        private String sex;
//        private String headImg;
//
//        public int getId() {
//            return id;
//        }
//
//        public void setId(int id) {
//            this.id = id;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public int getAge() {
//            return age;
//        }
//
//        public void setAge(int age) {
//            this.age = age;
//        }
//
//        public String getSex() {
//            return sex;
//        }
//
//        public void setSex(String sex) {
//            this.sex = sex;
//        }
//
//        public String getHeadImg() {
//            return headImg;
//        }
//
//        public void setHeadImg(String headImg) {
//            this.headImg = headImg;
//        }
//    }


}
