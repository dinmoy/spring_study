package kr.hs.study.springPrj.service;

import kr.hs.study.springPrj.dao.memoMapper;
import kr.hs.study.springPrj.dto.memoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class memoServiceImpl implements memoService{
    @Autowired
    private memoMapper mapper;

    @Override
    public void insert(memoDTO dto) {
            mapper.insert(dto);
    }

    @Override
    public void update(memoDTO dto) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<memoDTO> selectAll() {
        return mapper.selectAll();
    }
}
