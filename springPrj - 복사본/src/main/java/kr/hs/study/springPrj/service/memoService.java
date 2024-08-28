package kr.hs.study.springPrj.service;

import kr.hs.study.springPrj.dto.memoDTO;

import java.util.List;

public interface memoService {
    //insert
    public void insert(memoDTO dto);
    //update
    public void update(memoDTO dto);
    //delete
    public void delete(int id);
    //select
    public List<memoDTO> selectAll();

}
