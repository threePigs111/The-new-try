package MVC.service.impl;

import MVC.POJO.student;
import MVC.dao.studentDao;
import MVC.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class studentServiceimpl implements studentService {
    @Autowired
    private studentDao studentDao;
    @Override
    public List<student> selectAll() {
        return studentDao.selectAll();
    }

    @Override
    public List<student> selectById(int i) {
        return studentDao.selectById(i);
    }

    @Override
    public void transTest() {
        List<student> students=selectAll();
        System.out.println(students.get(0));
        //int i=1/0;
        System.out.println(students.get(1));
    }
}
