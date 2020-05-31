package service.impl;

import dao.ProvinceDao;
import dao.impl.ProvinceDaoImpl;
import domain.Province;
import service.ProvinceService;

import java.util.List;

public class ProvinceServiceImpl implements ProvinceService {
    // 声明dao
    private ProvinceDao dao = new ProvinceDaoImpl();
    @Override
    public List<Province> findAll() {
        return dao.findAll();
    }
}
