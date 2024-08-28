package kr.hs.study.springPrj.dto;

import lombok.Data;

@Data
public class scoreDTO {
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int total;
    private double avg;


}
