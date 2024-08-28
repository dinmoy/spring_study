package kr.hs.study.springPrj.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class memoDTO {
    private int id;
    private String writer;
    private String contents;
    private Timestamp regDate;
}
