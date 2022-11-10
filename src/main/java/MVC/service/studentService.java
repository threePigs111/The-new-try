package MVC.service;

import MVC.POJO.student;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

public interface studentService {
    List<student> selectAll();
    List<student> selectById( int i);
    @Transactional
    public void transTest();
}
