package com.desktopWork.bean;

public class Assignment {
//    任务
    private String workName;
//    已完成1/未完成0
    private Integer statue;

    public Assignment() {
    }

    public Assignment(String workName, Integer statue) {
        this.workName = workName;
        this.statue = statue;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public int getStatue() {
        return statue;
    }

    public void setStatue(Integer statue) {
        this.statue = statue;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "workName='" + workName + '\'' +
                ", statue=" + statue +
                '}';
    }
}
