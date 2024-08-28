package kr.hs.study.springPrj.dao;

import kr.hs.study.springPrj.dto.memoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface memoMapper {

    public void insert(memoDTO dto);
    public void update(memoDTO dto);
    public void delete(int id);
    public List<memoDTO> selectAll();
}
